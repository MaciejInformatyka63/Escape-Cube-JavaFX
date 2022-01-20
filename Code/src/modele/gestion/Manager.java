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

    /**
     * Constructeur du Manager qui crée tous les éléments nécessaires au jeu comme le monde ou les touches, avant de lancer le jeu
     */
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

    /**
     * getter de l'attribut indiceNiveauEnCours
     * @return attribut indiceNiveauEnCours
     */
    public int getIndiceNiveauEnCours() {return indiceNiveauEnCours;}
    /**
     * getter de l'attribut niveauEnCours
     * @return attribut niveauEnCours
     */
    public Niveau getNiveauEnCours() {return niveauEnCours;}

    /**
     * Méthode qui fait appel à un chargeur pour obtenir un monde
     * @return Monde chargé par le chargeur
     */
    public Monde loadmonde(){
        Chargeur c = new Stub();
        return c.loadMonde();
    }

    /**
     * Méthode qui instancie tout le nécessaire pour commencer le jeu, dont la boucle de raffraichissement, les déplaceurs et les collisionneurs, avant de récupérer le premier niveau du monde
     * @param m Monde dans lequel sont stockés les niveaux
     */
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

    /**
     * Méthode qui lance un niveau via le ManagerVue
     */
    public void startNiveau(){
        ManagerVue.lancerNiveau();
    }

    /**
     * Méthode qui permet de traiter une touche appuyée, pour faire les actions correspondantes
     * si c'est une touche de déplacement, faire le déplacement correspondant
     * si c'est la touche pour appuyer sur le bouton, appuyer sur ledit bouton
     * @param e
     */
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
                    if(!b.isAppuye()) {
                        b.setAppuye(true);
                        gsc.ouvrirSortie(niveauEnCours);
                    }
                }
            }
        }
    }

    /**
     * Méthode qui permet d'arrêter le mouvement, et qui vérifie si le carréjoueur peut sortir du niveau
     */
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

    /**
     * Méthode lançant la fin du jeu, en chargeant l'écran de fin via le ManagerVue
     */
    public void finJeu(){
        ManagerVue.chargerFin();
    }
}
