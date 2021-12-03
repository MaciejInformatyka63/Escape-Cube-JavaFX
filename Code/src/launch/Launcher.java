package launch;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.*;
import javafx.scene.control.ToolBar;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Launcher extends Application {
    @Override
    public void start(Stage ps) throws Exception {
        Parent r = FXMLLoader.load(getClass().getResource("/FXML/test.fxml"));
        Scene s = new Scene(r);
        ps.setScene(s);
        ps.show();
        BorderPane bp = new BorderPane();
        ToolBar tl = new ToolBar();
        bp.setTop(tl);
    }

}