package model.conceptual.user;

import model.conceptual.club.Club;
import model.conceptual.contract.Contract;
import model.enumerate.Country;
import model.enumerate.Sex;

import java.util.Date;

public abstract class User {
    private int id;
    private String name;
    private Date birthDate;
    private Sex sex;
    private Contract contract;
    private Country nationality;
    private Club club;

    public User(String name, Date birthDate, Sex sex, Country nationality) {
        this.name = name;
        this.birthDate = birthDate;
        this.sex = sex;
        this.nationality = nationality;
    }

    public User(String name, Date birthDate, Sex sex, Country nationality, Club club) {
        this.name = name;
        this.birthDate = birthDate;
        this.sex = sex;
        this.nationality = nationality;
        this.club = club;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public Sex getSex() {
        return sex;
    }

    public Contract getContract() {
        return contract;
    }

    public Country getNationality() {
        return nationality;
    }

    public Club getClub() {
        return club;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public void setContract(Contract contract) {
        this.contract = contract;
    }

    public void setNationality(Country nationality) {
        this.nationality = nationality;
    }

    public void setClub(Club club) {
        this.club = club;
    }
}
