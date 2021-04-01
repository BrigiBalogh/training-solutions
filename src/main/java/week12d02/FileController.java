package week12d02;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FileController {

    private static final String LINE_SEPARATOR = " ";
    private List<SiteS> sites = new ArrayList<>();
    private int lastEvenNumber = 0;
    private int lastOddNumber = -1;
    private int lastNumber;


    public void fileReader() {
        try(BufferedReader reader = new BufferedReader(new InputStreamReader
                (FileReader.class.getResourceAsStream("fence.txt")))) {

            String line;
            lastEvenNumber = 0;
            lastOddNumber = -1;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(LINE_SEPARATOR);
                int side = Integer.parseInt(parts[0]);
                int width = Integer.parseInt(parts[1]);
                char color =parts[2].charAt(0);
                if (side == 0) {
                    lastEvenNumber += 2;
                    lastNumber = lastEvenNumber;
                } else {
                    lastOddNumber += 2;
                    lastNumber = lastOddNumber;
                }
                sites.add(new SiteS(side,width, color, lastNumber));
            }

        }catch(IOException ioe) {
            throw new IllegalStateException("Cannot read file",ioe);
        }
    }

    public List <SiteS> orderedOfWidth(){
        List<SiteS> result = new ArrayList<>(sites);
        Collections.sort(result);
        return result;
    }

    public int lastSiteNumber(){
        SiteS lastSite =sites.get(sites.size()-1);
        return lastSite.getNumberOfSite();
    }

    public void printOddSide() {
        for (SiteS site : sites) {
            if (site.getSide() == 1) {
                System.out.print(site);
            }
        }
        System.out.println();
    }
}
