package modele.gestion;

/**
 * Classe permettant d'observer un bouton et un chrono
 */
public abstract class ObsTempsBouton extends ObsAppuye{
    /**
     * Méthode qui fait les actions correspondantes lorsque le chrono notifie l'observateur
      */
    public abstract void updatechrono();
}
