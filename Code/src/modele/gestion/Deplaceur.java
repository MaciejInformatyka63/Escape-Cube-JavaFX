package modele.gestion;

import modele.metier.Element;
import modele.metier.Positions;

public abstract class Deplaceur {
    public abstract void deplacer(Element e, char d, int v, Positions posFinales);
}
