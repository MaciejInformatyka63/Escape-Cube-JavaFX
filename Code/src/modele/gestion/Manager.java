package modele.gestion;
import data.Chargeur;
import data.Stub;
import javafx.scene.input.KeyCode;
import modele.chronos.ChronoRefresh;
import modele.chronos.ChronoRefreshConcret;
import modele.metier.*;
import view.gestion.ManagerVue;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Manager {
    private Monde monde;
    private Niveau niveauEnCours;
    private int indiceNiveauEnCours;
    private int vitesse;
    private KeyCode toucheAppuiBouton;
    private Map<KeyCode,Character> touchesDeplacement;
    private DeplaceurCarre deplaceur;
    private CollisionneurBouton cb;
    private List<Collisionneur> lesCollisionneurs;
    private Positions posFin;
    private ComparateurPos cpp;
    private GestionSortieConcrete gsc;
    private boolean mvmtEnCours;
    private char d;

    private ChronoRefresh chronoRefresh;

    public Manager(){
        vitesse = 5;
        mvmtEnCours=false;
        lesCollisionneurs = new ArrayList<>();
        touchesDeplacement = new TreeMap<>();
        touchesDeplacement.put(KeyCode.Z,'h');
        touchesDeplacement.put(KeyCode.Q,'g');
        touchesDeplacement.put(KeyCode.S,'b');
        touchesDeplacement.put(KeyCode.D,'d');
        toucheAppuiBouton=KeyCode.SPACE;
        monde =loadmonde();
        startJeu(monde);
    }

    public int getIndiceNiveauEnCours() {
        return indiceNiveauEnCours;
    }
    public Niveau getNiveauEnCours() {
        return niveauEnCours;
    }

    public Monde loadmonde(){
        Chargeur c = new Stub();
        return c.loadMonde();
    }

    public void startJeu(Monde m) {
        chronoRefresh=new ChronoRefreshConcret();
        Thread t = new Thread (chronoRefresh);
        t.start();
        deplaceur = new DeplaceurCarre();
        deplaceur.attacherChrono(chronoRefresh);
        cpp = new ComparateurPos();
        gsc = new GestionSortieConcrete();
        lesCollisionneurs.add(new CollisionneurMur());
        cb=new CollisionneurBouton();
        lesCollisionneurs.add(cb);
        indiceNiveauEnCours =0;
        niveauEnCours = m.getLesNiveaux().get(indiceNiveauEnCours);
    }


    public void startNiveau(){
        ManagerVue.lancerNiveau();
    }


    public void traiterTouche(KeyCode e){
        List<Positions> lesPos = new ArrayList<>();
        if(!mvmtEnCours) {
            if (touchesDeplacement.containsKey(e)) {
                d = touchesDeplacement.get(e);
                mvmtEnCours = true;
                for (Collisionneur col : lesCollisionneurs) {
                    lesPos.add(col.Collision(niveauEnCours.getCarreJoueur(), d, niveauEnCours));
                }
                posFin = cpp.posPlusProche(lesPos, d);
                deplaceur.setE(niveauEnCours.getCarreJoueur());
                deplaceur.setD(d);
                deplaceur.setPosFinales(posFin);
                deplaceur.setV(vitesse);
                deplaceur.deplacer();

            } else if (e.equals(toucheAppuiBouton)) {
                Bouton b = cb.surBouton(niveauEnCours.getCarreJoueur(),niveauEnCours);
                if (b!=null){
                    b.setAppuye(!b.isAppuye());
                    gsc.ouvrirSortie(niveauEnCours);

                }
            }
        }
    }

    public void finMouvement(){
        mvmtEnCours=false;
        gsc.ouvrirSortie(niveauEnCours);
        if(gsc.sortieElem(niveauEnCours, niveauEnCours.getCarreJoueur(), d/*A remplacer par la direction correspondant à la touche*/)) {
            indiceNiveauEnCours=indiceNiveauEnCours+1;
            if(indiceNiveauEnCours<monde.getLesNiveaux().size()) {
                niveauEnCours=monde.getLesNiveaux().get(indiceNiveauEnCours);
                startNiveau();
            }
            else {
                finJeu();
            }
        }
    }

    public void finJeu(){
        ManagerVue.chargerFin();
    }
}
