import static org.junit.Assert.*;
import org.junit.*;

public class SkillDemoTester {
    @Test
    public void testCubeMethod() {
        assertEquals(8, SkillDemo.cubeNumber(2));
    }
}