package modele.métier;

import javafx.beans.property.ObjectProperty;
import javafx.beans.property.ReadOnlyObjectProperty;
import javafx.beans.property.SimpleObjectProperty;

import java.util.ArrayList;
import java.util.List;

public class Niveau {
    public List<Mur> lesMurs;

    private ObjectProperty<Sortie> sortie = new SimpleObjectProperty<Sortie>();
    public Sortie getSortie() {return sortie.get();}
    public void setSortie(Sortie val) {sortie.set(val);}
    public ReadOnlyObjectProperty<Sortie> sortieProperty() {return sortie;}

    public Niveau() {
        lesMurs=new ArrayList<>();
    }

    public void addMur (Mur m){
        lesMurs.add(m);
    }
}
