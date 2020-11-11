package arrayofarrays;

public class ArrayOfArraysMain {

    public int [][] multiplicationTable (int size) {
        int [][] multiplicationTable= new int[size][size];
        for (int i= 0; i< size;i++) {
            for (int b = 0; b < size; b++) {
                multiplicationTable[i][b] = (i + 1) * (b + 1);
            }
        }
        return multiplicationTable;
    }

    public void printArrayOfArrays( int[][] a) {
        for (int i[]:a) {
            for (int b:i) {
                if (b<10) {
                    System.out.println(" ");
                } else if (b<100) {
                    System.out.println(" ");
                }
                System.out.println(b);
                System.out.println(" ");
            }
            System.out.println();
        }
    }

    public int[][] triangularMatrix(int size) {
        int[][] triangularMatrix= new int[size][];
        for (int i=0;i< triangularMatrix.length;i++) {
            triangularMatrix[i]= new int[i+1];
            for (int b=0; b<i+1;b++) {
                triangularMatrix[i][b]=i;
            }
        }
        return triangularMatrix;
    }

    public int[][] getValues() {
        int [][] values= new int[12][];
        int[] numberOfDays={31,28,31,30,31,30,31,31,30,31,30,31};
        for (int i=0; i< numberOfDays.length; i++) {
            values[i]=new int[numberOfDays[i]];
        }
        return values;
    }

    public static void main(String[] args) {
        ArrayOfArraysMain arrayOfArraysMain= new ArrayOfArraysMain();

        System.out.println("Multiplication table");
        arrayOfArraysMain.printArrayOfArrays(arrayOfArraysMain.multiplicationTable(10));


        System.out.println("Triangular matrix");
        arrayOfArraysMain.printArrayOfArrays(arrayOfArraysMain.triangularMatrix(3));

        System.out.println("Values per days");
        arrayOfArraysMain.printArrayOfArrays(arrayOfArraysMain.getValues());
    }
}
