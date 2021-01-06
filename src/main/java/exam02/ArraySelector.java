package exam02;

import static java.lang.Integer.parseInt;

public class ArraySelector {
    private String even;

    public int selectEvens(int[] tomb)
    {
        if (isEmpty(tomb))
        {
            throw new IllegalArgumentException("Array is empty");
        }
      for( int i =0; i < tomb.length; i++)
      {
          if ( i % 2 != 0)
          {

              even += String.valueOf(tomb[i]);
          }
      }

      return parseInt(even);
    }

    private boolean isEmpty(int[] tomb)
    {
        if (tomb == null)
        {
            return true;
        }
        else
            {
                return false;
            }
    }
}
