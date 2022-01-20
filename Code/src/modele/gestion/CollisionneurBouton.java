package modele.gestion;

import modele.metier.Bouton;
import modele.metier.Element;
import modele.metier.Niveau;
import modele.metier.Positions;

/**
 * Classe permettant de gérer les collisions entre des éléments et des boutons dans un niveau.
 */
public class CollisionneurBouton implements Collisionneur{

    /**
     * Méthode retournant la position du bouton le plus proche dans la direction sélectionnée, position à laquelle l'élément doit arriver
     * @param e Element qui se déplace
     * @param d Direction dans laquelle l'élément se déplace
     * @param niv Niveau dans lequel l'élément se déplace
     * @return Position du bouton le plus proche (null si aucun)
     */
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

    /**
     * Méthode permettant de savoir si un element se trouve sur un bouton
     * @param e Element dont on veut savoir s'il est sur un bouton
     * @param n Niveau dans lequel la vérification se fait
     * @return Bouton sur lequel se trouve l'élément, null si aucun
     */
    public Bouton surBouton(Element e, Niveau n) {
        for (Bouton b : n.getLesBoutons()) {
            if(e.getP().getPosx1()==b.getP().getPosx1() && e.getP().getPosy1()==b.getP().getPosy1()) {
                return b;
            }
        }

        return null;

    }
}
