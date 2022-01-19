package modele.metier;

import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.scene.paint.Color;

public class Sortie extends Element{
    private boolean ouvert;

    private ObjectProperty<Color> c;
        public Color getC() {return c.get();}
        public void setC(Color c) {this.c.set(c);}
        public ObjectProperty<Color> cProperty() {return c;}

    public Sortie(Positions p){
        super(p);
        c=new SimpleObjectProperty<>();
        setC(Color.GRAY);
        ouvert=false;
    }

    public boolean isOuvert() {return ouvert;}
    public void setOuvert(boolean val) {
        if(val) setC(Color.WHITE);
        else setC(Color.GRAY);
        ouvert=val;}
}
