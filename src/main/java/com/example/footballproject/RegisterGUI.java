package com.example.footballproject;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import model.conceptual.club.Club;
import model.enumerate.Country;
import model.enumerate.Sex;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class RegisterGUI implements Initializable {

    @FXML
    private Button btnConfirm;

    @FXML
    private Button btnBack;

    @FXML
    private TextField txtName;

    @FXML
    private TextField txtBirthDate;

    @FXML
    private TextField txtEmail;

    @FXML
    private PasswordField txtPassword;

    @FXML
    private PasswordField txtConfirmPassword;

    @FXML
    private ChoiceBox<Sex> boxSex;

    @FXML
    private ChoiceBox<Country> boxNationality;

    @FXML
    private ChoiceBox<Club> boxClub;

    private static Stage myStage;

    public static Stage getMyStage() {
        return myStage;
    }

    public static void setMyStage(Stage myStage) {
        RegisterGUI.myStage = myStage;
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        myStage = MainMenuGUI.getMyStage();
    }

    @FXML
    public void confirmRegister(ActionEvent actionEvent) {

    }

    @FXML
    public void backStage(ActionEvent actionEvent) {
        FXMLLoader fxmlLoader = new FXMLLoader(RegisterGUI.class.getResource("main.fxml"));
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
