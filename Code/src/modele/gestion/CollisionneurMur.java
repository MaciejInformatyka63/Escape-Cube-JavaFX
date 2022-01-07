package modele.gestion;

import modele.metier.Element;
import modele.metier.Mur;
import modele.metier.Niveau;
import modele.metier.Positions;

public class CollisionneurMur extends Collisionneur {

    /*
    La variable changer permet de savoir la valeur par laquelle on doit changer la position

    Ce que font les 'if' :
        Ce premier vérifie si notre carré est bel et bien sur le chemin d'une collision avec le mur que l'on vérifie
        Le deuxième vérifie si le mur que l'on regarde est le plus proche du carré dans cette direction
        changer prend la valeur de la position liée au sens de déplacement
        Enfin, on retourne les positions modifiées de l'élément à retourner
     */

    @Override
    public Positions Collision(Element e, char d, Niveau niv) {
        int changer;
        Mur mur;
        switch (d) {

            case 'h' :
                changer=0;
                for (Mur value : niv.getLesMurs()) {
                    mur = value;
                    if ((mur.getP().getPosx1() < e.getP().getPosx2() && e.getP().getPosx1() < mur.getP().getPosx2())
                            || (mur.getP().getPosx2() > e.getP().getPosx1() && e.getP().getPosx2() > mur.getP().getPosx1())) {
                        if (mur.getP().getPosy2() > changer && mur.getP().getPosy2() < e.getP().getPosy1()) {
                            changer = mur.getP().getPosy2();
                        }
                    }
                }
                return new Positions(e.getP().getPosx1(),e.getP().getPosx2(),changer,changer+(e.getP().getPosy2()-e.getP().getPosy1()));

            case 'b' :
                changer=10000;
                for (Mur item : niv.getLesMurs()) {
                    mur = item;
                    if ((mur.getP().getPosx1() < e.getP().getPosx2() && e.getP().getPosx1() < mur.getP().getPosx2())
                            || (mur.getP().getPosx2() > e.getP().getPosx1() && e.getP().getPosx2() > mur.getP().getPosx1())) {
                        if (mur.getP().getPosy1() < changer && mur.getP().getPosy1() > e.getP().getPosy2()) {
                            changer = mur.getP().getPosy1();
                        }
                    }
                }
                return new Positions(e.getP().getPosx1(),e.getP().getPosx2(),changer-(e.getP().getPosy2()-e.getP().getPosy1()),changer);

            case 'g' :
                changer=0;
                for (Mur value : niv.getLesMurs()) {
                    mur = value;
                    if ((mur.getP().getPosy1() < e.getP().getPosy2() && e.getP().getPosy1() < mur.getP().getPosy2())
                            || (mur.getP().getPosy2() > e.getP().getPosy1() && e.getP().getPosy2() > mur.getP().getPosy1())) {
                        if (mur.getP().getPosx2() > changer && mur.getP().getPosx2() < e.getP().getPosx1()) {
                            changer = mur.getP().getPosx2();
                        }
                    }
                }
                return new Positions(changer,changer+(e.getP().getPosx2()-e.getP().getPosx1()),e.getP().getPosy1(),e.getP().getPosy2());

            case 'd' :
                changer=100000;
                for (Mur value : niv.getLesMurs()) {
                    mur = value;
                    if ((mur.getP().getPosy1() < e.getP().getPosy2() && e.getP().getPosy1() < mur.getP().getPosy2())
                            || (mur.getP().getPosy2() > e.getP().getPosy1() && e.getP().getPosy2() > mur.getP().getPosy1())) {
                        if (mur.getP().getPosx1() < changer && mur.getP().getPosx1() > e.getP().getPosx2()) {
                            changer = mur.getP().getPosx1();
                        }
                    }
                }
                return new Positions(changer-(e.getP().getPosx2()-e.getP().getPosx1()),changer,e.getP().getPosy1(),e.getP().getPosy2());

            default :
                return e.getP();
        }
    }
}
