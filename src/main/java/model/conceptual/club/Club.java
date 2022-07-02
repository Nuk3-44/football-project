package model.conceptual.club;

import model.conceptual.user.Player;
import model.conceptual.user.Staff;
import model.conceptual.user.User;
import model.enumerate.Country;

import java.util.ArrayList;
import java.util.List;

public class Club {

    private String name;
    private Country country;
    private List<User> userList;

    public Club(String name, Country country) {
        this.name = name;
        this.country = country;
        this.userList = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public Country getCountry() {
        return country;
    }

    public List<User> getUserList() {
        return userList;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }

    public List<User> getPlayerList() {
        List<User> playerList = new ArrayList<>();
        for (User user : userList) {
            if (user instanceof Player) {
                playerList.add(user);
            }
        }
        return playerList;
    }

    public List<User> getStaffList() {
        List<User> staffList = new ArrayList<>();
        for (User user : userList) {
            if (user instanceof Staff) {
                staffList.add(user);
            }
        }
        return staffList;
    }
}
