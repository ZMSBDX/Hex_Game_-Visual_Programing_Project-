package test.homework.fxml.javafx_fxml;


import javafx.animation.FillTransition;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.util.Duration;

public class GameModel {

    public GridPane gridPane=new GridPane();
    static int round=0;
    static Label labelOver = new Label("Oyun Bitti!");
    static Label labelWinner = new Label("Tur Sayisi : " + round);
    static String winner = "Kazanan yok";
    static Label label = new Label("Tur Sayisi : " + round);
    static Button swapButton = new Button("Swap");
    static Label player1Name = new Label();
    static Label player2Name = new Label();


    static {
        swapButton.setVisible(false);
        labelOver.setVisible(false);
        labelWinner.setVisible(false);
    }

    public static void ChangerRound() {
        round++;
        label.setText("Tur Sayisi : " + round);
        swapButton.setVisible(round == 1);
    }

    public static void winnerWriter() {
        labelWinner.setText("Kazanan: " + winner);
        labelOver.setVisible(true);
        labelWinner.setVisible(true);
    }

    public static int Swapping(int OrderColor, Polygon hexagon, int mapSize){
        swapButton.setOnAction(event -> {
            SelectAndColorize.OrderColor = 1 - OrderColor;
            for (int x = 0; x < mapSize; x++) {
                for (int y = 0; y < mapSize; y++){
                    if (hexagon.getFill().equals(Color.BLUE)){
                        FillTransition fillTransition = new FillTransition(Duration.seconds(1), hexagon);
                        fillTransition.setToValue(Color.RED);
                        fillTransition.play();
                        break;
                    }
                    if (hexagon.getFill().equals(Color.RED)){
                        FillTransition fillTransition = new FillTransition(Duration.seconds(1), hexagon);
                        fillTransition.setToValue(Color.BLUE);
                        fillTransition.play();
                        break;
                    }
                }
            }
            swapButton.setVisible(false);
        });
        return OrderColor;
    }
    public static void RoundEraser(){
        round = 0;
        label.setText("Tur Sayısı : " + round);
    }

    public void showSecondScreen(int mapSize,Stage stageMain) {
        MapBuilder mapBuilder = new MapBuilder(mapSize,mapSize,gridPane);

        Stage secondStage = new Stage();

        Button returnButton = new Button("Return Main Menu");
        returnButton.setOnAction(event -> {
            secondStage.close();
            round = 0;
            RoundEraser();
            labelOver.setVisible(false);
            labelWinner.setVisible(false);
            stageMain.show();
        });

        labelWinner.setFont(Font.font(20));
        labelOver.setFont(Font.font(20));
        label.setFont(Font.font(20));

        player1Name.setStyle("-fx-text-fill: red;");
        player2Name.setStyle("-fx-text-fill: blue;");
        player1Name.setFont(Font.font(20));
        player2Name.setFont(Font.font(20));


        player1Name.setPadding (new Insets(0,20,0,10));
        player2Name.setPadding (new Insets(0,20,0,10));


        HBox rightContainer = new HBox(player1Name, player2Name);
        rightContainer.setAlignment(Pos.BOTTOM_CENTER);
        rightContainer.setPadding(new Insets(10, 0, 10, 0));



        VBox bottomContainer = new VBox(5); // 5px spacing between elements
        bottomContainer.getChildren().addAll(swapButton, returnButton,rightContainer);
        bottomContainer.setAlignment(Pos.BOTTOM_CENTER);
        bottomContainer.setPadding(new Insets(0, 0, 10, 0));

        label.setAlignment(Pos.TOP_CENTER);
        VBox topContainer = new VBox(label, labelOver, labelWinner);
        topContainer.setAlignment(Pos.TOP_CENTER);
        topContainer.setPadding(new Insets(10, 0, 0, 0));

        gridPane.setHgap(-16);
        gridPane.setVgap(-1);

        BorderPane borderPane = new BorderPane();
        borderPane.setCenter(gridPane);
        borderPane.setBottom(bottomContainer);
        borderPane.setTop(topContainer);

        Scene secondScene = new Scene(borderPane, definitionStageSize(mapSize), definitionStageSize(mapSize));
        secondStage.setScene(secondScene);
        secondStage.setTitle("İkinci Ekran");
        secondStage.show();
    }
    public static int definitionStageSize(int mapSize) {
        if (mapSize==5)
        {
            return 500;
        } else if (mapSize==11)
        {
            return 700;
        }
        else
        {
            return 800;
        }
    }
    public static void setPlayerName(String palyer1Name, String palyer2Name)
    {
        player1Name.setText("Red : " + palyer1Name);
        player2Name.setText("Blue : " + palyer2Name);
    }

}