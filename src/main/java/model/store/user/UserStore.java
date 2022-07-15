package model.store.user;

import model.conceptual.user.Player;
import model.conceptual.user.Staff;
import model.conceptual.user.User;

import java.util.ArrayList;
import java.util.List;

public class UserStore {

    private List<User> userList;

    public UserStore() {
        this.userList = new ArrayList<>();
    }

    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }

    public User getUserById(int id) {
        for (User user : userList) {
            if (user != null && user.getId() == id) {
                return user;
            }
        }
        return null;
    }

    public List<User> getPlayerList() {
        List<User> playerList = new ArrayList<>();
        for (User player : userList) {
            if (player instanceof Player) {
                playerList.add(player);
            }
        }
        return playerList;
    }

    public List<User> getStaffList() {
        List<User> staffList = new ArrayList<>();
        for (User staff : userList) {
            if (staff instanceof Staff) {
                staffList.add(staff);
            }
        }
        return staffList;
    }
}
