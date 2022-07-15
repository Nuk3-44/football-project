package ui.login_register;

import ui.Utils;
import ui.login_register.LoginUI;
import ui.login_register.RegisterUI;

import java.util.Arrays;

public class MainMenuUI implements Runnable {

    @Override
    public void run() {

        System.out.println("MAIN MENU:");

        String[] arrOption = {"Login", "Register"};

        String option = (String) Utils.showAndSelectOne(Arrays.asList(arrOption), "Select an Option:");

        if (option.equals(arrOption[0])) {
            LoginUI loginUI = new LoginUI();
            loginUI.run();
        } else if (option.equals(arrOption[1])) {
            RegisterUI registerUI = new RegisterUI();
            registerUI.run();
        }
    }
}
