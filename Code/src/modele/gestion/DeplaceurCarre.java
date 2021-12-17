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

    public void deplacer(Element cj, char d, int v, Positions posFinales) {

        switch (d) {
            case 'h':
                while (cj.getP().getPosy1() > posFinales.getPosy1()) {
                    cj.setP(new Positions(cj.getP().getPosx1(), cj.getP().getPosx2(), cj.getP().getPosy1() - v, cj.getP().getPosy2() - v));
                }
                cj.setP(posFinales);
                break;

            case 'b':
                while (cj.getP().getPosy1() < posFinales.getPosy1()) {
                    cj.setP(new Positions(cj.getP().getPosx1(), cj.getP().getPosx2(), cj.getP().getPosy1() + v, cj.getP().getPosy2() + v));
                }
                cj.setP(posFinales);
                break;

            case 'g':
                while (cj.getP().getPosx1() > posFinales.getPosx1()) {
                    cj.setP(new Positions(cj.getP().getPosx1() - v, cj.getP().getPosx2() - v, cj.getP().getPosy1(), cj.getP().getPosy2()));
                }
                cj.setP(posFinales);
                break;

            case 'd':
                while (cj.getP().getPosx1() < posFinales.getPosx1()) {
                    cj.setP(new Positions(cj.getP().getPosx1() + v, cj.getP().getPosx2() + v, cj.getP().getPosy1(), cj.getP().getPosy2()));
                }
                cj.setP(posFinales);
                break;
        }
    }
}
