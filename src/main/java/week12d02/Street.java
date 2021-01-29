package week12d02;

import java.util.ArrayList;
import java.util.List;

public class Street {

    private List<Site> soldSites = new ArrayList<>();
    private int lastEvenNumber = 0;
    private int lastOddNumber = -1;
    private int lastNumber;

    public void sellSite (Site site) {
        soldSites.add(site);
        if (site.getSite() == 0) {
            lastEvenNumber += 2;
            lastNumber = lastEvenNumber;
        } else {
            lastOddNumber += 2;
            lastNumber = lastOddNumber;
        }
    }

    public int lastSoldSite() {
        return lastNumber;
    }

    // fenceTypeNumber[0]: PERFECT állapotú kerítések száma
    /*public int[] getNumberOfFenceType() {
        int[] fenceTypeNumber = new int[3];
        for (Site site : soldSites) {
            if (site.getFenceType() == Fence.PERFECT) {
                fenceTypeNumber[0]++;
            }
            else if (site.getFenceType() == Fence.NEED_UPGRADE) {
                fenceTypeNumber[1]++;
            }
            else if (site.getFenceType() == Fence.NO_FENCE) {
                fenceTypeNumber[2]++;
            }
        }
        return fenceTypeNumber;
    }*/

    /*public int[] getNumberOfFenceType() {
        int[] fenceTypeNumber = new int[3];
        for (Site site : soldSites) {
            if (site.getFenceType() == Fence.PERFECT) {
                fenceTypeNumber[Fence.PERFECT.getIndex()]++;
            }
            else if (site.getFenceType() == Fence.NEED_UPGRADE) {
                fenceTypeNumber[Fence.NEED_UPGRADE.getIndex()]++;
            }
            else if (site.getFenceType() == Fence.NO_FENCE) {
                fenceTypeNumber[Fence.NO_FENCE.getIndex()]++;
            }
        }
        return fenceTypeNumber;
    }*/

    public int[] getNumberOfFenceType() {
        int[] fenceTypeNumber = new int[3];
        for (Site site : soldSites) {
            fenceTypeNumber[site.getFenceType().getIndex()]++;
        }
        return fenceTypeNumber;
    }
}
