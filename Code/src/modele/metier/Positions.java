package modele.metier;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.ReadOnlyIntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;

public class Positions {
    private IntegerProperty posx1 = new SimpleIntegerProperty();
    public int getPosx1(){return posx1.get();}
    public void setPosx1(int posx1) {this.posx1.set(posx1);}
    public ReadOnlyIntegerProperty posx1Property (){return posx1;}

    private IntegerProperty posx2 = new SimpleIntegerProperty();
    public int getPosx2(){return posx2.get();}
    public void setPosx2(int posx2) {this.posx2.set(posx2);}
    public ReadOnlyIntegerProperty posx2Property (){return posx2;}

    private IntegerProperty posy1 = new SimpleIntegerProperty();
    public int getPosy1(){return posy1.get();}
    public void setPosy1(int posy1) {this.posy1.set(posy1);}
    public ReadOnlyIntegerProperty posy1Property (){return posy1;}

    private IntegerProperty posy2 = new SimpleIntegerProperty();
    public int getPosy2(){return posy2.get();}
    public void setPosy2(int posy2) {this.posy2.set(posy2);}
    public ReadOnlyIntegerProperty posy2Property (){return posy2;}


    public Positions(int posx1, int posx2, int posy1, int posy2) {
        this.setPosx1(posx1);
        this.setPosx2(posx2);
        this.setPosy1(posy1);
        this.setPosy2(posy2);
    }
}
