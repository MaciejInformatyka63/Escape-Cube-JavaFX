package modele.metier;

import javafx.beans.property.BooleanProperty;
import javafx.beans.property.ReadOnlyBooleanProperty;
import javafx.beans.property.SimpleBooleanProperty;

public class Sortie extends Element{
    private boolean ouvert;
    public Sortie(Positions p){
        super(p);
        ouvert=false;
    }


    public boolean isOuvert() {return ouvert;}
    public void setOuvert(boolean val) {ouvert=val;}
}
