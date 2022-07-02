package model.conceptual.user;

import model.conceptual.club.Club;
import model.conceptual.contract.Contract;
import model.enumerate.Country;
import model.enumerate.Foot;
import model.enumerate.Position;
import model.enumerate.Sex;
import model.shared.Company;
import model.shared.Validator;

import java.util.Date;

public class Director extends User {

    private String email;

    private String password;

    public Director(String name, Date birthDate, Sex sex, Country nationality, Club club, String email, String password) {
        super(name, birthDate, sex, nationality, club);
        this.email = email;
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean createContract(User user, Date endDate, long salary, long bonus, long value) {
        if (user != null) {
            Contract contract = new Contract(user, endDate, salary, bonus, value);
            user.setContract(contract);
            Company.getContractStore().getContractList().add(contract);
            return true;
        }
        return false;
    }

    public boolean registerPlayer(String name, Date birthDate, Sex sex, Country nationality, Position position, Foot foot) {
        User player = new Player(name, birthDate, sex, nationality, position, foot);
        if (!Company.getUserStore().getUserList().contains(player) && Validator.validateSquadNumber(this.getClub())) {
            Company.getUserStore().getUserList().add(player);
            player.setId(Company.getUserStore().getUserList().size() + 1);
            player.setClub(this.getClub());
            this.getClub().getUserList().add(player);
            return true;
        }
        return false;
    }

    public boolean registerStaff(String name, Date birthDate, Sex sex, Country nationality) {
        User staff = new Staff(name, birthDate, sex, nationality);
        if (!Company.getUserStore().getUserList().contains(staff) && Validator.validateStaffNumber(this.getClub())) {
            Company.getUserStore().getUserList().add(staff);
            staff.setId(Company.getUserStore().getUserList().size() + 1);
            staff.setClub(this.getClub());
            this.getClub().getUserList().add(staff);
            return true;
        }
        return false;
    }

    public boolean doLogin(String inEmail, String inPassword) {
        return this.getEmail().equals(inEmail) && this.getPassword().equals(inPassword) && Company.getUserStore().getUserList().contains(this);
    }

    public boolean registerAccount(String name, Date birthDate, Sex sex, Country nationality, Club club, String email, String password) {
        if (Validator.validateAccount(name, birthDate, sex, nationality, club, email, password)) {
            User director = new Director(name, birthDate, sex, nationality, club, email, password);
            Company.getUserStore().getUserList().add(director);
            director.setId(Company.getUserStore().getUserList().size() + 1);
            return true;
        }
        return false;
    }
}
