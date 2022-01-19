package data;

import modele.metier.*;

public class Stub extends Chargeur{

    @Override
    public Monde loadMonde(){
        Monde m = new Monde();
        Niveau n = new Niveau();

        /*n.setCarreJoueur(new CarreJoueur(new Positions(20,40,20,40)));
        n.addMur(new MurConcret(new Positions(0,20,0,400)));
        n.addMur(new MurConcret(new Positions(780,800,0,400)));
        n.addMur(new MurConcret(new Positions(0,800,0,20)));
        n.addMur(new MurConcret(new Positions(0,800,380,400)));

        n.addMur(new MurConcret(new Positions(20,320,40,60)));
        n.addMur(new MurConcret(new Positions(340,360,40,340)));
        n.addMur(new MurConcret(new Positions(320,340,80,100)));
        n.addMur(new MurConcret(new Positions(280,300,60,140)));
        n.addMur(new MurConcret(new Positions(300,320,120,140)));
        n.addMur(new MurConcret(new Positions(320,340,320,340)));

        n.addBouton(new BoutonTimer(new Positions(320,340,20,40),false));
        n.addBouton(new BoutonTimer(new Positions(300,320,300,320),false));

        n.setSortie(new Sortie(new Positions(780,800,360,380)));*/

        n.setCarreJoueur(new CarreJoueur(new Positions(51,101,51,101)));

        n.addMur(new MurConcret(new Positions(0,50,0,400)));
        //n.addMur(new MurConcret(new Positions(750,800,0,298)));
        n.addMur(new MurConcret(new Positions(750,800,0,400)));
        n.addMur(new MurConcret(new Positions(0,800,0,50)));
        n.addMur(new MurConcret(new Positions(0,800,350,400)));

        n.addMur(new MurConcret(new Positions(50,148,201,249)));
        n.addMur(new MurConcret(new Positions(102,148,249,298)));
        n.addMur(new MurConcret(new Positions(200,250,252,350)));
        n.addMur(new MurConcret(new Positions(102,400,102,149)));
        n.addMur(new MurConcret(new Positions(350,400,50,102)));
        n.addMur(new MurConcret(new Positions(200,250,149,198)));
        n.addMur(new MurConcret(new Positions(250,697,252,298)));
        n.addMur(new MurConcret(new Positions(452,500,102,252)));
        n.addMur(new MurConcret(new Positions(552,602,50,200)));
        n.addMur(new MurConcret(new Positions(654,697,102,252)));

        n.addBouton(new BoutonTimer(new Positions(51,101,250,300),false));
        n.addBouton(new BoutonTimer(new Positions(149,199,201,251),false));
        n.addBouton(new BoutonTimer(new Positions(299,349,51,101),false));
        n.addBouton(new BoutonTimer(new Positions(251,301,299,349),false));

        n.setSortie(new Sortie(new Positions(749,800,299,349)));

        m.addNiveau(n);
        return m;
    }
}
