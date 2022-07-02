package com.example.footballproject;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class DoLoginGUI implements Initializable {

    @FXML
    private TextField txtEmail;

    @FXML
    private PasswordField txtPassword;

    @FXML
    private Button btnConfirm;

    @FXML
    private Button btnBack;

    private static Stage myStage;

    public static Stage getMyStage() {
        return myStage;
    }

    public static void setMyStage(Stage myStage) {
        DoLoginGUI.myStage = myStage;
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        myStage = MainMenuGUI.getMyStage();
    }

    @FXML
    public void confirmLogin(ActionEvent actionEvent) {

    }

    @FXML
    public void backStage(ActionEvent actionEvent) {
        FXMLLoader fxmlLoader = new FXMLLoader(DoLoginGUI.class.getResource("main.fxml"));
        Scene scene = null;
        try {
            scene = new Scene(fxmlLoader.load());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        myStage.setScene(scene);
        myStage.setTitle("Football");
        myStage.show();
    }
}
