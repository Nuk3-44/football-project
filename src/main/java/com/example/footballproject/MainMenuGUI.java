package com.example.footballproject;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class MainMenuGUI implements Initializable {

    @FXML
    private Button btnLogin;

    @FXML
    private Button btnRegister;

    private static Stage myStage;

    public static Stage getMyStage() {
        return myStage;
    }

    public static void setMyStage(Stage myStage) {
        MainMenuGUI.myStage = myStage;
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        myStage = HelloApplication.getMyStage();
    }

    @FXML
    public void doLogin(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("do-login.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        myStage.setScene(scene);
        myStage.setTitle("Login");
        myStage.show();
        myStage.setFullScreen(true);
    }

    @FXML
    public void registerAccount(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(MainMenuGUI.class.getResource("register.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        myStage.setScene(scene);
        myStage.setTitle("Register");
        myStage.show();
        myStage.setFullScreen(true);
    }


}