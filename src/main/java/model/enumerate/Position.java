package model.enumerate;

public enum Position {
    GK("Goalkeeper"),
    CB("Center Back"),
    RB("Right Back"),
    LB("Left Back"),
    RWB("Right Wing Back"),
    LWB("Left Wing Back"),
    CDM("Defensive Midfielder"),
    CM("Center Midfielder"),
    RM("Right Midfielder"),
    LM("Left Midfielder"),
    CAM("Attacking Midfielder"),
    RW("Right Winger"),
    LW("Left Winger"),
    CF("Centre Forward"),
    LF("Left Forward"),
    RF("Right Forward"),
    ST("Striker");

    private String description;

    Position(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
