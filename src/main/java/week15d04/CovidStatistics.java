package week15d04;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CovidStatistics {




        public List<Cases> readLines(BufferedReader reader) throws IOException {
            List<Cases> casesList = new ArrayList<>();

            reader.readLine();
            String line;
            while ((line = reader.readLine())  != null) {
                String[] parts =line.split(",");
                LocalDate date = LocalDate.parse(parts[0], DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                String week = parts[1];
                int cases = Integer.parseInt(parts[2]);
                int deaths = Integer.parseInt(parts[3]);
                String country =parts[4];
                Cases c = new Cases(date, week, cases, deaths, country);
                casesList.add(c);
            }
            return casesList;
        }

        public List<Cases> filterHungary(List<Cases> casesList ) {
            List< Cases> hungary = new ArrayList<>();
            for (Cases c : casesList) {
                if(c.getCountry().equals("Hungary")) {
                    hungary.add(c);
                }
            }
            return hungary;
        }

        public List<Cases> topThree (List<Cases> hungary) {
            CasesDescComparator comp = new CasesDescComparator();
            List<Cases> sortedHungary = new ArrayList<>(hungary);
            Collections.sort(sortedHungary, comp);
            List<Cases> ret = List.of(sortedHungary.get(0), sortedHungary.get(1), sortedHungary.get(2));
            return ret;
        }
        // különbség: milyen comparatort használsz: más-más comparator osztályok
        // teljes listára: week szerinti növekvő sorrend
        // halálozás szerinti csökkenő
        // halálozás szerinti növekvő


        public static void main(String[] args) {
            try (BufferedReader reader = Files.newBufferedReader(Path.of("data.csv"))) {
                new CovidStatistics().readLines(reader);
            } catch (IOException ioe) {
                throw new IllegalStateException("Can not read file", ioe);
            }
        }


}
