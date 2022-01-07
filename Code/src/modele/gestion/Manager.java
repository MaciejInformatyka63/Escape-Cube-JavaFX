package modele.gestion;
import modele.chronos.ChronoRefresh;
import modele.chronos.ChronoRefreshConcret;
import modele.metier.*;

import java.util.ArrayList;
import java.util.List;

public class Manager {
    private Monde monde;
    Niveau niveauEnCours;
    private int indiceNiveauEnCours;
    private Sortie sortie;
    private CarreJoueur cj;
    private DeplaceurCarre deplaceur;
    private CollisionneurMur colM;
    private CollisionneurBouton colB;
    private List<Collisionneur> lesCollisionneurs;
    private Positions posFin;
    private ComparateurPos cpp;
    private GestionSortieConcrete gsc;
    private boolean mvmtEnCours;

    private ChronoRefresh chronoRefresh;

    public Manager(){

        mvmtEnCours=false;
        Monde m =loadmonde();
        startJeu(m);
    }

    public Monde loadmonde(){
        return new Monde();
    }

    public void startJeu(Monde m) {
        chronoRefresh=new ChronoRefreshConcret();
        Thread t = new Thread (chronoRefresh);
        t.start();
        deplaceur = new DeplaceurCarre();
        colM = new CollisionneurMur();
        colB = new CollisionneurBouton();
        cpp = new ComparateurPos();
        gsc = new GestionSortieConcrete();
        lesCollisionneurs.add(colM);
        lesCollisionneurs.add(colB);
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
                lesPos.add(col.Collision(cj, 'h'/*A remplacer par la direction correspondant à la touche*/, niveauEnCours));
            }
            posFin = cpp.posPlusProche(cj.getP(), lesPos);
            deplaceur.setE(cj);
            deplaceur.setD('h');
            deplaceur.setPosFinales(posFin);
            deplaceur.attacherChrono(chronoRefresh);
            deplaceur.deplacer();
        }
    }

    public void finMouvement(){
        mvmtEnCours=false;
        gsc.ouvrirSortie(niveauEnCours);
        if(gsc.sortieElem(niveauEnCours, cj, 'h'/*A remplacer par la direction correspondant à la touche*/)) {
            indiceNiveauEnCours=indiceNiveauEnCours+1;
            startNiveau(monde.getLesNiveaux().get(indiceNiveauEnCours));
        }
    }
}
