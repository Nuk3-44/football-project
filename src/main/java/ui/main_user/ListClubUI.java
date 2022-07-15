package ui.main_user;

import model.conceptual.club.Club;
import model.shared.Company;
import ui.DirectorUI;
import ui.Utils;

public class ListClubUI implements Runnable {

    @Override
    public void run() {

        for (Club club : Company.getClubStore().getClubList()) {
            System.out.println(club.getName());
        }

    }
}
