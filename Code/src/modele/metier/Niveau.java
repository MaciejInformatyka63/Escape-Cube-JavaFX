package modele.metier;

import java.util.ArrayList;
import java.util.List;

public class Niveau {
    private List<Mur> lesMurs;
    private List<Bouton> lesBoutons;
    private Sortie sortie;
    private CarreJoueur carreJoueur;

    public Niveau() {
        lesMurs=new ArrayList<>();
        lesBoutons=new ArrayList<>();
    }

    public Sortie getSortie() {return sortie;}
    public void setSortie(Sortie val) {sortie = val;}

    public void addMur (Mur m){
        lesMurs.add(m);
    }
    public List<Mur> getLesMurs() {return lesMurs;}

    public void addBouton (Bouton b) {lesBoutons.add(b);}
    public List<Bouton> getLesBoutons () {return lesBoutons;}

    public CarreJoueur getCarreJoueur() {return carreJoueur;}
    public void setCarreJoueur(CarreJoueur carreJoueur) {this.carreJoueur = carreJoueur;}

}
