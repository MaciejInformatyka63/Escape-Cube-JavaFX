package modele.gestion;

import modele.metier.Positions;

import java.util.List;

import static java.lang.Math.abs;

public class ComparateurPos {
    public Positions posPlusProche(Positions pos1, List<Positions> lesPos) {
        /*
        Le choix de la variable y1 ou x1 est arbitraire,
        l'algorithme fonctionne tant que l'on compare des "positions équivalentes" (x1 avec x1 ou x2 avec x2...)

        Pour le premier "if", il y a deux cas :
            -   le carré se déplace sur l'axe x
            -   le carré se déplace sur l'axe y
        Pour le second "if", on compare des valeurs absolues qui correspondent à l'écart entre la position actuelle et future
        du carré, il ya deux positions futures qui correspondent aux positions données par les deux types de collisionneur(ColMur et ColBtn)

        Le but de la méthode est de rendre la position future la plus proche de la position actuelle (pour éviter de traverser des murs par exemple...)
         */
        if (pos1.getPosy1() == lesPos.get(0).getPosy1()) {
            if(abs(pos1.getPosx1() - lesPos.get(0).getPosx1()) > abs(pos1.getPosx1() - lesPos.get(1).getPosx1())) {
                return lesPos.get(1);
            }
            else
                return lesPos.get(0);
        }
        else {
            if (abs(pos1.getPosy1() - lesPos.get(0).getPosy1()) > abs(pos1.getPosy1() - lesPos.get(1).getPosy1())) {
                return lesPos.get(1);
            } else
                return lesPos.get(0);
        }
    }
}
