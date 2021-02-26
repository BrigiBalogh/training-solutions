package week12d03;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/*   Készítsd el a week12d03.NumberStat osztályt melyben legyen egy metódus,
 ami paraméterül vár egy egész számokból álló listát.
 Add vissza azt a számot amelyik pontosan egyszer szerepel a listában.
 Ha több ilyen szám van akkor a kisebbet!
 Ellenőrizd, hogy olyan listát fogadunk el, ami legalább 1 elemű,
  ha a lista nem ilyen, dobj kivételt! pl: {1,1,5,3,4,5,6,5,6,4,1,6,5,4} A megoldás: 3
  Bónusz: Módosítsd az osztályt. Legyen egy egész számokból álló lista attribútuma.
   A fent megírt metódus ezen a listán dolgozzon. A lista elemeit fájlból töltsük fel.
   A file úgy néz ki, hogy egy sorban három szám van vesszővel elválasztva. Tehát:

1,1,4
2,3,5
2,2,5  */



public class NumberStat {

    private List<Integer> numbers = new ArrayList<>();

    public int numberFiltered(List<Integer>numbers) {
        if (numbers.isEmpty()) {
            throw new IllegalStateException( "List is empty.");
        }
        if (numbers.size() ==1) {
            return numbers.get(0);
        }

        List<Integer> sortedNumbers = new ArrayList<>(numbers);
        Collections.sort(sortedNumbers);

        if (sortedNumbers.size() == 2) {
            if (sortedNumbers.get(0) != sortedNumbers.get(1)) {
                return sortedNumbers.get(0);
            } else {
                throw new IllegalStateException("Wrong list");
            }
        }
        // Legalább 3 elemű
        if (sortedNumbers.get(0) != sortedNumbers.get(1)) {
            return sortedNumbers.get(0);
        }
        for (int i = 1; i < sortedNumbers.size() - 1; i++) {
            if (sortedNumbers.get(i -1) != sortedNumbers.get(i) && sortedNumbers.get(i + 1) != sortedNumbers.get(i)) {
                return sortedNumbers.get(i);
            }
        }
        if (sortedNumbers.get(sortedNumbers.size()-1) != sortedNumbers.get(sortedNumbers.size()-2)) {
            return sortedNumbers.get(sortedNumbers.size()-1);
        }

        throw new IllegalStateException("Wrong list");
    }

    public List<Integer> getNumbers() {
        return numbers;
    }

    public void readFromFile(String fileName) {
        Path file = Path.of(fileName);

        try(BufferedReader br = Files.newBufferedReader(file)) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] temp = line.split(",");
                addNumbers(temp);
            }

           }catch (IOException e) {
            throw new IllegalArgumentException("File is wrong", e);
        }
    }

    private void addNumbers(String[] temp) {
        for (String s : temp) {
            numbers.add(Integer.parseInt(s));
        }
    }
}
