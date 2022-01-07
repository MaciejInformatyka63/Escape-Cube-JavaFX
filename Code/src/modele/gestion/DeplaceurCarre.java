package modele.gestion;

import modele.metier.Positions;

import java.util.ArrayList;

public class DeplaceurCarre extends Deplaceur{

    public boolean deplacer() {

        switch (super.getD()) {
            case 'h':
                if (super.getE().getP().getPosy1() > super.getPosFinales().getPosy1()) {
                    super.getE().setP(new Positions(super.getE().getP().getPosx1(), super.getE().getP().getPosx2(), super.getE().getP().getPosy1() - super.getV(), super.getE().getP().getPosy2() - super.getV()));
                    return true;
                }
                else {
                    super.getE().setP(getPosFinales());
                    return false;
                }
            case 'b':
                if (super.getE().getP().getPosy1() < getPosFinales().getPosy1()) {
                    super.getE().setP(new Positions(super.getE().getP().getPosx1(), super.getE().getP().getPosx2(), super.getE().getP().getPosy1() + super.getV(), super.getE().getP().getPosy2() + super.getV()));
                    return true;
                }
                else {
                    super.getE().setP(getPosFinales());
                    return false;
                }
            case 'g':
                if (super.getE().getP().getPosx1() > getPosFinales().getPosx1()) {
                    super.getE().setP(new Positions(super.getE().getP().getPosx1() - super.getV(), super.getE().getP().getPosx2() - super.getV(), super.getE().getP().getPosy1(), super.getE().getP().getPosy2()));
                    return true;
                }
                else {
                    super.getE().setP(getPosFinales());
                    return false;
                }
            case 'd':
                if (super.getE().getP().getPosx1() < getPosFinales().getPosx1()) {
                    super.getE().setP(new Positions(super.getE().getP().getPosx1() + super.getV(), super.getE().getP().getPosx2() + super.getV(), super.getE().getP().getPosy1(), super.getE().getP().getPosy2()));
                    return true;
                }
                else {
                    super.getE().setP(getPosFinales());
                    return false;
                }
            default:
                return false;
        }
    }
}
