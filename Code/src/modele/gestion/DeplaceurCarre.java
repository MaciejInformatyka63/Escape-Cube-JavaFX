package modele.gestion;

import modele.metier.Positions;
import view.gestion.ManagerVue;

public class DeplaceurCarre extends Deplaceur{

    public void deplacer() {
        switch (super.getD()) {
            case 'h':
                if (super.getE().getP().getPosy1() > super.getPosFinales().getPosy1()) {
                    super.getE().setP(new Positions(super.getE().getP().getPosx1(), super.getE().getP().getPosx2(), super.getE().getP().getPosy1() - super.getV(), super.getE().getP().getPosy2() - super.getV()));
                }
                else {
                    super.getE().setP(getPosFinales());
                    ManagerVue.getM().finMouvement();
                }
            case 'b':
                if (super.getE().getP().getPosy1() < super.getPosFinales().getPosy1()) {
                    super.getE().setP(new Positions(super.getE().getP().getPosx1(), super.getE().getP().getPosx2(), super.getE().getP().getPosy1() + super.getV(), super.getE().getP().getPosy2() + super.getV()));
                }
                else {
                    super.getE().setP(getPosFinales());
                    detacherChrono(super.cf);
                    ManagerVue.getM().finMouvement();
                }
            case 'g':
                if (super.getE().getP().getPosx1() > super.getPosFinales().getPosx1()) {
                    super.getE().setP(new Positions(super.getE().getP().getPosx1() - super.getV(), super.getE().getP().getPosx2() - super.getV(), super.getE().getP().getPosy1(), super.getE().getP().getPosy2()));
                }
                else {
                    super.getE().setP(getPosFinales());
                    ManagerVue.getM().finMouvement();
                }
            case 'd':
                if (super.getE().getP().getPosx1() < super.getPosFinales().getPosx1()) {
                    super.getE().setP(new Positions(super.getE().getP().getPosx1() + super.getV(), super.getE().getP().getPosx2() + super.getV(), super.getE().getP().getPosy1(), super.getE().getP().getPosy2()));
                }
                else {
                    super.getE().setP(getPosFinales());
                    ManagerVue.getM().finMouvement();
                }
            default:
                ManagerVue.getM().finMouvement();
        }
    }
}
