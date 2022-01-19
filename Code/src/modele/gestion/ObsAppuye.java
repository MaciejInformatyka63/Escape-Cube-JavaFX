package modele.gestion;

import modele.metier.Bouton;

public abstract class ObsAppuye {

    private Bouton boutonSujet;

    public Bouton getBoutonSujet() {return boutonSujet;}
    public void setBoutonSujet(Bouton boutonSujet) {this.boutonSujet = boutonSujet;}

    public abstract void updatebouton();

}
