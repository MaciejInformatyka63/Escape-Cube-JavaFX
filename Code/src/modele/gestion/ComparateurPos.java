package modele.gestion;

import modele.metier.Positions;

import java.util.List;

import static java.lang.Math.abs;

/**
 * Classe permettant de comparer des positions
 */
public class ComparateurPos {
    /**
     * Permet de comparer des positions afin de savoir laquelle se trouve la plus proche dans une direction donnée
     * @param lesPosCol Liste des positions à comparer
     * @param d direction dans laquelle les comparer
     * @return Positions les plus proches.
     */
    public Positions posPlusProche(List<Positions> lesPosCol, char d) {
        Positions posfin = null;
        for(int i=0;i<lesPosCol.size()-1;i++) {
            switch (d) {
                case 'h' :
                    for (Positions p : lesPosCol) {
                        if (posfin==null){
                            posfin=p;
                        }

                        else if (p!= null) {
                            if (posfin.getPosy2() < p.getPosy2()) {
                                posfin = p;
                            }
                        }
                    }
                    break;

                case 'b' :
                    for (Positions p : lesPosCol) {
                        if (posfin==null){
                            posfin=p;
                        }
                        else if (p!= null) {
                            if (posfin.getPosy1() > p.getPosy1()) {
                                posfin = p;
                            }
                        }
                    }
                    break;


                case 'g' :

                    for (Positions p : lesPosCol) {
                        if (posfin==null){
                            posfin=p;
                        }
                        else if (p!= null) {
                            if (posfin.getPosx2() < p.getPosx2()) {
                                posfin = p;
                            }
                        }
                    }
                    break;

                case 'd' :

                    for (Positions p : lesPosCol) {
                        if (posfin==null){
                            posfin=p;
                        }
                        else if (p!= null) {
                            if (posfin.getPosx1() > p.getPosx1()) {
                                posfin = p;
                            }
                        }
                    }
                    break;
            }
        }
        return posfin;
    }
}
