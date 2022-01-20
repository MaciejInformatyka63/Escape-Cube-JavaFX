package modele.gestion;

import modele.metier.Element;
import modele.metier.Niveau;
import modele.metier.Positions;

public interface Collisionneur {
    /**
     * Méthode permettant de savoir si une collision va se produire, et, si oui, où elle se fait.
     * @param e Element qui se déplace
     * @param d Direction dans laquelle l'élément se déplace
     * @param niv Niveau dans lequel l'élément se déplace
     * @return Positions auxquelles la collision se produit, null si pas de collisions
     */
    Positions Collision (Element e, char d, Niveau niv);
}
