package catalog;

public class SearchCriteria {


    public String contributor;
    public String title;

    public static SearchCriteria createByBoth(String title, String contributor) {
        return new SearchCriteria(contributor, title);
    }

    public static SearchCriteria createByContributor(String contributor) {
        return new SearchCriteria(contributor, null);
    }
    public static SearchCriteria createByTitle(String title) {
        return new SearchCriteria(null, title);
    }

    public boolean hasContributor(){
        if (contributor != null)
            return true;
        else
            return false;
    }

    public boolean hasTitle(){
        return title != null;
    }


    private  SearchCriteria(String contributor, String title) {
        this.contributor = contributor;
        this.title = title;
    }

    public String getContributor() {
        return contributor;
    }

    public String getTitle() {
        return title;
    }
}
