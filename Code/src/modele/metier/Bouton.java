package modele.metier;

import modele.gestion.ObsAppuye;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class Bouton extends Element{
    private boolean appuyé;
    private List<ObsAppuye> lesObservateurs;

    public boolean isAppuyé() {
        return appuyé;
    }

    public void setAppuyé(boolean appuyé) {
        this.appuyé = appuyé;
    }

    public Bouton(Positions pos, boolean appuyé) {
        super(pos);
        lesObservateurs=new ArrayList<>();
        this.appuyé = appuyé;
    }

    public void attacher(ObsAppuye o){
        lesObservateurs.add(o);
    }

    public void dettacher(ObsAppuye o){
        lesObservateurs.remove(o);
    }

    public void notifier(){
        for (Iterator<ObsAppuye> o = lesObservateurs.iterator() ; o.hasNext();) {
            o.next().updatebouton();
        }
    }
}
