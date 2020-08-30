package HomeWork9;

public class Priority {

    private PriorityEnum priority;

    public Priority(PriorityEnum priority){
        this.priority = priority;

    }

    @Override
    public String toString() {
        if(priority == priority.URGENTLY) {
            return "Срочное дело";
        }else return "Не срочное";
    }
}
