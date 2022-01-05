package modele.gestion;

import modele.metier.Element;
import modele.metier.Positions;

import java.util.ArrayList;
import java.util.List;

public class DeplaceurCarre extends Deplaceur{

    public DeplaceurCarre() {
        super.LesCollisionneurs = new ArrayList<>();
    }

    public void addCollMur (CollisionneurMur cm) {
        super.LesCollisionneurs.add(cm);
    }

    public boolean deplacer() {

        switch (d) {
            case 'h':
                if (e.getP().getPosy1() > posFinales.getPosy1()) {
                    e.setP(new Positions(e.getP().getPosx1(), e.getP().getPosx2(), e.getP().getPosy1() - v, e.getP().getPosy2() - v));
                    return true;
                }
                e.setP(posFinales);
                return false;

            case 'b':
                if (e.getP().getPosy1() < posFinales.getPosy1()) {
                    e.setP(new Positions(e.getP().getPosx1(), e.getP().getPosx2(), e.getP().getPosy1() + v, e.getP().getPosy2() + v));
                    return true;
                }
                e.setP(posFinales);
                return false;

            case 'g':
                if (e.getP().getPosx1() > posFinales.getPosx1()) {
                    e.setP(new Positions(e.getP().getPosx1() - v, e.getP().getPosx2() - v, e.getP().getPosy1(), e.getP().getPosy2()));
                    return true;
                }
                e.setP(posFinales);
                return false;

            case 'd':
                if (e.getP().getPosx1() < posFinales.getPosx1()) {
                    e.setP(new Positions(e.getP().getPosx1() + v, e.getP().getPosx2() + v, e.getP().getPosy1(), e.getP().getPosy2()));
                    return true;
                }
                e.setP(posFinales);
                return false;

            default:
                return false;
        }
    }
}
