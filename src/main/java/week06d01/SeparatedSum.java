package week06d01;

import java.util.ArrayList;
import java.util.List;

public class SeparatedSum {

    public List<Double> sum (String s) {

        double sumNegative = 0;
        double sumPositive = 0;
        String[] m = s.split(";");

        for (int i = 0; i < m.length; i++) {
            String numStr = m[i].replace(',', '.');
            double numbers = Double.parseDouble(numStr);
            if (numbers < 0){
                sumNegative += numbers;
            }
            if(numbers > 0) {
                sumPositive += numbers;
            }

        }
        List<Double> ret = new ArrayList<>();
        ret.add(sumNegative); // 0.
        ret.add(sumPositive); // 1.
        return ret;
    }

    public static void main(String[] args) {
        SeparatedSum ss = new SeparatedSum();
        List<Double> x = ss.sum("1,2;3,45;2;-1,23;-4,5");
        System.out.println(x);
    }
}
/*  Írj egy SeparatedSum.sum(String s) metódust, mely kap egy String-et,
 melyben lebegőpontos számok szerepelnek pontosvesszővel elválasztva.
  A számoknál vessző a tizedeselválasztó. Ezt szétszedi,
   és összeadja külön a  pozitív és külön a negatív számokat. Mivel térnél vissza ebből a metódusból? */