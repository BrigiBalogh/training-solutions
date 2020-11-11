package array;

public class ArrayMain {

    public static void main(String[] args) {
        String[] days= { "Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};

        System.out.println(days[1]);
        System.out.println(days.length);

        int[] fiveComponent=new int[5];
        fiveComponent[0]=1;
        for (int i=1;i<fiveComponent.length;i++) {
            fiveComponent[i]=fiveComponent[i-1]*2;
        }

        for (int i=0;i< fiveComponent.length;i++) {
            System.out.println(fiveComponent[i]+" ");

        }
        System.out.println();

       boolean[] sixComponent= new boolean[6];

       for (int i=1; i< sixComponent.length; i++) {
           sixComponent[i]= !sixComponent[i-1];
       }

       for (int i=0;i< sixComponent.length;i++){
           System.out.println(sixComponent[i]+" ");
       }
    }
}
