package modele.gestion;

import modele.metier.Element;
import modele.metier.Positions;

import java.util.List;

public abstract class Deplaceur {
    public List<Collisionneur> LesCollisionneurs;

    public abstract void deplacer(Element e, char d, int v, Positions posFinales);
}
