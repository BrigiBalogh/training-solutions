package introjunit;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GentlemanTest {

    @Test
    public void byNormalName() {
        String name= "john Doe";

        String greeting = new Gentleman().sayHello(name);

        assertEquals("Hello John Doe",greeting);
    }

}
