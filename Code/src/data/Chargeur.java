package data;

import modele.metier.Monde;


public interface Chargeur {

    /**
     * Permet de charger un monde pour jouer
     * @return Monde le monde à retourner
     */
    Monde loadMonde();
}
