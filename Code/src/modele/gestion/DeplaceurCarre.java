package modele.gestion;

import view.gestion.ManagerVue;

public class DeplaceurCarre extends Deplaceur{

    public void deplacer() {
        switch (super.getD()) {
            case 'h':
                if (super.getE().getP().getPosy1() > super.getPosFinales().getPosy1()) {
                    super.getE().getP().setPosy1(super.getE().getP().getPosy1() - super.getV());
                    super.getE().getP().setPosy2(super.getE().getP().getPosy2() - super.getV());
                }

                else {
                    super.getE().setP(getPosFinales());
                    ManagerVue.getM().finMouvement();
                }
                break;
            case 'b':
                if (super.getE().getP().getPosy1() < super.getPosFinales().getPosy1()) {
                    super.getE().getP().setPosy1(super.getE().getP().getPosy1() + super.getV());
                    super.getE().getP().setPosy2(super.getE().getP().getPosy2() + super.getV());
                }

                else {
                    super.getE().setP(getPosFinales());
                    ManagerVue.getM().finMouvement();
                }
                break;
            case 'g':
                if (super.getE().getP().getPosx1() > super.getPosFinales().getPosx1()) {
                    super.getE().getP().setPosx1(super.getE().getP().getPosx1() - super.getV());
                    super.getE().getP().setPosx2(super.getE().getP().getPosx2() - super.getV());
                }
                else {
                    super.getE().setP(getPosFinales());
                    ManagerVue.getM().finMouvement();
                }
                break;
            case 'd':
                if (super.getE().getP().getPosx1() < super.getPosFinales().getPosx1()) {
                    super.getE().getP().setPosx1(super.getE().getP().getPosx1() + super.getV());
                    super.getE().getP().setPosx2(super.getE().getP().getPosx2() + super.getV());
                }
                else {
                    super.getE().setP(getPosFinales());
                    ManagerVue.getM().finMouvement();
                }
                break;
        }
    }
}
