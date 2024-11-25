package test.homework.fxml.javafx_fxml;

import javafx.animation.FillTransition;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import javafx.util.Duration;

public class SelectAndColorize {
    public static int OrderColor = 1;

    public static void ClickEvent(Polygon hexagon, Polygon[][] mapModel, int mapSize) {
        hexagon.setOnMouseClicked(event -> {
            if ((hexagon.getFill().equals(Color.RED) || hexagon.getFill().equals(Color.BLUE)) == false & (GameModel.labelWinner.isVisible()==false)) {
                switch (OrderColor) {
                    case 0: {
                        FillTransition fillTransition = new FillTransition(Duration.seconds(1), hexagon);
                        fillTransition.setToValue(Color.RED); // Hedef renk
                        fillTransition.play();
                        hexagon.setFill(Color.RED);

                        System.out.println("Kırmızı yapmak için Butona tıklandı!");
                        EndControlRed.endControl(mapModel, mapSize);
                        OrderColor = 1 - OrderColor;
                        GameModel.ChangerRound();
                        GameModel.Swapping(OrderColor, hexagon, mapSize);
                    }
                    break;
                    case 1: {
                        FillTransition fillTransition = new FillTransition(Duration.seconds(1), hexagon);
                        fillTransition.setToValue(Color.BLUE);
                        fillTransition.play();
                        hexagon.setFill(Color.BLUE);

                        System.out.println("Mavi yapmak için Butona tıklandı!");
                        EndControlBlue.endControl(mapModel, mapSize);
                        OrderColor = 1 - OrderColor;
                        GameModel.ChangerRound();
                        GameModel.Swapping(OrderColor, hexagon, mapSize);
                    }
                    break;
                }
            }
        });
    }
}