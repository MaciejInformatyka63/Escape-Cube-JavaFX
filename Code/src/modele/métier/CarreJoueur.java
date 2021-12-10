package modele.métier;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.ReadOnlyDoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;

public class CarreJoueur extends Element {
    private Positions p;

    private DoubleProperty dp = new SimpleDoubleProperty();
    public Double getDp() {return dp.get();}
    public void setDp(double val) {dp.set(val);}
    public ReadOnlyDoubleProperty dpProperty(){return dp;}

    public CarreJoueur(Positions p,double dou) {
        super(p);
        setDp(dou);
    }
}
