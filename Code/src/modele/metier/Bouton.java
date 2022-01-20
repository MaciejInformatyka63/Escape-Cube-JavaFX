package modele.metier;

import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.scene.paint.Color;
import modele.gestion.ObsAppuye;
import modele.gestion.ObsTempsBoutonConcret;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe représentant un Bouton
 */
public abstract class Bouton extends Element{
    protected boolean appuye;
    private List<ObsAppuye> lesObservateurs;

    private ObjectProperty<Color> c;
        /**
         * getter pour l'attribut c
         * @return valeur de l'attribut c
         */
        public Color getC() {return c.get();}
        /**
         * setter pour l'attribut c
         * @param c nouvelle valeur de l'attribut c
         */
        public void setC(Color c) {this.c.set(c);}
        /**
         * Propriété qui encapsule l'attribut c de type Couleur
         * @return Propriété c
         */
        public ObjectProperty<Color> cProperty() {return c;}

    /**
     * Constructeur de la classe Bouton
     * @param pos Positions du Bouton
     * @param appuye Booleen si le bouton est appuyé ou non à la création
     */
    public Bouton(Positions pos, boolean appuye) {
        super(pos);
        c=new SimpleObjectProperty<>();
        lesObservateurs=new ArrayList<>();
        lesObservateurs.add(new ObsTempsBoutonConcret());
        attacher(lesObservateurs.get(0));
        setAppuye(appuye);
    }

    /**
     * Getter pour l'attribut appuye
     * @return attribut appuye
     */
    public boolean isAppuye() {
        return appuye;
    }

    /**
     * setter de l'attribut appuye qui notifie les observateurs
     * @param appuye nouvelle valeur de appuye
     */
    public void setAppuye(boolean appuye) {
        if(appuye) {
            setC(Color.GREEN);
            notifier();
        }
        else setC(Color.RED);

        this.appuye = appuye;
    }

    /**
     * Permet d'attacher un observateur à ce bouton
     * @param o observateur à attacher
     */
    public void attacher(ObsAppuye o){
            o.setBoutonSujet(this);
            lesObservateurs.add(o);
    }

    /**
     * Permet de détacher un observateur de ce bouton
     * @param o observateur à détacher
     */
    public void dettacher(ObsAppuye o){
        lesObservateurs.remove(o);
    }

    /**
     * Méthode qui notifie tous les observateurs
     */
    public void notifier(){
        for (ObsAppuye lesObservateur : lesObservateurs) {
            lesObservateur.updatebouton();
        }
    }
}
