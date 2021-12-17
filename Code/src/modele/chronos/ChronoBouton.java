package modele.chronos;

import modele.gestion.ObsTempsBouton;

import java.util.Iterator;
import java.util.List;

public abstract class ChronoBouton extends Chrono{
    private List<ObsTempsBouton> lesObservateurs;

    @Override
    public void beep() {
        for (Iterator<ObsTempsBouton> o = lesObservateurs.iterator(); o.hasNext();) {
            o.next().updatechrono();
        }
    }

    public void attacher(ObsTempsBouton o){
        lesObservateurs.add(o);
    }

    public void detacher(ObsTempsBouton o) {
        lesObservateurs.remove(o);
    }
}
