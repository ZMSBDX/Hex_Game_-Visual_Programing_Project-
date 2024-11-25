package test.homework.fxml.javafx_fxml;


import javafx.geometry.Pos;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import javafx.scene.transform.Rotate;


public class MapBuilder {

    private Polygon[][] mapModel;
    public MapBuilder(int mapWidth, int mapHeight, GridPane gridPane) {
        mapModel = new Polygon[mapWidth][mapHeight];

        gridPane.setAlignment(Pos.CENTER);
        gridPane.setHgap(10);
        gridPane.setVgap(10);

        for (int row = 0; row < mapWidth; row++) {
            for (int col = 0; col < mapHeight; col++) {
                Polygon hexagon = createHexagon(row, col,mapModel,mapWidth,mapHeight);
                mapModel[row][col] = hexagon;
                gridPane.add(hexagon, col * 2 + row, row * 2);
            }
        }
    }
    private static Polygon createHexagon(int a, int b,Polygon[][] mapModel,int mapWidth, int mapHeight) {
        double size = 15;
        int x = a;
        int y = b;
        double[] points = new double[12];
        for (int i = 0; i < 6; i++) {
            double angle = 2 * Math.PI / 6 * i;
            points[2 * i] = size * Math.cos(angle);
            points[2 * i + 1] = size * Math.sin(angle);
        }

        Polygon hexagon = new Polygon(points);
        hexagon.setFill(Color.LIGHTBLUE);

        Rotate rotate = new Rotate(90);
        hexagon.getTransforms().add(rotate);

        SelectAndColorize.ClickEvent(hexagon, mapModel, mapHeight);


        return hexagon;
    }

}