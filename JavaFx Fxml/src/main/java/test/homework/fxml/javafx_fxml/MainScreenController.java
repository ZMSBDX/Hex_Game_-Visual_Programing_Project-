package test.homework.fxml.javafx_fxml;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.AnchorPane;


public class MainScreenController {

    @FXML
    TextField textFieldPlayer1;
    @FXML
    TextField textFieldPlayer2;
    @FXML
    Button buttonStart;
    @FXML
    ToggleGroup SizeGroup;
    @FXML
    AnchorPane anchorPane;

    private static int mapSize=0;

    @FXML
    public void btnStartOnAction(ActionEvent event) {

        GameModel gameModel = new GameModel();
        RadioButton selectedButton = (RadioButton) SizeGroup.getSelectedToggle();
        if (selectedButton != null) {
            String mapSizeS = selectedButton.getText();
            String[] mapSizeP = mapSizeS.split("x");

            mapSize=Integer.valueOf(mapSizeP[0]);

            MainScreenApplication.getStage().hide();
            gameModel.showSecondScreen(mapSize, MainScreenApplication.getStage());
            GameModel.setPlayerName(textFieldPlayer1.getText(),textFieldPlayer2.getText());
        }
    }
    public static int getMapSize() {
        return mapSize;
    }

}