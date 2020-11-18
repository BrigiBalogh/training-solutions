package stringbasic;

public class StringCreator {

    public String createStringForHeap() {
        return new String("window");
    }

    public String createStringForPool() {
        return "window";
    }
}
