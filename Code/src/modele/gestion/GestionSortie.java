package modele.gestion;

import modele.metier.Element;
import modele.metier.Niveau;

/**
 * Interface permettant de gérer les actions en lien avec la Srtie d'un Niveau
 */
public interface GestionSortie {

    /**
     * Méthode qui permet de faire sortir un élément d'un niveau
     * @param n niveau duquel on veut faire sortir l'élément
     * @param e élément à faire sortir
     * @param d direction dans laquelle l'élément se déplace
     * @return boolean a true si l'élément peut sortir, false sinon
     */
    boolean sortieElem(Niveau n, Element e, char d);

    /**
     * Méthode qui permet d'ouvrir une sortie d'un niveau
     * @param n niveau dont on veut ouvrir la sortie
     */
    void ouvrirSortie (Niveau n);
}
