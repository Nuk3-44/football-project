package model.conceptual;

public class Injury {

    private String description;

    private int recoveryTime;

    public Injury(String description, int recoveryTime) {
        this.description = description;
        this.recoveryTime = recoveryTime;
    }

    public String getDescription() {
        return description;
    }

    public int getRecoveryTime() {
        return recoveryTime;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setRecoveryTime(int recoveryTime) {
        this.recoveryTime = recoveryTime;
    }
}
