package modele.gestion;

import modele.metier.Element;
import modele.metier.Niveau;
import modele.metier.Positions;

public interface Collisionneur {

    Positions Collision (Element e, char d, Niveau niv);
}
