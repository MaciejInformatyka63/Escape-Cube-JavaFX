package modele.gestion;

import modele.metier.Positions;

import java.util.List;

import static java.lang.Math.abs;

public class ComparateurPos {
    public Positions posPlusProche(Positions posCj, List<Positions> lesPosCol, char d) {
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

                case 'b' :
                    if (abs(posCj.getPosy1() - lesPosCol.get(i).getPosy1()) > abs(posCj.getPosy1() - lesPosCol.get(i+1).getPosy1()))
                        return lesPosCol.get(i+1);
                    else
                        return lesPosCol.get(i);

                case 'g' :

                case 'd' :
                    if(abs(posCj.getPosx1() - lesPosCol.get(i).getPosx1()) > abs(posCj.getPosx1() - lesPosCol.get(i+1).getPosx1()))
                        return lesPosCol.get(i+1);
                    else
                        return lesPosCol.get(i);
            }
        }
    }
}
