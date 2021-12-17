package modele.metier;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.ReadOnlyDoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;

public class CarreJoueur extends Element {
    private Positions p;

    public CarreJoueur(Positions p) {
        super(p);
    }
}
