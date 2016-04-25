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

  @Test
  public void newTriangle_getsTriangleSide1_4() {
    Triangle testTriangle = new Triangle(7, 4, 5);
    assertEquals(4, testTriangle.getSide2());
  }

  @Test
  public void newTriangle_getsTriangleSide1_5() {
    Triangle testTriangle = new Triangle(7, 4, 5);
    assertEquals(5, testTriangle.getSide3());
  }

  @Test
  public void newTriangle_isATriangle_false(){
    Triangle testTriangle = new Triangle(1, 3, 5);
    assertEquals(false, testTriangle.isATriangle());
  }

  @Test
    public void newTriangle_isEquilateral_true(){
      Triangle testTriangle = new Triangle(4, 4, 4);
      assertEquals(true, testTriangle.isEquilateral());
  }

  @Test
    public void newTriangle_isIsosceles_true(){
      Triangle testTriangle = new Triangle(4, 4, 7);
      assertEquals(true, testTriangle.isIsosceles());
  }

  @Test
    public void newTriangle_isScalene_true(){
      Triangle testTriangle = new Triangle(5, 4, 7);
      assertEquals(true, testTriangle.isScalene());
  }
}
