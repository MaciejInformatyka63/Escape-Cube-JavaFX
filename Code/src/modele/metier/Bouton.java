package modele.metier;

import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.scene.paint.Color;
import modele.gestion.ObsAppuye;

import java.util.ArrayList;
import java.util.List;

public abstract class Bouton extends Element{
    private boolean appuye;
    private List<ObsAppuye> lesObservateurs;

    private ObjectProperty<Color> c;
        public Color getC() {return c.get();}
        public void setC(Color c) {this.c.set(c);}
        public ObjectProperty<Color> cProperty() {return c;}

    public boolean isAppuye() {
        return appuye;
    }

    public void setAppuye(boolean appuye) {
        if(appuye) setC(Color.GREEN);
        else setC(Color.RED);
        this.appuye = appuye;
    }

    public Bouton(Positions pos, boolean appuye) {
        super(pos);
        c=new SimpleObjectProperty<>();
        setC(Color.RED);
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
