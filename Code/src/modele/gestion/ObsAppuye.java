package modele.gestion;

import modele.metier.Bouton;

/**
 * Classe permettant d'observer un Bouton
 */
public abstract class ObsAppuye {

    protected Bouton boutonSujet;

    /**
     * getter de l'attribut boutonSujet
     * @return attribut boutonSujet
     */
    public Bouton getBoutonSujet() {return boutonSujet;}

    /**
     * setter de l'attribut boutonSujet
     * @param boutonSujet nouvelle valeur de boutonSujet
     */
    public void setBoutonSujet(Bouton boutonSujet) {this.boutonSujet = boutonSujet;}

    /**
     * Méthode qui fait les actions nécessaires lorsque le bouton change d'état
     */
    public abstract void updatebouton();

}
