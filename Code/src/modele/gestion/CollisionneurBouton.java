package modele.gestion;

import modele.metier.Bouton;
import modele.metier.Element;
import modele.metier.Niveau;
import modele.metier.Positions;

public class CollisionneurBouton extends Collisionneur{

    @Override
    public Positions Collision(Element e, char d, Niveau niv) {
        Bouton b;
        Positions posfin= null;
        switch (d) {
            case 'h' :
                for (Bouton bouton : niv.getLesBoutons()) {
                    b = bouton;
                    if (e.getP().getPosx1() == b.getP().getPosx1() && e.getP().getPosy1() > b.getP().getPosy1()) {
                        posfin = b.getP();
                    }
                }
                break;

            case 'b' :
                for (Bouton bouton : niv.getLesBoutons()) {
                    b = bouton;
                    if (e.getP().getPosx1() == b.getP().getPosx1() && e.getP().getPosy1() < b.getP().getPosy1()) {
                        posfin = b.getP();
                    }
                }
                break;

            case 'g' :
                for (Bouton bouton : niv.getLesBoutons()) {
                    b = bouton;
                    if (e.getP().getPosy1() == b.getP().getPosy1() && e.getP().getPosx1() > b.getP().getPosx1()) {
                        posfin = b.getP();
                    }
                }
                break;

            case 'd' :

                for (Bouton bouton : niv.getLesBoutons()) {
                    b = bouton;
                    if (e.getP().getPosy1() == b.getP().getPosy1() && e.getP().getPosx1() < b.getP().getPosx1()) {
                        posfin = b.getP();
                    }
                }
                break;
        }
        return posfin;
    }

    public Bouton surBouton(Element e, Niveau n) {
        for (Bouton b : n.getLesBoutons()) {
            if(e.getP().getPosx1()==b.getP().getPosx1() && e.getP().getPosy1()==b.getP().getPosy1()) {
                return b;
            }
        }

        return null;

    }
}
