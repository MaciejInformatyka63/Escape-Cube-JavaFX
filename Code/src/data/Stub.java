package data;

import modele.metier.*;

public class Stub extends Chargeur{

    @Override
    public Monde loadMonde(){
        Monde m = new Monde();
        Niveau n = new Niveau();
        n.setCarreJoueur(new CarreJoueur(new Positions(20,20,40,40)));
        n.addMur(new MurConcret(new Positions(0,20,0,400)));
        n.addMur(new MurConcret(new Positions(780,800,0,400)));
        n.addMur(new MurConcret(new Positions(0,800,0,20)));
        n.addMur(new MurConcret(new Positions(0,800,380,400)));
        n.setSortie(new Sortie(new Positions(780,800,360,380)));
        m.addNiveau(n);
        return m;
    }
}
