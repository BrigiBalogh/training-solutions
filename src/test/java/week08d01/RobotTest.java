package week08d01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class RobotTest {

    @Test
    void testMove() {
        Robot robot = new Robot();
        robot.move("FFLLLLLBBBBJJJJJJJ");
        assertEquals(3, robot.getPosition().getX());
        assertEquals(-3, robot.getPosition().getY());
    }

    @Test
    void testWrongMove() {
        Robot robot = new Robot();
        assertThrows(IllegalArgumentException.class, ()-> robot.move("FFLLLLJJJVBBBB"));
    }
}
