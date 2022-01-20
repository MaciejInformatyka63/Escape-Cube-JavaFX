package modele.gestion;

import modele.metier.Bouton;

public abstract class ObsAppuye {

    protected Bouton boutonSujet;

    public Bouton getBoutonSujet() {return boutonSujet;}
    public void setBoutonSujet(Bouton boutonSujet) {this.boutonSujet = boutonSujet;}

    public abstract void updatebouton();

}
