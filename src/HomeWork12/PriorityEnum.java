package HomeWork12;

public enum PriorityEnum {
    URGENTLY("Срочное"),
    NON_URGENT("Не срочное");

    private String priority;

    PriorityEnum(String priority) {
        this.priority = priority;
    }

    public String getPriority() {
        return priority;
    }

    @Override
    public String toString() {
        return  priority;
    }
}

