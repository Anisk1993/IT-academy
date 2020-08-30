package HomeWork9;

import java.util.Date;

public class Planer {

    private String name;
    private Date date;
    public PriorityEnum priority;

    public Planer(String name, Date date, PriorityEnum priority) {
        this.name = name;
        this.date = date;
        this.priority = priority;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public PriorityEnum getPriority() {
        return priority;
    }

    public void setPriority(PriorityEnum priority) {
        this.priority = priority;
    }

    @Override
    public String toString() {
        return  "задача: " + name + " " + date + " " + priority;
    }

}
