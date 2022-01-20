package modele.chronos;

public interface Chrono extends Runnable{

    /**
     * Méthode notifiant toutes les classes qui observent le chrono
     */
    void beep();
}
