package modele;

import javafx.beans.property.ObjectProperty;
import javafx.beans.property.ReadOnlyObjectProperty;
import javafx.beans.property.SimpleObjectProperty;

public abstract class Element {
    protected ObjectProperty<Positions> p = new SimpleObjectProperty<Positions>();
    public Positions getP() {return p.get();}
    public void setP(Positions val) {p.set(val);}
    public ReadOnlyObjectProperty<Positions> pProperty() {return p;}
}
