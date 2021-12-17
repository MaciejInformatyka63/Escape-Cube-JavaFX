package modele.gestion;

import modele.metier.BoutonTimer;

public abstract class ObsTempsBouton extends ObsAppuye{
    protected BoutonTimer boutonSujet;
    public abstract void updatechrono();
}
