package modele.gestion;

import view.gestion.ManagerVue;

/**
 * Classe permettant de déplacer un CarréJoueur dans un niveau
 */
public class DeplaceurCarre extends Deplaceur{

    /**
     * Méthode déplaçant un carré joueur en fonction de la vitesse,ainsi que des positions finales et de la direction qui sont en attribut du Deplaceur.
     * Cette méthode ne fait qu'un déplacement de distance v, le chrono le fait se reproduire
     */
    public void deplacer() {
        switch (d) {
            case 'h':
                if (e.getP().getPosy1() > posFinales.getPosy1()) {
                    e.getP().setPosy1(e.getP().getPosy1() - v);
                    e.getP().setPosy2(e.getP().getPosy2() - v);
                }

                else {
                    e.setP(getPosFinales());
                    ManagerVue.getM().finMouvement();
                }
                break;
            case 'b':
                if (e.getP().getPosy1() < posFinales.getPosy1()) {
                    e.getP().setPosy1(e.getP().getPosy1() + v);
                    e.getP().setPosy2(e.getP().getPosy2() + v);
                }

                else {
                    e.setP(getPosFinales());
                    ManagerVue.getM().finMouvement();
                }
                break;
            case 'g':
                if (e.getP().getPosx1() > posFinales.getPosx1()) {
                    e.getP().setPosx1(e.getP().getPosx1() - v);
                    e.getP().setPosx2(e.getP().getPosx2() - v);
                }
                else {
                    e.setP(getPosFinales());
                    ManagerVue.getM().finMouvement();
                }
                break;
            case 'd':
                if (e.getP().getPosx1() < posFinales.getPosx1()) {
                    e.getP().setPosx1(e.getP().getPosx1() + v);
                    e.getP().setPosx2(e.getP().getPosx2() + v);
                }
                else {
                    e.setP(getPosFinales());
                    ManagerVue.getM().finMouvement();
                }
                break;
        }
    }
}
