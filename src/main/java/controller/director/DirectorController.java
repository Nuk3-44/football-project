package controller.director;

import model.conceptual.club.Club;
import model.conceptual.user.Director;
import model.conceptual.user.User;
import model.enumerate.*;

import java.util.Date;

public class DirectorController {

    private Director director;

    public DirectorController(Director director) {
        this.director = director;
    }

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    public boolean createContract(User user, Date endDate, long salary, long bonus, long value) {
        return director.createContract(user, endDate, salary, bonus, value);
    }

    public boolean registerPlayer(String name, Date birthDate, Sex sex, Country nationality, Position position, Foot foot) {
        return director.registerPlayer(name, birthDate, sex, nationality, position, foot);
    }

    public boolean registerStaff(String name, Date birthDate, Sex sex, Country nationality, StaffCategory category) {
        return director.registerStaff(name, birthDate, sex, nationality, category);
    }
}
