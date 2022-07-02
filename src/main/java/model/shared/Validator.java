package model.shared;

import model.conceptual.club.Club;
import model.conceptual.user.Director;
import model.conceptual.user.User;
import model.enumerate.Country;
import model.enumerate.Sex;

import java.util.Date;
import java.util.List;

public abstract class Validator {

    public static boolean validateSquadNumber(Club club) {
        final int MAX_PLAYERS = 25;
        List<User> playerList = club.getPlayerList();
        return playerList.size() < MAX_PLAYERS;
    }

    public static boolean validateStaffNumber(Club club) {
        final int MAX_STAFF = 10;
        List<User> staffList = club.getStaffList();
        return staffList.size() < MAX_STAFF;
    }

    public static boolean validateAccount(String name, Date birthDate, Sex sex, Country nationality, Club club, String email, String password) {
        Director director = new Director(name, birthDate, sex, nationality, club, email, password);
        return !emailExists(email) && !passwordExists(password);
    }

    public static boolean emailExists(String email) {
        for (User director : Company.getUserStore().getUserList()) {
            if (director instanceof Director) {
                if (((Director) director).getEmail().equals(email)) {
                    return true;
                }
            }

        }
        return false;
    }

    public static boolean passwordExists(String password) {
        for (User director : Company.getUserStore().getUserList()) {
            if (director instanceof Director) {
                if (((Director) director).getPassword().equals(password)) {
                    return true;
                }
            }

        }
        return false;
    }
}
