package exam03retake02;



public class Todo {

    private String text;
    private int priority;
    private State state;

    public Todo(String text, int priority) {
        this.text = text;
        this.priority = priority;
    }

    public Todo(String text) {
    }

    public void complete() {
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
