package modele;

import java.util.ArrayList;
import java.util.List;

public class Monde {
    private List<Niveau> lesNiveaux;

    public Monde() {
        lesNiveaux = new ArrayList<>();
    }

    public void addNiveau (Niveau n){
        lesNiveaux.add(n);
    }
}
