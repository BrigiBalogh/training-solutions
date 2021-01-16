package catalog;

public class SearchCriteria {


    public String contributor;
    public String title;

    public static SearchCriteria createByBoth(String contributor,String title) {

    }

    public static SearchCriteria createByContributor(String contributor) {


    }
    public static SearchCriteria createByTitle(String title) {

    }

    public boolean hasContributor(){

    }

    public boolean hasTitle(){

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
