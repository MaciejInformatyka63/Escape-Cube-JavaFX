package modele.metier;

import modele.gestion.ObsAppuye;

import java.util.ArrayList;
import java.util.List;

public abstract class Bouton extends Element{
    private boolean appuye;
    private List<ObsAppuye> lesObservateurs;

    public boolean isAppuye() {
        return appuye;
    }

    public void setAppuye(boolean appuye) {
        this.appuye = appuye;
    }

    public Bouton(Positions pos, boolean appuye) {
        super(pos);
        lesObservateurs=new ArrayList<>();
        this.appuye = appuye;
    }

    public void attacher(ObsAppuye o){
        lesObservateurs.add(o);
    }

    public void dettacher(ObsAppuye o){
        lesObservateurs.remove(o);
    }

    public void notifier(){
        for (ObsAppuye lesObservateur : lesObservateurs) {
            lesObservateur.updatebouton();
        }
    }
}
