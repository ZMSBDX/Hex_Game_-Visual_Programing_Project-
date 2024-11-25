package test.homework.fxml.javafx_fxml;
/*package com.hexgame.hexgame2;

import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;

public class EndControlBlue {

    static int MapHeight = 11;
    static int MapWidth = 11;
    static Polygon[][] BlueKeys = new Polygon[MapHeight][MapWidth];
    static Polygon[][] transpozed = new Polygon[MapHeight][MapWidth];

    public static Polygon[][] Transpozing(Polygon[][] mapModel){
        for (int i = 0; i < MapHeight; i++ ) {
            for (int j = 0; j < MapHeight; j++) {
                transpozed[j][i] = mapModel[i][j];
                mapModel[i][j] = transpozed[j][i];
            }
        }
        return mapModel;
    }*/

    /*public static void endControlBlue(Polygon[][] mapModel, int MapHeight) {
        //Transpozing(mapModel);
        for (int i = 0; i < MapHeight; i++) {
            for (int j = 0; j < MapHeight; j++) {
                BlueKeys[i][j] = null;
            }
        }
        boolean isFinishControl = true;
        boolean isFinishControl2 = true;
        int x = 0;

        for (int y = 0; y < MapHeight && isFinishControl2 == true; y++) {
            if (mapModel[x][y].getFill().equals(Color.BLUE)) {
                for (int k = 0; k < 6 && isFinishControl == true; k++) {
                    switch (k) {
                        case 0: {
                            Polygon[][] BlueKeys = new Polygon[MapHeight][MapWidth];
                            for (x = 0; x <= MapHeight; ) {
                                System.out.println("Merhaba");
                                System.out.println(x);
                                System.out.println(y);
                                BlueKeys[x][y] = mapModel[x][y];
                                if (x == MapHeight - 1 && mapModel[x][y].getFill().equals(Color.BLUE)) {
                                    System.out.println("Oyun Bitti!");
                                    isFinishControl = false;
                                    isFinishControl2 = false;
                                    break;
                                } else if (mapModel[x][y + 1].getFill().equals(Color.BLUE) && BlueKeys[x][y + 1] != mapModel[x][y + 1]) {
                                    BlueKeys[x][y + 1] = null;
                                    y++;
                                    System.out.println("ifteyim");
                                } else if (x != 10 && mapModel[x + 1][y].getFill().equals(Color.BLUE) && BlueKeys[x + 1][y] != mapModel[x + 1][y]) {
                                    BlueKeys[x + 1][y] = null;
                                    x++;
                                    System.out.println("ifteyim");
                                } else if (x != 10 && y != 0 && mapModel[x + 1][y - 1].getFill().equals(Color.BLUE) && BlueKeys[x + 1][y - 1] != mapModel[x + 1][y - 1]) {
                                    BlueKeys[x + 1][y - 1] = null;
                                    x++;
                                    System.out.println("ifteyim");
                                    y--;
                                } else if (y != 0 && mapModel[x][y - 1].getFill().equals(Color.BLUE) && BlueKeys[x][y - 1] != mapModel[x][y - 1]) {
                                    BlueKeys[x][y - 1] = null;
                                    y--;
                                    System.out.println("ifteyim");
                                } else if (x != 0 && mapModel[x - 1][y].getFill().equals(Color.BLUE) && BlueKeys[x - 1][y] != mapModel[x - 1][y]) {
                                    BlueKeys[x - 1][y] = null;
                                    x--;
                                    System.out.println("ifteyim");
                                } else if (x != 0 && mapModel[x - 1][y + 1].getFill().equals(Color.BLUE) && BlueKeys[x - 1][y + 1] != mapModel[x - 1][y + 1]) {
                                    BlueKeys[x - 1][y + 1] = null;
                                    x--;
                                    System.out.println("ifteyim");
                                    y++;
                                } else break;
                            }
                        }
                        break;
                        case 1: {
                            Polygon[][] BlueKeys = new Polygon[MapHeight][MapWidth];
                            for (x = 0; x <= MapHeight; ) {
                                System.out.println("Merhaba");
                                System.out.println(x);
                                System.out.println(y);
                                BlueKeys[x][y] = mapModel[x][y];
                                if (x == MapHeight - 1 && mapModel[x][y].getFill().equals(Color.BLUE)) {
                                    System.out.println("Oyun Bitti!");
                                    isFinishControl = false;
                                    isFinishControl2 = false;
                                    break;
                                } else if (x != 10 && mapModel[x + 1][y].getFill().equals(Color.BLUE) && BlueKeys[x + 1][y] != mapModel[x + 1][y]) {
                                    BlueKeys[x + 1][y] = null;
                                    x++;
                                    System.out.println("ifteyim");
                                } else if (x != 10 && y != 0 && mapModel[x + 1][y - 1].getFill().equals(Color.BLUE) && BlueKeys[x + 1][y - 1] != mapModel[x + 1][y - 1]) {
                                    BlueKeys[x + 1][y - 1] = null;
                                    x++;
                                    System.out.println("ifteyim");
                                    y--;
                                } else if (y != 0 && mapModel[x][y - 1].getFill().equals(Color.BLUE) && BlueKeys[x][y - 1] != mapModel[x][y - 1]) {
                                    BlueKeys[x][y - 1] = null;
                                    y--;
                                    System.out.println("ifteyim");
                                } else if (x != 0 && mapModel[x - 1][y].getFill().equals(Color.BLUE) && BlueKeys[x - 1][y] != mapModel[x - 1][y]) {
                                    BlueKeys[x - 1][y] = null;
                                    x--;
                                    System.out.println("ifteyim");
                                } else if (x != 0 && mapModel[x - 1][y + 1].getFill().equals(Color.BLUE) && BlueKeys[x - 1][y + 1] != mapModel[x - 1][y + 1]) {
                                    BlueKeys[x - 1][y + 1] = null;
                                    x--;
                                    System.out.println("ifteyim");
                                    y++;
                                } else if (mapModel[x][y + 1].getFill().equals(Color.BLUE) && BlueKeys[x][y + 1] != mapModel[x][y + 1]) {
                                    BlueKeys[x][y + 1] = null;
                                    y++;
                                    System.out.println("ifteyim");
                                } else break;
                            }
                        }
                        break;
                        case 2: {
                            Polygon[][] BlueKeys = new Polygon[MapHeight][MapWidth];
                            for (x = 0; x <= MapHeight; ) {
                                System.out.println("Merhaba");
                                System.out.println(x);
                                System.out.println(y);
                                BlueKeys[x][y] = mapModel[x][y];
                                if (x == MapHeight - 1 && mapModel[x][y].getFill().equals(Color.BLUE)) {
                                    System.out.println("Oyun Bitti!");
                                    isFinishControl = false;
                                    isFinishControl2 = false;
                                    break;
                                } else if (x != 10 && y != 0 && mapModel[x + 1][y - 1].getFill().equals(Color.BLUE) && BlueKeys[x + 1][y - 1] != mapModel[x + 1][y - 1]) {
                                    BlueKeys[x + 1][y - 1] = null;
                                    x++;
                                    System.out.println("ifteyim");
                                    k = (int) (Math.random() * 6);
                                    y--;
                                } else if (y != 0 && mapModel[x][y - 1].getFill().equals(Color.BLUE) && BlueKeys[x][y - 1] != mapModel[x][y - 1]) {
                                    BlueKeys[x][y - 1] = null;
                                    y--;
                                    System.out.println("ifteyim");
                                } else if (x != 0 && mapModel[x - 1][y].getFill().equals(Color.BLUE) && BlueKeys[x - 1][y] != mapModel[x - 1][y]) {
                                    BlueKeys[x - 1][y] = null;
                                    x--;
                                    System.out.println("ifteyim");
                                } else if (x != 0 && mapModel[x - 1][y + 1].getFill().equals(Color.BLUE) && BlueKeys[x - 1][y + 1] != mapModel[x - 1][y + 1]) {
                                    BlueKeys[x - 1][y + 1] = null;
                                    x--;
                                    System.out.println("ifteyim");
                                    y++;
                                } else if (mapModel[x][y + 1].getFill().equals(Color.BLUE) && BlueKeys[x][y + 1] != mapModel[x][y + 1]) {
                                    BlueKeys[x][y + 1] = null;
                                    y++;
                                    System.out.println("ifteyim");
                                } else if (x != 10 && mapModel[x + 1][y].getFill().equals(Color.BLUE) && BlueKeys[x + 1][y] != mapModel[x + 1][y]) {
                                    BlueKeys[x + 1][y] = null;
                                    x++;
                                    System.out.println("ifteyim");
                                } else break;
                            }
                        }
                        break;
                        case 3: {
                            Polygon[][] BlueKeys = new Polygon[MapHeight][MapWidth];
                            for (x = 0; x <= MapHeight; ) {
                                System.out.println("Merhaba");
                                System.out.println(x);
                                System.out.println(y);
                                BlueKeys[x][y] = mapModel[x][y];
                                if (x == MapHeight - 1 && mapModel[x][y].getFill().equals(Color.BLUE)) {
                                    System.out.println("Oyun Bitti!");
                                    isFinishControl = false;
                                    isFinishControl2 = false;
                                    break;
                                } else if (y != 0 && mapModel[x][y - 1].getFill().equals(Color.BLUE) && BlueKeys[x][y - 1] != mapModel[x][y - 1]) {
                                    BlueKeys[x][y - 1] = null;
                                    y--;
                                    System.out.println("ifteyim");
                                } else if (x != 0 && mapModel[x - 1][y].getFill().equals(Color.BLUE) && BlueKeys[x - 1][y] != mapModel[x - 1][y]) {
                                    BlueKeys[x - 1][y] = null;
                                    x--;
                                    System.out.println("ifteyim");
                                } else if (x != 0 && mapModel[x - 1][y + 1].getFill().equals(Color.BLUE) && BlueKeys[x - 1][y + 1] != mapModel[x - 1][y + 1]) {
                                    BlueKeys[x - 1][y + 1] = null;
                                    x--;
                                    System.out.println("ifteyim");
                                    y++;
                                } else if (mapModel[x][y + 1].getFill().equals(Color.BLUE) && BlueKeys[x][y + 1] != mapModel[x][y + 1]) {
                                    BlueKeys[x][y + 1] = null;
                                    y++;
                                    System.out.println("ifteyim");
                                } else if (x != 10 && mapModel[x + 1][y].getFill().equals(Color.BLUE) && BlueKeys[x + 1][y] != mapModel[x + 1][y]) {
                                    BlueKeys[x + 1][y] = null;
                                    x++;
                                    System.out.println("ifteyim");
                                } else if (x != 10 && y != 0 && mapModel[x + 1][y - 1].getFill().equals(Color.BLUE) && BlueKeys[x + 1][y - 1] != mapModel[x + 1][y - 1]) {
                                    BlueKeys[x + 1][y - 1] = null;
                                    x++;
                                    System.out.println("ifteyim");
                                    y--;
                                } else break;
                            }
                        }
                        break;
                        case 4: {
                            Polygon[][] BlueKeys = new Polygon[MapHeight][MapWidth];
                            for (x = 0; x <= MapHeight; ) {
                                System.out.println("Merhaba");
                                System.out.println(x);
                                System.out.println(y);
                                BlueKeys[x][y] = mapModel[x][y];
                                if (x == MapHeight - 1 && mapModel[x][y].getFill().equals(Color.BLUE)) {
                                    System.out.println("Oyun Bitti!");
                                    isFinishControl = false;
                                    isFinishControl2 = false;
                                    break;
                                } else if (x != 0 && mapModel[x - 1][y].getFill().equals(Color.BLUE) && BlueKeys[x - 1][y] != mapModel[x - 1][y]) {
                                    BlueKeys[x - 1][y] = null;
                                    x--;
                                    System.out.println("ifteyim");
                                } else if (x != 0 && mapModel[x - 1][y + 1].getFill().equals(Color.BLUE) && BlueKeys[x - 1][y + 1] != mapModel[x - 1][y + 1]) {
                                    BlueKeys[x - 1][y + 1] = null;
                                    x--;
                                    System.out.println("ifteyim");
                                    y++;
                                } else if (mapModel[x][y + 1].getFill().equals(Color.BLUE) && BlueKeys[x][y + 1] != mapModel[x][y + 1]) {
                                    BlueKeys[x][y + 1] = null;
                                    y++;
                                    System.out.println("ifteyim");
                                } else if (x != 10 && mapModel[x + 1][y].getFill().equals(Color.BLUE) && BlueKeys[x + 1][y] != mapModel[x + 1][y]) {
                                    BlueKeys[x + 1][y] = null;
                                    x++;
                                    System.out.println("ifteyim");
                                } else if (x != 10 && y != 0 && mapModel[x + 1][y - 1].getFill().equals(Color.BLUE) && BlueKeys[x + 1][y - 1] != mapModel[x + 1][y - 1]) {
                                    BlueKeys[x + 1][y - 1] = null;
                                    x++;
                                    System.out.println("ifteyim");
                                    y--;
                                } else if (y != 0 && mapModel[x][y - 1].getFill().equals(Color.BLUE) && BlueKeys[x][y - 1] != mapModel[x][y - 1]) {
                                    BlueKeys[x][y - 1] = null;
                                    y--;
                                    System.out.println("ifteyim");
                                } else break;
                            }
                        }
                        break;
                        case 5: {
                            Polygon[][] BlueKeys = new Polygon[MapHeight][MapWidth];
                            for (x = 0; x <= MapHeight; ) {
                                System.out.println("Merhaba");
                                System.out.println(x);
                                System.out.println(y);
                                BlueKeys[x][y] = mapModel[x][y];
                                if (x == MapHeight - 1 && mapModel[x][y].getFill().equals(Color.BLUE)) {
                                    System.out.println("Oyun Bitti!");
                                    isFinishControl = false;
                                    isFinishControl2 = false;
                                    break;
                                } else if (x != 0 && mapModel[x - 1][y + 1].getFill().equals(Color.BLUE) && BlueKeys[x - 1][y + 1] != mapModel[x - 1][y + 1]) {
                                    BlueKeys[x - 1][y + 1] = null;
                                    x--;
                                    System.out.println("ifteyim");
                                    y++;
                                } else if (mapModel[x][y + 1].getFill().equals(Color.BLUE) && BlueKeys[x][y + 1] != mapModel[x][y + 1]) {
                                    BlueKeys[x][y + 1] = null;
                                    y++;
                                    System.out.println("ifteyim");
                                } else if (x != 10 && mapModel[x + 1][y].getFill().equals(Color.BLUE) && BlueKeys[x + 1][y] != mapModel[x + 1][y]) {
                                    BlueKeys[x + 1][y] = null;
                                    x++;
                                    System.out.println("ifteyim");
                                } else if (x != 10 && y != 0 && mapModel[x + 1][y - 1].getFill().equals(Color.BLUE) && BlueKeys[x + 1][y - 1] != mapModel[x + 1][y - 1]) {
                                    BlueKeys[x + 1][y - 1] = null;
                                    x++;
                                    System.out.println("ifteyim");
                                    y--;
                                } else if (y != 0 && mapModel[x][y - 1].getFill().equals(Color.BLUE) && BlueKeys[x][y - 1] != mapModel[x][y - 1]) {
                                    BlueKeys[x][y - 1] = null;
                                    y--;
                                    System.out.println("ifteyim");
                                } else if (x != 0 && mapModel[x - 1][y].getFill().equals(Color.BLUE) && BlueKeys[x - 1][y] != mapModel[x - 1][y]) {
                                    BlueKeys[x - 1][y] = null;
                                    x--;
                                    System.out.println("ifteyim");
                                } else break;
                            }
                        }
                        break;
                    }
                }
            }
        }
    }
}*/


import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;

public class EndControlBlue {

    public static boolean endControl(Polygon[][] mapModel, int mapSize) {

        Polygon[][] BlueKeys = new Polygon[mapSize][mapSize];


        for (int i = 0; i < mapSize; i++ ){
            for (int j = 0; j < mapSize; j++ ){
                BlueKeys[i][j] = null;
            }
        }

        int x = 0;
        for (int y = 0 ; y < mapSize ; y++) {
            if (mapModel[x][y].getFill().equals(Color.BLUE)) {
                if (FindWay(x , y, BlueKeys, mapModel, mapSize) == true){
                    System.out.println("Oyun Bitti!");
                    GameModel.winner = "Blue";
                    GameModel.labelWinner.setStyle("-fx-text-fill: blue;");
                    GameModel.winnerWriter();
                    return true;

                }
            }
        }
        return false;
    }

    public static boolean FindWay(int x, int y, Polygon[][] BlueKeys, Polygon[][] mapModel, int MapWidth) {
        if (x < 0 || y < 0 || x >= MapWidth || y >= MapWidth) return false;

        if (BlueKeys[x][y] == mapModel[x][y]) return false;

        if (mapModel[x][y].getFill().equals(Color.BLUE) == false) return false;

        if (mapModel[x][y].getFill().equals(Color.BLUE) && x == MapWidth - 1) return true;

        BlueKeys[x][y] = mapModel[x][y];

        return FindWay(x - 1, y, BlueKeys, mapModel, MapWidth) ||
                FindWay(x + 1, y, BlueKeys, mapModel, MapWidth) ||
                FindWay(x, y - 1, BlueKeys, mapModel, MapWidth) ||
                FindWay(x, y + 1, BlueKeys, mapModel, MapWidth) ||
                FindWay(x - 1, y + 1, BlueKeys, mapModel, MapWidth) ||
                FindWay(x + 1, y - 1, BlueKeys, mapModel, MapWidth);
    }
}