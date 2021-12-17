package modele.gestion;

import modele.metier.Bouton;
import modele.metier.Element;
import modele.metier.Niveau;
import modele.metier.Positions;

public class CollisionneurBouton extends Collisionneur{

    @Override
    public Positions Collision(Element e, char d, Niveau niv) {
        Bouton b;
        switch (d) {
            case 'h' :
                break;

            case 'b' :
                break;

            case 'g' :
                break;

            case 'd' :
                break;
        }
        return e.getP();
    }
}
