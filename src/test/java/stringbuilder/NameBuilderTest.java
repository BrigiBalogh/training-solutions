package stringbuilder;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class NameBuilderTest {

    @Test
    public void invalidParametersShouldThrowExceptionNullFamilyName() throws IllegalArgumentException {
        Exception ex = assertThrows(IllegalArgumentException.class, () -> {
            new NameBuilder().concatNameHungarianStyle(null,"Jack","John",Title.DR);
        });

        assertEquals("Family name and given name must not be empty",ex.getMessage());

    }

    @Test
    public void invalidParametersShouldThrowExceptionNullGivenName() throws IllegalArgumentException {

        Exception ex = assertThrows(IllegalArgumentException.class, () -> {
            new NameBuilder().concatNameHungarianStyle("Doe", "Jack", null, Title.DR);
        });

        assertEquals("Family name and given name must not be empty!", ex.getMessage());
    }

    @Test
    public void invalidParametersShouldThrowExceptionEmptyFamilyName() throws IllegalArgumentException {

        Exception ex = assertThrows(IllegalArgumentException.class, () -> {
            new NameBuilder().concatNameHungarianStyle("", "Jack", "John", Title.DR);
        });

        assertEquals("Family name and given name must not be empty!", ex.getMessage());


    }

    @Test
    public void invalidParametersShouldThrowExceptionEmptyGivenName() throws IllegalArgumentException {
        Exception ex = assertThrows(IllegalArgumentException.class, () -> {
            new NameBuilder().concatNameHungarianStyle("Doe", "Jack", "", Title.DR);

        });

        assertEquals("Family name and given name must not be empty!", ex.getMessage());
    }

    @Test
    public void westernStyleNameConcatenation() {

        assertEquals("Dr. John Jack Doe",new NameBuilder().concatNameWesternStyle("Doe","Jack","john",Title.DR));
        assertEquals(" John Jack Doe",new NameBuilder().concatNameWesternStyle("Doe","Jack","john",null));
        assertEquals("Dr. John  Doe",new NameBuilder().concatNameWesternStyle("Doe","","john",Title.DR));
        assertEquals("Dr. John  Doe",new NameBuilder().concatNameWesternStyle("Doe",null ,"john",Title.DR));
    }

    @Test
    public void hungarianStyleNameConcatenation() {

        assertEquals("Dr. Doe Jack John", new NameBuilder().concatNameHungarianStyle("Doe","Jack","John",Title.DR));
        assertEquals(" Doe Jack John" ,  new NameBuilder().concatNameHungarianStyle("Doe","Jack","John",null));
        assertEquals("Dr. Doe John" , new NameBuilder().concatNameHungarianStyle("Doe","","John",Title.DR));
        assertEquals("Dr. Doe John", new NameBuilder().concatNameHungarianStyle("Doe",null,"John",Title.DR));
    }

    @Test
    public void inserTitle() {

      String  name = "Mr. John Jack Doe";
      assertEquals("Mr. Prof. John Jack Doe",new NameBuilder().insertTitle(name,Title.PROF,""));
    }

    @Test
    public void deleteNamePart() {

        assertEquals("Mr. John Jack Doe",new NameBuilder().deleteNamePart("Mr. Prof.John Jack Doe","Prof"));
    }
}
