package week03d04;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PhoneParserTest {

    @Test
    void testParse() {
        PhoneParser parser = new PhoneParser();
        String s = "10-1234567";
         Phone phone = parser.parse(s);

         assertEquals("\"10-1234567\"",phone.toString());

    }
}