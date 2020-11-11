package arrays;

import java.util.Arrays;
import java.util.List;

public class ArraysMain {

    public String numberOfDaysAsString() {
        int[] numberOfDays= {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        return Arrays.toString(numberOfDays);
    }

    public List<String> daysOfWeek() {
        return Arrays.asList("hétfő","kedd","szerda","csütörtök","péntek","szombat","vasárnap");
    }

    public String multiplicationTableAsString(int size) {
      int[][] multiplicationTable= new int[size][size];
      for (int i=0; i<size; i++) {
          for(int b=0; b<size; b++) {
              multiplicationTable[i][b]=(i+1)*(b+1);
          }
      }
      return Arrays.deepToString(multiplicationTable);
    }

    public boolean sameTempValues(double[] day,double[] anotherday) {
        return Arrays.equals(day,anotherday);
    }

    public boolean wonlottery(int[] winner, int[] stake) {
     int[] copyOfWinner=Arrays.copyOf(winner,winner.length);
     int[] copyOfStake=Arrays.copyOf(stake,stake.length);
     Arrays.sort(copyOfWinner);
     Arrays.sort(copyOfStake);
     return Arrays.equals(copyOfWinner,copyOfStake);
    }

    private int min(int a, int b) {
        if (a<b) {
            return a;
        }
        else {
            return b;
        }
    }

    public boolean sameTempValuesDaylight(double[] day,double[] anotherday) {
       int min=min(day.length, anotherday.length);
       double[] rangeOfDay=Arrays.copyOfRange(day,0,min);
       double[] rangeOfAnotherDay=Arrays.copyOfRange(anotherday,0,min);
       return Arrays.equals(rangeOfDay,rangeOfAnotherDay);
    }


    public static void main(String[] args) {
        ArraysMain arraysMain =new ArraysMain();

        System.out.println(arraysMain.numberOfDaysAsString());

        System.out.println(arraysMain.daysOfWeek());

        System.out.println(arraysMain.multiplicationTableAsString(10));

        System.out.println(arraysMain.sameTempValues(new double[] {1, 2,.3}, new double[] {1, 2, 3}));
        System.out.println(arraysMain.sameTempValues(new double[] {1, 2,.3}, new double[] {2, 2, 3}));

        System.out.println(arraysMain.sameTempValuesDaylight(new double[] {1, 2}, new double[] {2, 2, 3}));
        System.out.println(arraysMain.sameTempValuesDaylight(new double[] {1, 3}, new double[] {2, 2, 3}));

        int[] winner= new int[] {1, 2, 3, 4, 5};
        int[] stake= new int[]{5, 4, 3, 2, 1};
        System.out.println(arraysMain.wonlottery(winner,stake));
        System.out.println(Arrays.toString(stake));

        System.out.println(arraysMain.wonlottery(new int[]{1, 2, 3}, new int[]{1, 2, 2}));
    }
}
