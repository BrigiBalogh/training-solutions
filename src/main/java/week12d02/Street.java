package week12d02;

import java.util.ArrayList;
import java.util.List;

public class Street {

    private List<Site> soldSites = new ArrayList<>();

    public void sellSite (Site site) {
        soldSites.add(site);
    }

    public int lastSoldSite() {
        Site lastSite = soldSites.get(soldSites.size()-1);
        int result = 0;
        for(Site site : soldSites) {
            if (lastSite.getSite()== site.getSite());
        }
    }
}
