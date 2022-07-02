package model.conceptual.user;

import model.conceptual.contract.Contract;
import model.enumerate.Country;
import model.enumerate.Foot;
import model.enumerate.Position;
import model.enumerate.Sex;

import java.util.Date;

public class Player extends User {

    private Position position;

    private Foot foot;

    public Player(String name, Date birthDate, Sex sex, Country nationality, Position position, Foot foot) {
        super(name, birthDate, sex, nationality);
        this.position = position;
        this.foot = foot;
    }

    public Position getPosition() {
        return position;
    }

    public Foot getFoot() {
        return foot;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public void setFoot(Foot foot) {
        this.foot = foot;
    }
}
