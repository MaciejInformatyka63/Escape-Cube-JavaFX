package modele.gestion;

import modele.metier.*;

import java.util.Iterator;

public class GestionSortieConcrete extends GestionSortie{

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

    @Override
    public void ouvrirSortie(Niveau n) {
        boolean bo = true;
        for (Iterator<Bouton> b = n.getLesBoutons().iterator(); b.hasNext();){
            if (b.next().isAppuyé()==false)
                bo=false;
        }
        n.getSortie().setOuvert(true);
    }
}
