package modele.metier;

import java.util.ArrayList;
import java.util.List;


/**
 * Classe contenant tous les éléments d'un niveau, soient les murs, les boutons, le carré du joueur et la sortie
 */
public class Niveau {
    private List<Mur> lesMurs;
    private List<Bouton> lesBoutons;
    private Sortie sortie;
    private CarreJoueur carreJoueur;

    /**
     * Constructeur de la classe Niveau
     */
    public Niveau() {
        lesMurs=new ArrayList<>();
        lesBoutons=new ArrayList<>();
    }

    /**
     * getter de l'attribut Sortie
     * @return attribut sortie
     */
    public Sortie getSortie() {return sortie;}

    /**
     * Setter de l'attribut Sortie
     * @param val nouvelle valeur de l'attribut sortie
     */
    public void setSortie(Sortie val) {sortie = val;}

    /**
     * Méthode permettant d'ajouter un Mur à la liste de murs du niveau
     * @param m Mur à ajouter
     */
    public void addMur (Mur m){
        lesMurs.add(m);
    }

    /**
     * Getter de l'attribut lesMurs
     * @return attribut lesMurs
     */
    public List<Mur> getLesMurs() {return lesMurs;}

    /**
     * Méthode permettant d'ajouter un Bouton à la liste des boutons du Niveau
     * @param b Bouton à ajouter
     */
    public void addBouton (Bouton b) {lesBoutons.add(b);}

    /**
     * Getter de l'attribut lesBoutons
     * @return attribut lesBoutons
     */
    public List<Bouton> getLesBoutons () {return lesBoutons;}

    /**
     * Getter de l'attribut carreJoueur
     * @return attribut carreJoueur
     */
    public CarreJoueur getCarreJoueur() {return carreJoueur;}

    /**
     * Setter de l'attribut carreJoueur
     * @param carreJoueur nouvelle valeur de l'attribut carreJoueur
     */
    public void setCarreJoueur(CarreJoueur carreJoueur) {this.carreJoueur = carreJoueur;}

}
