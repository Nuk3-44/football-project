package controller.login_register;

import model.conceptual.club.Club;
import model.conceptual.user.Director;
import model.conceptual.user.User;
import model.enumerate.Country;
import model.enumerate.Sex;
import model.shared.Company;
import model.shared.Converter;
import model.shared.Validator;
import model.store.user.UserStore;

import java.util.Date;

public class LoginRegisterController {

    public boolean registerAccount(String name, Date birthDate, Sex sex, Country nationality, Club club, String email, String password) {
        if (Validator.validateAccount(name, birthDate, sex, nationality, club, email, password)) {
            User director = new Director(name, birthDate, sex, nationality, club, email, password);
            Company.getUserStore().getUserList().add(director);
            director.setId(Company.getUserStore().getUserList().size() + 1);
            return true;
        }
        return false;
    }

    public User doLogin(String inEmail, String inPassword) {
        if (Validator.emailExists(inEmail) && Validator.passwordExists(inPassword)) {
            for (User user : Company.getUserStore().getUserList()) {
                if (((Director) user).getEmail().equals(inEmail) && ((Director) user).getPassword().equals(inPassword)) {
                    return user;
                }
            }
        }
        return null;
    }
}
