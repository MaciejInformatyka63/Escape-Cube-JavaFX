package view;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.scene.Parent;
import modele.*;
import org.w3c.dom.css.Rect;


public class Fenetre {
    //privé sauf initialize
    @FXML
    private Rectangle carre;
    @FXML
    private Rectangle mur;

    @FXML
    public void initialize() {
        Positions pcj= new Positions((int)carre.getX(), (int)(carre.getX()+ carre.getWidth()), (int)carre.getY(), (int)(carre.getY()+ carre.getHeight()));
        Positions pm = new Positions((int)mur.getX(), (int)(mur.getX()+ mur.getWidth()), (int)mur.getY(), (int)(mur.getY()+ mur.getHeight()));
        Positions posFin;
        CarreJoueur cj=new CarreJoueur(pcj);
        Mur m = new Mur(pm);
        DeplaceurCarre dc = new DeplaceurCarre();
        CollisionneurMur cm = new CollisionneurMur();
        cm.addMur(m);
        posFin=cm.Collision(cj,'d');
        dc.deplacer(cj,'d',10,posFin);
        carre.setX((cj.getP().getPosx1()));
        carre.setY((cj.getP().getPosy1()));
    }
}
