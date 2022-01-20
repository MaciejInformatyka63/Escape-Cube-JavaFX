package modele.chronos;

import modele.gestion.Deplaceur;

import java.util.ArrayList;
import java.util.List;

public abstract class ChronoRefresh implements Chrono{

    private List<Deplaceur> lesDeplaceurs;
    public ChronoRefresh(){
        lesDeplaceurs=new ArrayList<>();
    }

    /**
     * Permet d'obtenir la liste des déplaceurs attachés au chrono
     * @return liste des déplaceurs attachés au chrono
     */
    public List<Deplaceur> getLesDeplaceurs() {return lesDeplaceurs;}

    /**
     * Permet d'ajouter un déplaceur à la liste des déplaceurs à notifier
     * @param d déplaceur à ajouter
     */
    public void addDeplaceur (Deplaceur d){lesDeplaceurs.add(d);}

    /**
     * Permet de supprimer un déplaceur de la liste des déplaceurs à notifier
     * @param d déplaceur à supprimer
     */
    public void delDeplaceur (Deplaceur d){lesDeplaceurs.remove(d);}
}
