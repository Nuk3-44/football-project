package com.example.footballproject;

import controller.login_register.LoginRegisterController;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;
import model.conceptual.club.Club;
import model.enumerate.Country;
import model.enumerate.Sex;
import model.shared.Company;
import model.shared.Converter;

import java.io.IOException;
import java.net.URL;
import java.util.Date;
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

    private static LoginRegisterController ctrl;

    private static Stage myStage;

    public static LoginRegisterController getCtrl() {
        return ctrl;
    }

    public static Stage getMyStage() {
        return myStage;
    }

    public static void setCtrl(LoginRegisterController ctrl) {
        RegisterGUI.ctrl = ctrl;
    }

    public static void setMyStage(Stage myStage) {
        RegisterGUI.myStage = myStage;
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        ctrl = new LoginRegisterController();
        myStage = MainMenuGUI.getMyStage();

        boxSex.getItems().addAll(Sex.values());
        boxNationality.getItems().addAll(Country.values());
        boxClub.getItems().addAll(Company.getClubStore().getClubList());
    }

    @FXML
    public void confirmRegister(ActionEvent actionEvent) {
        String name = txtName.getText();
        Date birthDate = Converter.convertStrToDate(txtBirthDate.getText());
        String email = txtEmail.getText();
        String password = txtPassword.getText();
        String confirmPassword = txtConfirmPassword.getText();
        Sex sex = boxSex.getValue();
        Country nationality = boxNationality.getValue();
        Club club = boxClub.getValue();

        if (password.equals(confirmPassword)) {
            if (ctrl.registerAccount(name, birthDate, sex, nationality, club, email, password)) {
                Alert a = new Alert(Alert.AlertType.CONFIRMATION);
                a.setTitle("Register Complete");
                a.setContentText("Register Complete!");
                a.show();
            } else {
                Alert a = new Alert(Alert.AlertType.ERROR);
                a.setTitle("Invalid Register");
                a.setContentText("Cannot Register Account");
                a.show();
            }
        } else {
            Alert a = new Alert(Alert.AlertType.ERROR);
            a.setTitle("Invalid Password");
            a.setContentText("Confirmation Password Is Different");
            a.show();
        }

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
        myStage.setFullScreen(true);
    }
}
