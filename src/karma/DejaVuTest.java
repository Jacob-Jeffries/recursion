package karma;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static karma.DejaVu.*;

public class DejaVuTest {

  @Test
  public void testFactorial(){
    assertEquals(24, factorial(4));
    assertEquals(6, factorial(3));
    assertEquals(2, factorial(2));
    assertEquals(1, factorial(1));
    assertEquals(1, factorial(0));
  }
}
