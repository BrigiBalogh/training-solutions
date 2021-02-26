package exam03retake02;



public class Todo {

    public static final int MAX_PRIORITY = 1;
    public static final int MIN_PRIORITY = 5;

    private String text;
    private int priority;
    private State state;

    public Todo(String text, int priority) {
        if (priority < MAX_PRIORITY || priority > MIN_PRIORITY) {
            throw new IllegalArgumentException("priority invalid " + priority);
        }
        this.text = text;
        this.priority = priority;
        this.state = State.NON_COMPLETED;
    }

    public Todo(String text) {
    }

    public void complete() {
        this.state = State.COMPLETED;
    }


    public String getText() {
        return text;
    }

    public int getPriority() {
        return priority;
    }

    public State getState() {
        return state;
    }
}
