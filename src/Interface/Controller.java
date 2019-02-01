package Interface;

import Model.ButtonGenerator;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    private ButtonGenerator bg;
    private int btnValue = 0;

    @FXML
    private Button createBtn;

    @FXML
    private AnchorPane anchorPane;

    @FXML
    private Label scoreLbl;

    @FXML
    void createClick() {
        bg.generate(btnValue);
        btnValue = 0;
    }

    @FXML
    void rightClick() {
        btnValue++;
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        bg = new ButtonGenerator(createBtn, anchorPane, scoreLbl);
    }
}
