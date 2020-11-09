package stringtype;

public class StringTypeMain {

    public static void main(String[] args) {
        String prefix= "Hello";

        String name= "john Doe";

        String message=prefix +name;

        message = message+444;

        boolean b =message.equals("Hello John Doe ");

        boolean c=message.equals("Hello John Doe444");

        String Z= "" +"";

        System.out.println(Z.length());

        String x="Abcde";
        System.out.println(x.length());
        System.out.println(x.charAt(0)+","+x.charAt(2));
        System.out.println(x.substring(0,2));




    }

}
