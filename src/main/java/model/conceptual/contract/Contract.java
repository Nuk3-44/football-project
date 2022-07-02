package model.conceptual.contract;

import model.conceptual.user.User;

import java.util.Date;

public class Contract {

    private User user;
    private Date endDate;
    private long salary;
    private long bonus;
    private long value;

    public Contract(User user, Date endDate, long salary, long bonus, long value) {
        this.user = user;
        this.endDate = endDate;
        this.salary = salary;
        this.bonus = bonus;
        this.value = value;
    }

    public User getUser() {
        return user;
    }

    public Date getEndDate() {
        return endDate;
    }

    public long getSalary() {
        return salary;
    }

    public long getBonus() {
        return bonus;
    }

    public long getValue() {
        return value;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    public void setBonus(long bonus) {
        this.bonus = bonus;
    }

    public void setValue(long value) {
        this.value = value;
    }
}
