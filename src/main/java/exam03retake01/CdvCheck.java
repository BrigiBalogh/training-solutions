package exam03retake01;

public class CdvCheck {


    public boolean check(String s)
    {
      double d = 0;
      int count = 0;
      char c = 0;
        for(int i=0; i<s.length();i++)
        {
            if (i < 9)
            {
                count ++;
                 c =s.charAt(0);
                Integer b = count*c;
                d += b;
            }
            else
                {
                    c =s.charAt(0);
                }
        }
        d = d % 11;
        String e =String.valueOf(d);
        String[] array = e.split(".");
        e = array[1];
        char arraylast = e.charAt(0);
        if (  arraylast == c)
        {
           return true;
        }
        else
            {
                return false;
            }
    }
}
