package ui.login_register;

import controller.login_register.LoginRegisterController;
import model.conceptual.club.Club;
import model.enumerate.Country;
import model.enumerate.Sex;
import model.shared.Company;
import model.shared.Converter;
import ui.Utils;

import java.util.Arrays;
import java.util.Date;

public class RegisterUI implements Runnable {

    @Override
    public void run() {

        LoginRegisterController ctrl = new LoginRegisterController();

        System.out.println("REGISTER");

        String name = Utils.readLineFromConsole("Name:");

        Date birthDate = Converter.convertStrToDate(Utils.readLineFromConsole("Birth Date (yyyy/mm/dd):"));

        String email = Utils.readLineFromConsole("Email:");

        String password = Utils.readLineFromConsole("Password:");

        Sex sex = (Sex) Utils.showAndSelectOne(Arrays.asList(Sex.values()), "Sex:");

        Country nationality = (Country) Utils.showAndSelectOne(Arrays.asList(Country.values()), "Country:");

        Club club = (Club) Utils.showAndSelectOne(Company.getClubStore().getClubListName(), "Club:");

        if (ctrl.registerAccount(name, birthDate, sex, nationality, club, email, password)) {
            System.out.println("Register Complete");
            MainMenuUI menuUI = new MainMenuUI();
            menuUI.run();
        } else {
            System.out.println("Cannot Register");
        }
    }
}
