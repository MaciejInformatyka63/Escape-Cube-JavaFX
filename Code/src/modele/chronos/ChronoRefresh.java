package modele.chronos;

import modele.gestion.Manager;

import static java.lang.Thread.sleep;

public class ChronoRefresh extends Chrono{

    Manager m;
    public ChronoRefresh(Manager m){
        this.m=m;
    }
    @Override
    public void beep() {
        m.refresh();
    }

    public void run() {
        try {
            sleep (1000/60);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
