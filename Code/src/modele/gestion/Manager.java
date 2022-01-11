package modele.gestion;
import modele.chronos.ChronoRefresh;
import modele.chronos.ChronoRefreshConcret;
import modele.metier.*;

import java.util.ArrayList;
import java.util.List;

public class Manager {
    private Monde monde;
    private Niveau niveauEnCours;
    private int indiceNiveauEnCours;
    int vitesse;
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

    public void traiterTouche() {
        List<Positions> lesPos = new ArrayList<>();
        if(/*La touche est une touche de mouvement &&*/!mvmtEnCours) {
            mvmtEnCours=true;
            for (Collisionneur col : lesCollisionneurs) {
                lesPos.add(col.Collision(niveauEnCours.getCarreJoueur(), 'h'/*A remplacer par la direction correspondant à la touche*/, niveauEnCours));
            }
            posFin = cpp.posPlusProche(niveauEnCours.getCarreJoueur().getP(), lesPos);
            deplaceur.setE(niveauEnCours.getCarreJoueur());
            deplaceur.setD('h');
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
