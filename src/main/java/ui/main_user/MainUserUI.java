package ui.main_user;

import model.conceptual.user.User;
import ui.Utils;
import ui.login_register.LoginUI;
import ui.login_register.MainMenuUI;

import java.util.ArrayList;
import java.util.List;

public class MainUserUI implements Runnable {

    private static User mainUser;

    public static User getMainUser() {
        return mainUser;
    }

    public static void setMainUser(User mainUser) {
        MainUserUI.mainUser = mainUser;
    }

    @Override
    public void run() {

        System.out.println("MAIN USER UI");

        List<String> optionList = new ArrayList<>();
        optionList.add("List Clubs");
        optionList.add("List Players");
        optionList.add("List Staff");
        optionList.add("Exit");

        int option = Utils.showAndSelectIndex(optionList, "Select an Option:");

        switch (option) {
            case 0:
                ListClubUI clubUI = new ListClubUI();
                clubUI.run();
                break;
            case 1:
                ListPlayerUI playerUI = new ListPlayerUI();
                playerUI.run();
                break;
            case 2:
                ListStaffUI staffUI = new ListStaffUI();
                staffUI.run();
                break;
            case 3:
                MainMenuUI menuUI = new MainMenuUI();
                menuUI.run();
                break;
            default:
                System.out.println("Invalid Option");
                break;
        }

    }
}
