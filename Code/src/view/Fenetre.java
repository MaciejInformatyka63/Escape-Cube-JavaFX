package view;

import javafx.fxml.FXML;
import javafx.scene.shape.Rectangle;
import modele.gestion.CollisionneurMur;
import modele.gestion.ComparateurPos;
import modele.gestion.DeplaceurCarre;
import modele.metier.*;

import java.util.ArrayList;
import java.util.List;


public class Fenetre {
    //privé sauf initialize
    @FXML
    private Rectangle carre;
    @FXML
    private Rectangle mur;

    @FXML
    public void initialize() {
        Niveau niveau = new Niveau();
        Monde monde = new Monde();
        Positions pcj= new Positions(50, (int)(50+ carre.getWidth()), 50, (int)(50+ carre.getHeight()));
        Positions pm = new Positions((int)mur.getX(), (int)(mur.getX()+ mur.getWidth()), (int)mur.getY(), (int)(mur.getY()+ mur.getHeight()));
        Positions posFin, posM;
        List<Positions> lesPos = new ArrayList<Positions>();
        CarreJoueur cj=new CarreJoueur(pcj, 50.0);
        MurConcret m = new MurConcret(pm);
        DeplaceurCarre dc = new DeplaceurCarre();
        CollisionneurMur cm = new CollisionneurMur();
        ComparateurPos cpp = new ComparateurPos();

        dc.addCollMur(cm);
        niveau.addMur(m);

        carre.xProperty().bind(cj.getP().posx1Property());
        carre.yProperty().bind(cj.getP().posy1Property());
        posM=cm.Collision(cj,'d',niveau);
        //posBtn
        lesPos.add(posM);
        //lesPos.add(posBtn);
        posFin = cpp.posPlusProche(cj.getP(),lesPos);
        dc.deplacer(cj,'d',10,posFin);
    }
}
