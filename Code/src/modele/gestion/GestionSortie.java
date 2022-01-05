package modele.gestion;

import modele.metier.Element;
import modele.metier.Niveau;

public abstract class GestionSortie {
    public abstract boolean sortieElem(Niveau n, Element e, char d);
    public abstract void ouvrirSortie (Niveau n);
}
