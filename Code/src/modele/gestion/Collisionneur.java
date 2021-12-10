package modele.gestion;

import modele.métier.Element;
import modele.métier.Niveau;
import modele.métier.Positions;

public abstract class Collisionneur {

    public abstract Positions Collision (Element e, char d, Niveau niv);
}
