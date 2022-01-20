package modele.metier;

import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.scene.paint.Color;


/**
 * Classe représentant la sortie d'un niveau
 */
public class Sortie extends Element{
    private boolean ouvert;

    private ObjectProperty<Color> c;

        /**
         * Getter de l'attribut c
         * @return valeur de l'attribut c
         */
        public Color getC() {return c.get();}

        /**
         * setter de l'attribut c
         * @param c nouvelle valeur de c
         */
        public void setC(Color c) {this.c.set(c);}

        /**
         * Propriété qui encapsule l'attribut c
         * @return Propriété c
         */
        public ObjectProperty<Color> cProperty() {return c;}

    /**
     * Contructeur de la classe Sortie
     * @param p Positions de la Sortie
     */
    public Sortie(Positions p){
        super(p);
        c=new SimpleObjectProperty<>();
        setC(Color.GRAY);
        ouvert=false;
    }

    /**
     * Getter de l'attribut ouvert
     * @return attribut ouvert
     */
    public boolean isOuvert() {return ouvert;}

    /**
     * Setter de l'attribut ouvert qui change la couleur en fonction de la valeur passée
     * @param val nouvelle valeur de ouvert
     */
    public void setOuvert(boolean val) {
        if(val) setC(Color.WHITE);
        else setC(Color.GRAY);
        ouvert=val;}
}
