package data;

import modele.metier.*;

/**
 * Classe chargeant un monde par défaut
 */
public class Stub implements Chargeur{
    /**
     * Charge un monde par défaut pour pouvoir jouer au jeu
     * @return Monde : un monde par défaut
     */
    @Override
    public Monde loadMonde(){
        Monde m = new Monde();
        Niveau n = new Niveau();

        n.setCarreJoueur(new CarreJoueur(new Positions(51,101,51,101)));

        n.addMur(new MurConcret(new Positions(0,50,0,400)));
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

        n = new Niveau();

        n.setCarreJoueur(new CarreJoueur(new Positions(299,349,51,101)));

        n.addMur(new MurConcret(new Positions(0,50,0,400)));
        n.addMur(new MurConcret(new Positions(750,800,0,400)));
        n.addMur(new MurConcret(new Positions(0,800,0,50)));
        n.addMur(new MurConcret(new Positions(0,800,350,400)));

        n.addMur(new MurConcret(new Positions(50,148,201,249)));
        n.addMur(new MurConcret(new Positions(102,148,249,298)));
        n.addMur(new MurConcret(new Positions(102,250,252,298)));
        n.addMur(new MurConcret(new Positions(102,400,102,149)));
        n.addMur(new MurConcret(new Positions(350,400,50,102)));
        n.addMur(new MurConcret(new Positions(200,250,149,200)));
        n.addMur(new MurConcret(new Positions(302,697,252,298)));
        n.addMur(new MurConcret(new Positions(452,500,102,252)));
        n.addMur(new MurConcret(new Positions(552,602,50,200)));
        n.addMur(new MurConcret(new Positions(654,697,102,252)));

        n.addBouton(new BoutonTimer(new Positions(51,101,250,300),false));
        n.addBouton(new BoutonTimer(new Positions(149,199,201,251),false));
        n.addBouton(new BoutonTimer(new Positions(251,301,150,200),false));

        //n.addBouton(new BoutonTimer(new Positions(299,349,51,101),false));
        n.addBouton(new BoutonTimer(new Positions(251,301,299,349),false));

        n.setSortie(new Sortie(new Positions(749,800,299,349)));

        m.addNiveau(n);
        return m;
    }
}
