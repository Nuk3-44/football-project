package model.conceptual.user;

import model.conceptual.club.Club;
import model.conceptual.contract.Contract;
import model.enumerate.Country;
import model.enumerate.Sex;
import model.enumerate.StaffCategory;

import java.util.Date;

public class Staff extends User {

    private StaffCategory category;

    public Staff(String name, Date birthDate, Sex sex, Country nationality, StaffCategory category) {
        super(name, birthDate, sex, nationality);
        this.category = category;
    }

    public StaffCategory getCategory() {
        return category;
    }

    public void setCategory(StaffCategory category) {
        this.category = category;
    }
}
