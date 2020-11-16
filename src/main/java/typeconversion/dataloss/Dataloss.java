package typeconversion.dataloss;

public class Dataloss {

    public void datalosss(long a)
    {
        System.out.println(a);
        float b = (float) a;
        System.out.println(b);
        long c = (long) b;
        System.out.println(c);

    }
    public static final int MAX_NUMBER_OF_LOSS = 3;
    public void dataLoss()
    {
        long original = 0;
        for (long counter = 0; counter < MAX_NUMBER_OF_LOSS; )
        {
            long converted = (long) (float) original;
            if (converted != original)
            {
                System.out.println("Original: " + original + " in binary: " + Long.toBinaryString(original));
                System.out.println("Converted: " + converted + " in binary: " + Long.toBinaryString(converted));
                counter++;
            }
            original++;
        }
    }
}
