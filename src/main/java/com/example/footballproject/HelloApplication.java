package com.example.footballproject;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {

    private static Stage myStage;

    public static Stage getMyStage() {
        return myStage;
    }

    public static void setMyStage(Stage myStage) {
        HelloApplication.myStage = myStage;
    }

    @Override
    public void start(Stage stage) throws IOException {
        myStage = stage;
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("main.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        myStage.setTitle("Football");
        myStage.setScene(scene);
        myStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}