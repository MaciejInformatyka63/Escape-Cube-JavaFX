package modele.metier;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.ReadOnlyIntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;

public class Positions {

    private IntegerProperty posx1 = new SimpleIntegerProperty();

        /**
         * Getter de l'attribut posx1
         * @return valeur de l'attribut posx1
         */
        public int getPosx1(){return posx1.get();}

        /**
         * Setter de l'attribut posx1
         * @param posx1 nouvelle valeur de l'attribut posx1
         */
        public void setPosx1(int posx1) {this.posx1.set(posx1);}

        /**
         * Propriété qui encapsule l'attribut posx1
         * @return Propriété posx1
         */
        public ReadOnlyIntegerProperty posx1Property (){return posx1;}

    private IntegerProperty posx2 = new SimpleIntegerProperty();

        /**
         * Getter de l'attribut posx2
         * @return valeur de l'attribut posx2
         */

        public int getPosx2(){return posx2.get();}
        /**
         * Setter de l'attribut posx2
         * @param posx2 nouvelle valeur de l'attribut posx2
         */
        public void setPosx2(int posx2) {this.posx2.set(posx2);}

        /**
         * Propriété qui encapsule l'attribut posx2
         * @return Propriété posx2
         */
        public ReadOnlyIntegerProperty posx2Property (){return posx2;}

    private IntegerProperty posy1 = new SimpleIntegerProperty();

        /**
         * Getter de l'attribut posy1
         * @return valeur de l'attribut posy1
         */
        public int getPosy1(){return posy1.get();}

        /**
         * Setter de l'attribut posy1
         * @param posy1 nouvelle valeur de l'attribut posy1
         */
        public void setPosy1(int posy1) {this.posy1.set(posy1);}

        /**
         * Propriété qui encapsule l'attribut posy1
         * @return Propriété posy1
         */
        public ReadOnlyIntegerProperty posy1Property (){return posy1;}

    private IntegerProperty posy2 = new SimpleIntegerProperty();

        /**
         * Getter de l'attribut posy2
         * @return valeur de l'attribut posy2
         */
        public int getPosy2(){return posy2.get();}

        /**
         * Setter de l'attribut posy2
         * @param posy2 nouvelle valeur de l'attribut posy2
         */
        public void setPosy2(int posy2) {this.posy2.set(posy2);}

        /**
         * Propriété qui encapsule l'attribut posy2
         * @return Propriété posy2
         */
        public ReadOnlyIntegerProperty posy2Property (){return posy2;}


    /**
     * Constructeur de la classe Positions
     * @param posx1 position de l'extrémité gauche
     * @param posx2 position de l'extrémité droite
     * @param posy1 position de l'extrémité haute
     * @param posy2 position de l'extrémité basse
     */
    public Positions(int posx1, int posx2, int posy1, int posy2) {
        this.setPosx1(posx1);
        this.setPosx2(posx2);
        this.setPosy1(posy1);
        this.setPosy2(posy2);
    }

}
