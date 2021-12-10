package modele.gestion;

import modele.metier.Element;
import modele.metier.Niveau;
import modele.metier.Positions;

public abstract class Collisionneur {

    public abstract Positions Collision (Element e, char d, Niveau niv);
}
