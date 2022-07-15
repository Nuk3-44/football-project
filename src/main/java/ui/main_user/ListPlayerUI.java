package ui.main_user;

import model.conceptual.user.User;
import model.shared.Company;

public class ListPlayerUI implements Runnable {

    @Override
    public void run() {

        for (User player : Company.getUserStore().getPlayerList()) {
            System.out.printf("%d - %s - %s\n", player.getId(), player.getName(), player.getClub().getName());
        }

    }
}
