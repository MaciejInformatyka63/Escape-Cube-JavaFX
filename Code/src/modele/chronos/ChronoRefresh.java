package modele.chronos;

import modele.gestion.Deplaceur;
import modele.gestion.Manager;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Thread.sleep;

public class ChronoRefresh extends Chrono{

    private List<Deplaceur> lesDeplaceurs;
    public ChronoRefresh(){
        lesDeplaceurs=new ArrayList<>();
    }
    @Override
    public void beep() {
        ;
    }

    public void run() {
        try {
            sleep (1000/60);
            beep();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void addDeplaceur (Deplaceur d){lesDeplaceurs.add(d);}
    public void delDeplaceur (Deplaceur d){lesDeplaceurs.remove(d);}
}
