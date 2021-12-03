package modele;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CollisionneurMur extends Collisionneur{

    private List<Mur> lesMurs;

    public CollisionneurMur() {
        lesMurs=new ArrayList<>();
    }

    public void addMur (Mur m){
        lesMurs.add(m);
    }

    /*
    La variable changer permet de savoir la valeur par laquelle on doit changer la position

    Ce que font les 'if' :
        Ce premier vérifie si notre carré est bel et bien sur le chemin d'une collision avec le mur que l'on vérifie
        Le deuxième vérifie si le mur que l'on regarde est le plus proche du carré dans cette direction
        changer prend la valeur de la position liée au sens de déplacement
        Enfin, on retourne les positions modifiées de l'élément à retourner
     */

    @Override
    public Positions Collision(Element e, char d) {
        int changer;
        switch (d) {

            case 'h' :
                changer=0;
                for (Iterator<Mur> m = lesMurs.iterator(); m.hasNext();){
                    if ((m.next().getP().getPosx1() < e.getP().getPosx2() && e.getP().getPosx1() < m.next().getP().getPosx2())
                            || (m.next().getP().getPosx2() > e.getP().getPosx1() && e.getP().getPosx2() > m.next().getP().getPosx1())) {
                        if (m.next().getP().getPosy2() > changer && m.next().getP().getPosy2() < e.getP().getPosy1()){
                            changer=m.next().getP().getPosy2();
                        }
                    }
                }
                return new Positions(e.getP().getPosx1(),e.getP().getPosx2(),changer,changer+(e.getP().getPosy2()-e.getP().getPosy1()));

            case 'b' :
                changer=0;
                for (Iterator<Mur> m = lesMurs.iterator(); m.hasNext();){
                    if ((m.next().getP().getPosx1() < e.getP().getPosx2() && e.getP().getPosx1() < m.next().getP().getPosx2())
                            || (m.next().getP().getPosx2() > e.getP().getPosx1() && e.getP().getPosx2() > m.next().getP().getPosx1())) {
                        if (m.next().getP().getPosy1() > changer && m.next().getP().getPosy1() > e.getP().getPosy2()){
                            changer=m.next().getP().getPosy1();
                        }
                    }
                }
                return new Positions(e.getP().getPosx1(),e.getP().getPosx2(),changer-(e.getP().getPosy2()-e.getP().getPosy1()),changer);

            case 'g' :
                changer=0;
                for (Iterator<Mur> m = lesMurs.iterator(); m.hasNext();){
                    if ((m.next().getP().getPosy1() < e.getP().getPosy2() && e.getP().getPosy1() < m.next().getP().getPosy2())
                            || (m.next().getP().getPosy2() > e.getP().getPosy1() && e.getP().getPosy2() > m.next().getP().getPosy1())) {
                        if (m.next().getP().getPosx2() > changer && m.next().getP().getPosx2() < e.getP().getPosx1()){
                            changer=m.next().getP().getPosx2();
                        }
                    }
                }
                return new Positions(changer,changer+(e.getP().getPosx2()-e.getP().getPosx1()),e.getP().getPosy1(),e.getP().getPosy2());

            case 'd' :
                changer=0;
                for (Iterator<Mur> m = lesMurs.iterator(); m.hasNext();){
                    if ((m.next().getP().getPosy1() < e.getP().getPosy2() && e.getP().getPosy1() < m.next().getP().getPosy2())
                            || (m.next().getP().getPosy2() > e.getP().getPosy1() && e.getP().getPosy2() > m.next().getP().getPosy1())) {
                        if (m.next().getP().getPosx1() < changer && m.next().getP().getPosx1() > e.getP().getPosx2()){
                            changer=m.next().getP().getPosx1();
                        }
                    }
                }
                return new Positions(changer-(e.getP().getPosx2()-e.getP().getPosx1()),changer,e.getP().getPosy1(),e.getP().getPosy2());

            default :
                return e.getP();
        }
    }
}
