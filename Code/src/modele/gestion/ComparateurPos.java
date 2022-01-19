package modele.gestion;

import modele.metier.Positions;

import java.util.List;

import static java.lang.Math.abs;

public class ComparateurPos {
    public Positions posPlusProche(List<Positions> lesPosCol, char d) {
        Positions posfin = null;
        /*
        Le choix de la variable y1 ou x1 est arbitraire,
        l'algorithme fonctionne tant que l'on compare des "positions équivalentes" (x1 avec x1 ou x2 avec x2...)

        Pour le premier "if", il y a deux cas :
            -   le carré se déplace sur l'axe x
            -   le carré se déplace sur l'axe y
        Pour le second "if", on compare des valeurs absolues qui correspondent à l'écart entre la position actuelle et future
        du carré, il ya deux positions futures qui correspondent aux positions données par les deux types de collisionneur(ColMur et ColBtn)

        Le but de la méthode est de rendre la plus proche des deux positions futures par rapport à la position actuelle
        (pour éviter de traverser des murs par exemple...)
         */
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
