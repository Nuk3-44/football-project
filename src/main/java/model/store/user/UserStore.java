package model.store.user;

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
}
