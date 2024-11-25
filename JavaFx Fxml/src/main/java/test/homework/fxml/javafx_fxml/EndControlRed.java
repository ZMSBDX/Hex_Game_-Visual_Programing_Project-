package test.homework.fxml.javafx_fxml;


import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;



public class EndControlRed {

    public static boolean endControl(Polygon[][] mapModel, int mapSize) {

        Polygon[][] RedKeys = new Polygon[mapSize][mapSize];


        for (int i = 0; i < mapSize; i++ ){
            for (int j = 0; j < mapSize; j++ ){
                RedKeys[i][j] = null;
            }
        }

        int y = 0;
        for (int x = 0 ; x < mapSize ; x++) {
            if (mapModel[x][y].getFill().equals(Color.RED)) {
                if (FindWay(x , y, RedKeys, mapModel, mapSize) == true){
                    System.out.println("Oyun Bitti!");
                    GameModel.winner = "Red";
                    GameModel.labelWinner.setStyle("-fx-text-fill: red;");
                    GameModel.winnerWriter();
                    return true;
                }
            }
        }
        return false;
    }
    /*public static boolean NeighborControl(Polygon[][] mapModel, int MapHeight, int x, int y) {
        Polygon[][] RedKeys = new Polygon[MapHeight][MapWidth];
        for (y = 0 ; y <= MapHeight ; ){
            System.out.println("Merhaba");
            System.out.println(x);
            System.out.println(y);
            RedKeys[x][y] = mapModel[x][y];
            if (y == MapHeight - 1 && mapModel[x][y].getFill().equals(Color.RED))
            {
                return true;
            }
            else if (mapModel[x][y+1].getFill().equals(Color.RED) && RedKeys[x][y+1] != mapModel[x][y+1])
            {
                y++;
                System.out.println("ifteyim");
            }
            else if ( x!=10 && mapModel[x+1][y].getFill().equals(Color.RED) && RedKeys[x+1][y] != mapModel[x+1][y])
            {
                x++;System.out.println("ifteyim");
            }
            else if ( x!=10 && y != 0 && mapModel[x+1][y-1].getFill().equals(Color.RED) && RedKeys[x+1][y-1] != mapModel[x+1][y-1])
            {
                x++;System.out.println("ifteyim");
                y--;
            }
            else if (y != 0 && mapModel[x][y-1].getFill().equals(Color.RED) && RedKeys[x][y-1] != mapModel[x][y-1])
            {
                y--;System.out.println("ifteyim");
            }
            else if (x != 0 && mapModel[x-1][y].getFill().equals(Color.RED) && RedKeys[x-1][y] != mapModel[x-1][y])
            {
                x--;System.out.println("ifteyim");
            }
            else if (x != 0 && mapModel[x-1][y+1].getFill().equals(Color.RED) && RedKeys[x-1][y+1] != mapModel[x-1][y+1])
            {
                x--;System.out.println("ifteyim");
                y++;
            }
            else break;
        }
        return false;
    }*/

    public static boolean FindWay(int x, int y, Polygon[][] RedKeys, Polygon[][] mapModel, int MapHeight) {

        if (x < 0 || y < 0 || x >= MapHeight || y >= MapHeight) return false;

        if (RedKeys[x][y] == mapModel[x][y]) return false;

        if (mapModel[x][y].getFill().equals(Color.RED) == false) return false;

        if (mapModel[x][y].getFill().equals(Color.RED) && y == MapHeight - 1) return true;

        RedKeys[x][y] = mapModel[x][y];

        return FindWay(x - 1, y, RedKeys, mapModel, MapHeight) ||
                FindWay(x + 1, y, RedKeys, mapModel, MapHeight) ||
                FindWay(x, y - 1, RedKeys, mapModel, MapHeight) ||
                FindWay(x, y + 1, RedKeys, mapModel, MapHeight) ||
                FindWay(x - 1, y + 1, RedKeys, mapModel, MapHeight) ||
                FindWay(x + 1, y - 1, RedKeys, mapModel, MapHeight);
    }
}