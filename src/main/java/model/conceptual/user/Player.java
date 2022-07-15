package model.conceptual.user;

import model.conceptual.club.Club;
import model.conceptual.contract.Contract;
import model.enumerate.*;

import java.util.Date;

public class Player extends User {

    private Position position;

    private Foot foot;

    private Condition condition;

    public Player(String name, Date birthDate, Sex sex, Country nationality, Position position, Foot foot, Club club) {
        super(name, birthDate, sex, nationality, club);
        this.position = position;
        this.foot = foot;
        this.condition = Condition.READY;
    }

    public Position getPosition() {
        return position;
    }

    public Foot getFoot() {
        return foot;
    }

    public Condition getCondition() {
        return condition;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public void setFoot(Foot foot) {
        this.foot = foot;
    }

    public void setCondition(Condition condition) {
        this.condition = condition;
    }
}
