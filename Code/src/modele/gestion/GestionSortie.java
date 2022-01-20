package modele.gestion;

import modele.metier.Element;
import modele.metier.Niveau;

public interface GestionSortie {
    boolean sortieElem(Niveau n, Element e, char d);
    void ouvrirSortie (Niveau n);
}
