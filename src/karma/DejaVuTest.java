package karma;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DejaVuTest {

  @Test
  public void testFactorial() {
    assertEquals(24, DejaVu.factorial(4));
    assertEquals(6, DejaVu.factorial(3));
    assertEquals(2, DejaVu.factorial(2));
    assertEquals(1, DejaVu.factorial(1));
    assertEquals(1, DejaVu.factorial(0));
  }

  @Test
  public void testCountdownAndCountup() {
    DejaVu.countdown(5);
    DejaVu.countup(5);
  }

  // Each term is the sum of the preceding two terms.
  @Test
  public void testFibonacci() {
    assertEquals(1, DejaVu.fibonacci(0));
    assertEquals(1, DejaVu.fibonacci(1));
    assertEquals(2, DejaVu.fibonacci(2));
    assertEquals(3, DejaVu.fibonacci(3));
    assertEquals(5, DejaVu.fibonacci(4));
    assertEquals(8, DejaVu.fibonacci(5));
  }

  // In the recursive multiply, you may only use addition and recursion.
  // You may assume both numbers are positive integers
  @Test
  public void testMultiply() {
    assertEquals(8, DejaVu.multiply(1, 8));
    assertEquals(8, DejaVu.multiply(8, 1));
    assertEquals(15, DejaVu.multiply(3, 5));
  }

  // In the recursive power, you may only use multiplication and recursion.
  // You may assume the base is positive and the power is non-negative.
  @Test
  public void testPower() {
    assertEquals(1, DejaVu.power(2, 0));
    assertEquals(1, DejaVu.power(17, 0));
    assertEquals(8, DejaVu.power(2, 3));
    assertEquals(9, DejaVu.power(3, 2));
  }

  @Test
  public void testReverse() {
    assertEquals("live", DejaVu.reverse("evil"));
    assertEquals("tool", DejaVu.reverse("loot"));
    assertEquals("radar", DejaVu.reverse("radar"));
  }

  @Test
  public void testNChooseK() {
    assertEquals(1, DejaVu.nChooseK(0, 0));
    assertEquals(1, DejaVu.nChooseK(3, 0));
    assertEquals(1, DejaVu.nChooseK(4, 4));
    assertEquals(6, DejaVu.nChooseK(4, 2));
    assertEquals(4, DejaVu.nChooseK(4, 3));
  }
}
