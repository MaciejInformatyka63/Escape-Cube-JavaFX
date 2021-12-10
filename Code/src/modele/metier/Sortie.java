package modele.metier;

import javafx.beans.property.BooleanProperty;
import javafx.beans.property.ReadOnlyBooleanProperty;
import javafx.beans.property.SimpleBooleanProperty;

public class Sortie extends Element{
    private BooleanProperty ouvert = new SimpleBooleanProperty();
    public boolean getOuvert() {return ouvert.get();}
    public void setOuvert(boolean val) {ouvert.set(val);}
    public ReadOnlyBooleanProperty ouvertProperty() {return ouvert;}

    public Sortie(Positions p){
        super(p);
    }
}
