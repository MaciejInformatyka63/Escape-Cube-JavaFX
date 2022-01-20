package modele.gestion;

import modele.metier.Bouton;

public abstract class ObsTempsBouton extends ObsAppuye{
    @Override
    public Bouton getBoutonSujet() {return boutonSujet;}

    public abstract void updatechrono();
}
