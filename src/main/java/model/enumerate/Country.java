package model.enumerate;

import model.shared.Constant;

public enum Country {
    PORTUGAL("Portuguese", Constant.EUROPE),
    SPAIN("Spanish", Constant.EUROPE),
    FRANCE("French", Constant.EUROPE),
    ITALY("Italian", Constant.EUROPE),
    BRAZIL("Brazilian", Constant.SOUTH_AMERICA);

    private String nationality;

    private String continent;

    Country(String nationality, String continent) {
        this.nationality = nationality;
        this.continent = continent;
    }

    public String getNationality() {
        return nationality;
    }

    public String getContinent() {
        return continent;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }
}
