package modele.chronos;

import modele.gestion.Deplaceur;

import java.util.ArrayList;
import java.util.List;

public abstract class ChronoRefresh extends Chrono{

    private List<Deplaceur> lesDeplaceurs;
    public ChronoRefresh(){
        lesDeplaceurs=new ArrayList<>();
    }

    public List<Deplaceur> getLesDeplaceurs() {return lesDeplaceurs;}
    public void addDeplaceur (Deplaceur d){lesDeplaceurs.add(d);}
    public void delDeplaceur (Deplaceur d){lesDeplaceurs.remove(d);}
}
