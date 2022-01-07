package modele.gestion;
import modele.metier.*;

import java.util.ArrayList;
import java.util.List;

public class Manager {
    private Monde monde;
    private Niveau niveau;
    private Sortie sortie;
    private CarreJoueur cj;
    private DeplaceurCarre deplaceur;
    private CollisionneurMur colM;
    private CollisionneurBouton colB;
    private Positions pos;
    private List<Positions> lesPos = new ArrayList<>();
    private Positions posFin;
    private ComparateurPos cpp;
    private GestionSortieConcrete gsc;
    private boolean mvmtEnCours;

    public Manager() {
        monde = new Monde();
        sortie = new Sortie(new Positions());
        niveau = new Niveau(sortie);

        cj = new CarreJoueur();
        deplaceur = new DeplaceurCarre();
        colM = new CollisionneurMur();
        colB = new CollisionneurBouton();
        cpp = new ComparateurPos();
        gsc = new GestionSortieConcrete();
    }

    public void refresh() {
        if(mvmtEnCours){
            monde.addNiveau(niveau);

            deplaceur.addCollMur(colM);
            deplaceur.addCollBtn(colB);
            for (Collisionneur col : deplaceur.LesCollisionneurs) {
                lesPos.add(col.Collision(cj,'h',niveau));
            }

            posFin = cpp.posPlusProche(posCarré,pos);
            while(deplaceur.deplacer()) {

            }
            for (Positions p : lesPos) {
                if(p.equals(new Positions(/*bouton*/))) {
                    //vérifier s'il est appuyé...
                }
            }

            if (gsc.sortieElem(niveau,cj,'h')) {
                gsc.ouvrirSortie(niveau);
            }
        }
    }
}
