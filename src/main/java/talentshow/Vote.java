package talentshow;

public class Vote {

    private long id;
    private int number;

    public Vote(long id, int number) {
        this.id = id;
        this.number = number;
    }

    public long getId() {
        return id;
    }

    public int getNumber() {
        return number;
    }

    public void incNumber() {
        this.number += 1;
    }
}
