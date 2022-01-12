package view.codeBehind;


import javafx.fxml.FXML;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Rectangle;
import launch.Launcher;
import view.gestion.ManagerVue;


public class Fenetre {
    //privé sauf initialize
    @FXML
    private Rectangle carre;
    @FXML
    private Rectangle mur;
    @FXML
    private Pane pane;

    @FXML
    public void initialize() {
        ManagerVue.getStage().addEventFilter(KeyEvent.KEY_PRESSED, event-> ManagerVue.getM().traiterTouche(event.getCode()));
    }

}
