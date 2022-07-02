package com.example.footballproject;

import controller.login_register.LoginRegisterController;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import model.conceptual.user.Director;

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

    private static Director director;

    private static LoginRegisterController ctrl;

    private static Stage myStage;

    public static Director getDirector() {
        return director;
    }

    public static LoginRegisterController getCtrl() {
        return ctrl;
    }

    public static Stage getMyStage() {
        return myStage;
    }

    public static void setDirector(Director director) {
        DoLoginGUI.director = director;
    }

    public static void setCtrl(LoginRegisterController ctrl) {
        DoLoginGUI.ctrl = ctrl;
    }

    public static void setMyStage(Stage myStage) {
        DoLoginGUI.myStage = myStage;
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        ctrl = new LoginRegisterController();
        myStage = MainMenuGUI.getMyStage();
    }

    @FXML
    public void confirmLogin(ActionEvent actionEvent) {
        String email = txtEmail.getText();
        String password = txtPassword.getText();
        director = (Director) ctrl.doLogin(email, password);
        if (director != null) {
            Alert a = new Alert(Alert.AlertType.CONFIRMATION);
            a.setTitle("Login Complete");
            a.setContentText("Login Complete!");
            a.show();
        } else {
            Alert a = new Alert(Alert.AlertType.ERROR);
            a.setTitle("Invalid Login");
            a.setContentText("Invalid email/password");
            a.show();
        }
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
        myStage.setFullScreen(true);
    }
}
