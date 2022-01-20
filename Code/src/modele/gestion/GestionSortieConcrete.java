package modele.gestion;

import modele.metier.Bouton;
import modele.metier.Element;
import modele.metier.Niveau;
import modele.metier.Sortie;

public class GestionSortieConcrete implements GestionSortie{

    /**
     * Méthode qui permet de faire sortir l'élément si la sortie d'un niveau est ouverte et qu'il se déplace vers cette dernière
     * @param n niveau duquel on veut faire sortir l'élément
     * @param e élément à faire sortir
     * @param d direction dans laquelle l'élément se déplace
     * @return boolean a true si l'élément peut sortir, false sinon
     */
    @Override
    public boolean sortieElem(Niveau n, Element e, char d) {
        Sortie s = n.getSortie();
        if(s.isOuvert()) {
            switch (d){
                case 'h':
                    if (e.getP().getPosy1()==s.getP().getPosy2() && e.getP().getPosx1()==s.getP().getPosx1()){
                        return true;
                    }
                    break;

                case 'b' :
                    if (e.getP().getPosy2()==s.getP().getPosy1() && e.getP().getPosx1()==s.getP().getPosx1()){
                        return true;
                    }
                    break;

                case 'd' :
                    if (e.getP().getPosx2()==s.getP().getPosx1() && e.getP().getPosy1()==s.getP().getPosy1()) {
                        return true;
                    }
                    break;

                case 'g' :
                    if (e.getP().getPosx1()==s.getP().getPosx2() && e.getP().getPosy1()==s.getP().getPosy1()) {
                        return true;
                    }
                    break;
            }

        }
        return false;
    }

    /**
     * Méthode qui vérifie tout les boutons du niveau pour savoir s'il faut ouvrir ou fermer la sortie.
     * @param n niveau dont on veut ouvrir la sortie
     */
    @Override
    public void ouvrirSortie(Niveau n) {
        boolean bo = true;
        for (Bouton bouton : n.getLesBoutons()) {
            if (!bouton.isAppuye()) {
                bo = false;
                break;
            }
        }
        n.getSortie().setOuvert(bo);
    }
}
