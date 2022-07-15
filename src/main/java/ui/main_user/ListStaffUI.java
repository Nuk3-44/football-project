package ui.main_user;

import model.conceptual.user.User;
import model.shared.Company;

public class ListStaffUI implements Runnable {
    @Override
    public void run() {
        for (User staff : Company.getUserStore().getStaffList()) {
            System.out.printf("%d - %s - %s\n", staff.getId(), staff.getName(), staff.getClub().getName());
        }
    }
}
