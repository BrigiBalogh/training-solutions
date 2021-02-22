package exam03retake01;

public class CdvCheck {


    public boolean check(String s)
    {

      double d = 0;
      int seged = 0;
      char c;
        for(int i=0; i<s.length();i++)
        {
            if (i < 9)
            {
                seged ++;
                 c =s.charAt(0);
                Integer b = seged*c;
                d += b;
            }
            else
                {
                    c =s.charAt(0);
                }


        }
        d = d % 11;
        String e =String.valueOf(d);
        String[] tomb = e.split(".");
        e = tomb[1];
        char tomb2 = e.charAt(0);

        if (  tomb2 == c)
        {

        }

       return
    }
}
