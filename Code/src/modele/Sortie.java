package modele;

import javafx.beans.property.BooleanProperty;
import javafx.beans.property.SimpleBooleanProperty;

public class Sortie extends Element{
    private BooleanProperty ouvert = new SimpleBooleanProperty();
    public boolean getOuvert() {return ouvert.get();}
    public void setOuvert(boolean val) {ouvert.set(val);}
}
