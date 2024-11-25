package test.homework.fxml.javafx_fxml;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainScreenApplication extends Application {

    private static Stage stage;
    @Override
    public void start(Stage primaryStage) throws Exception {
        stage=primaryStage;
        FXMLLoader fxmlLoader = new FXMLLoader(MainScreenApplication.class.getResource("MainScreen.fxml"));
        Scene scene=new Scene(fxmlLoader.load(),500,300);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Game Settings");
        primaryStage.show();
    }
    public static Stage getStage() {
        return stage;
    }

}
