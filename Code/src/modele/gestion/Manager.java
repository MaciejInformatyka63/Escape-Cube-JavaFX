package modele.gestion;
import modele.chronos.ChronoRefresh;
import modele.chronos.ChronoRefreshConcret;
import modele.metier.*;

import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Manager {
    private Monde monde;
    private Niveau niveauEnCours;
    private int indiceNiveauEnCours;
    int vitesse;
    private KeyEvent toucheAppuiBouton;
    private Map<KeyEvent,Character> touchesDeplacement;
    private DeplaceurCarre deplaceur;
    private List<Collisionneur> lesCollisionneurs;
    private Positions posFin;
    private ComparateurPos cpp;
    private GestionSortieConcrete gsc;
    private boolean mvmtEnCours;

    private ChronoRefresh chronoRefresh;

    public Manager(){
        vitesse = 10;
        mvmtEnCours=false;
        lesCollisionneurs = new ArrayList<>();
        monde =loadmonde();
        startJeu(monde);
    }

    public Monde loadmonde(){
        return new Monde();
    }

    public void startJeu(Monde m) {
        chronoRefresh=new ChronoRefreshConcret();
        Thread t = new Thread (chronoRefresh);
        t.start();
        deplaceur = new DeplaceurCarre();
        cpp = new ComparateurPos();
        gsc = new GestionSortieConcrete();
        lesCollisionneurs.add(new CollisionneurMur());
        lesCollisionneurs.add(new CollisionneurBouton());
        indiceNiveauEnCours =0;
        niveauEnCours = m.getLesNiveaux().get(indiceNiveauEnCours);
        startNiveau(niveauEnCours);
    }

    public void startNiveau(Niveau n){

    }

    public void traiterTouche(KeyEvent e){
        List<Positions> lesPos = new ArrayList<>();
        if(touchesDeplacement.containsKey(e) && !mvmtEnCours) {
            char d = touchesDeplacement.get(e);
            mvmtEnCours=true;
            for (Collisionneur col : lesCollisionneurs) {
                lesPos.add(col.Collision(niveauEnCours.getCarreJoueur(), d, niveauEnCours));
            }
            posFin = cpp.posPlusProche(lesPos,d);
            deplaceur.setE(niveauEnCours.getCarreJoueur());
            deplaceur.setD(d);
            deplaceur.setPosFinales(posFin);
            deplaceur.setV(vitesse);
            deplaceur.attacherChrono(chronoRefresh);
            deplaceur.deplacer();
        }
    }

    public void finMouvement(){
        mvmtEnCours=false;
        gsc.ouvrirSortie(niveauEnCours);
        if(gsc.sortieElem(niveauEnCours, niveauEnCours.getCarreJoueur(), 'h'/*A remplacer par la direction correspondant à la touche*/)) {
            indiceNiveauEnCours=indiceNiveauEnCours+1;
            startNiveau(monde.getLesNiveaux().get(indiceNiveauEnCours));
        }
    }
}
