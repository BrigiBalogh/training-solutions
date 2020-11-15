package intromethods;

public class Todo
{
    private String caption;

    private boolean finished;

    public Todo(String caption) {
        this.caption = caption;
    }

    public String getCaption() // értéket add át amit feltudunk használni
    {
        return caption;
    }

    public boolean isFinished() {
        return finished;
    }

    public void finish()
    {
        finished = true;  // true értékkel tér vissza
    }

    @Override
    public String toString()
    {
        return caption + " (" + (finished ? "finished" : "not finished") + ")";
    }

}
