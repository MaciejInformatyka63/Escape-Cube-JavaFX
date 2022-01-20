package modele.chronos;

/**
 * Interface permettant d'implémenter une gestion du temps dans d'autres threads
 */
public interface Chrono extends Runnable{

    /**
     * Méthode notifiant toutes les classes qui observent le chrono
     */
    void beep();
}
