package modele.chronos;

import javafx.application.Platform;
import modele.gestion.ObsTempsBouton;

import java.util.ArrayList;
import java.util.List;

public abstract class ChronoBouton extends Chrono{
    private List<ObsTempsBouton> lesObservateurs;

    public ChronoBouton(){
        lesObservateurs=new ArrayList<>();
    }

    @Override
    public void beep() {
        for (ObsTempsBouton lesObservateur : lesObservateurs) {
            Platform.runLater(lesObservateur::updatechrono);
        }
    }

    public void attacher(ObsTempsBouton o){
        lesObservateurs.add(o);
    }

    public void detacher(ObsTempsBouton o) {
        lesObservateurs.remove(o);
    }
}
