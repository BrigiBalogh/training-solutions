package introjunit;


import org.junit.jupiter.api.Test;

public class GentlemanTest {

    @Test
    public void byNormalName() {
        String name= "john Doe";

        String greeting = new Gentleman().sayHello(name);

        assertEquals("Hello John Doe",greeting);
    }

    private void assertEquals(String hello_john_doe, String greeting) {
    }

}
