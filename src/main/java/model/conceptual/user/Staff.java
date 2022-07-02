package model.conceptual.user;

import model.conceptual.club.Club;
import model.conceptual.contract.Contract;
import model.enumerate.Country;
import model.enumerate.Sex;

import java.util.Date;

public class Staff extends User {
    public Staff(String name, Date birthDate, Sex sex, Country nationality) {
        super(name, birthDate, sex, nationality);
    }
}
