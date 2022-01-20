package modele.metier;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe contenant tous les niveaux du jeu
 */
public class Monde {
    private List<Niveau> lesNiveaux;

    /**
     * Constructeur de la classe MOnde
     */
    public Monde() {
        lesNiveaux = new ArrayList<>();
    }

    /**
     * Méthode permettant d'ajouter un niveau au monde
     * @param n Niveau à ajouter
     */
    public void addNiveau (Niveau n){
        lesNiveaux.add(n);
    }

    /**
     * getter de l'attribut lesNiveaux
     * @return Liste des niveaux du monde
     */
    public List<Niveau> getLesNiveaux(){return lesNiveaux;}
}
