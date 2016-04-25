import org.junit.*;
import static org.junit.Assert.*;

public class TriangleTest {

  @Test
  public void newTriangle_instantiatesCorrectly() {
    Triangle testTriangle = new Triangle(7, 4, 5);
    assertEquals(true, testTriangle instanceof Triangle);
  }

  @Test
  public void newTriangle_getsTriangleSide1_7() {
    Triangle testTriangle = new Triangle(7, 4, 5);
    assertEquals(7, testTriangle.getSide1());
  }
}
