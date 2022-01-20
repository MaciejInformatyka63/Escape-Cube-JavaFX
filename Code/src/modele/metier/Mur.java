package modele.metier;

/**
 * Classe représentant un Mur dans un Niveau
 */
public abstract class Mur extends Element {
    /**
     * Constructeur de la classe Mur
     * @param p Positions du mur
     */
    public Mur(Positions p){
        super(p);
    }
}
