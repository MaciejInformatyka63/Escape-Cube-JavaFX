package modele.gestion;

import modele.métier.Element;
import modele.métier.Positions;

public abstract class Deplaceur {
    public abstract void deplacer(Element e, char d, int v, Positions posFinales);
}
