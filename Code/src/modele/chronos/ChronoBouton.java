package modele.chronos;

import javafx.application.Platform;
import modele.gestion.ObsTempsBouton;

import java.util.ArrayList;
import java.util.List;

public abstract class ChronoBouton implements Chrono{

    /**
     * Liste contenant tous les Observateurs sur le chrono
     */
    private List<ObsTempsBouton> lesObservateurs;

    /**
     * Constructeur qui instancie les observateurs
     */
    public ChronoBouton(){
        lesObservateurs=new ArrayList<>();
    }

    /**
     * Méthode notifiant toutes les classes qui observent le chrono
     */
    @Override
    public void beep() {
        for (ObsTempsBouton lesObservateur : lesObservateurs) {
            Platform.runLater(lesObservateur::updatechrono);
        }
    }

    /**
     * Permet d'attacher un observateur au chrono
     * @param o observateur à attacher
     */
    public void attacher(ObsTempsBouton o){
        lesObservateurs.add(o);
    }

    /**
     * Permet de détacher un observateur du chrono
     * @param o observateur à détacher
     */
    public void detacher(ObsTempsBouton o) {
        lesObservateurs.remove(o);
    }
}
