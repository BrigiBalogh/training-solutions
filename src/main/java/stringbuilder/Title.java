package stringbuilder;

public enum Title {

    MR("Mr."), MRS("Mrs."), MS("Ms."), PROF("Prof."), DR("Dr.");

    private String titles;

    Title(String titles) {
        this.titles = titles;
    }

    public String getTitles() {
        return titles;
    }
}
