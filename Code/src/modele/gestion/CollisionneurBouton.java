package modele.gestion;

import modele.metier.*;

import java.util.Iterator;

public class CollisionneurBouton extends Collisionneur{

    @Override
    public Positions Collision(Element e, char d, Niveau niv) {
        Bouton b;
        Positions posfin= e.getP();
        switch (d) {
            case 'h' :
                for (Iterator<Bouton> m = niv.getLesBoutons().iterator(); m.hasNext(); ) {
                    b = m.next();
                    if (e.getP().getPosx1()==b.getP().getPosx1() && e.getP().getPosy1()>b.getP().getPosy1()) {
                        posfin=b.getP();
                    }
                }
                break;

            case 'b' :
                for (Iterator<Bouton> m = niv.getLesBoutons().iterator(); m.hasNext(); ) {
                    b = m.next();
                    if (e.getP().getPosx1()==b.getP().getPosx1() && e.getP().getPosy1()<b.getP().getPosy1()) {
                        posfin=b.getP();
                    }
                }
                break;

            case 'g' :
                for (Iterator<Bouton> m = niv.getLesBoutons().iterator(); m.hasNext(); ) {
                    b = m.next();
                    if (e.getP().getPosy1()==b.getP().getPosy1() && e.getP().getPosx1()>b.getP().getPosx1()) {
                        posfin=b.getP();
                    }
                }
                break;

            case 'd' :

                for (Iterator<Bouton> m = niv.getLesBoutons().iterator(); m.hasNext(); ) {
                    b = m.next();
                    if (e.getP().getPosy1()==b.getP().getPosy1() && e.getP().getPosx1()<b.getP().getPosx1()) {
                        posfin=b.getP();
                    }
                }
                break;
        }
        return posfin;
    }
}
