package Model;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;

public class ButtonGenerator {
    Button createBtn;
    AnchorPane anchorPane;
    Label scoreLbl;

    double lAnch;
    double tAnch;
    double xBtn;
    double yBtn;
    int btnCount;

    public ButtonGenerator(Button createBtn, AnchorPane anchorPane, Label scoreLbl) {
        this.createBtn = createBtn;
        this.anchorPane = anchorPane;
        this.lAnch = 20;
        this.tAnch = 20;
        this.xBtn = 105;
        this.yBtn = 20;
        this.btnCount = 0;
        this.scoreLbl = scoreLbl;
    }

    public void generate(int btnValue){
        if(btnCount < 16){
            Button btn = new Button("+" + String.valueOf(btnValue));
            btn.setPrefWidth(80);
            btn.setOnAction(event -> {scoreLbl.setText("Score: " + (Integer.valueOf(scoreLbl.getText().split(" ")[1]) + btnValue));});
            AnchorPane.setLeftAnchor(btn,lAnch);
            AnchorPane.setTopAnchor(btn,tAnch);
            anchorPane.getChildren().addAll(btn);
            createBtn.setLayoutX(xBtn);
            createBtn.setLayoutY(yBtn);

            btnCount++;

            if(btnCount % 4 == 0){
                yBtn += 40;
                tAnch += 40;
                xBtn = 20;
                lAnch = -65;
            }

            lAnch+=85;
            xBtn+=85;
        }
    }
}
