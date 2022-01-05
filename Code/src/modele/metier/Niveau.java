package modele.metier;

import javafx.beans.property.ObjectProperty;
import javafx.beans.property.ReadOnlyObjectProperty;
import javafx.beans.property.SimpleObjectProperty;

import java.util.ArrayList;
import java.util.List;

public class Niveau {
    private List<Mur> lesMurs;
    private List<Bouton> lesBoutons;
    private Sortie sortie;

    public Niveau(Sortie sortie) {
        lesMurs=new ArrayList<>();
        lesBoutons=new ArrayList<>();
        this.sortie=sortie;
    }

    public Sortie getSortie() {return sortie;}
    public void setSortie(Sortie val) {sortie = val;}

    public void addMur (Mur m){
        lesMurs.add(m);
    }
    public List<Mur> getLesMurs() {return lesMurs;}

    public void addBouton (Bouton b) {lesBoutons.add(b);}
    public List<Bouton> getLesBoutons () {return lesBoutons;}
}
