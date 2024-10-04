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

  @Test
  public void testCountdown(){
    countdown(5);
    countup(5);
  }

  @Test
  public void testFibonaccii(){
    assertEquals(1, fibonacci(0));
    assertEquals(1, fibonacci(1));
    assertEquals(2, fibonacci(2));
    assertEquals(3, fibonacci(3));
    assertEquals(5, fibonacci(4));
    assertEquals(8, fibonacci(5));
  }

  // In the recursion multiply, you may only use addition.
  // You may assume both numbers are positive integers.
  @Test
  public void testMultiply(){
    assertEquals(8, multiply(1,8));
    assertEquals(8, multiply(8,1));
    assertEquals(15, multiply(3,5));
  }

  // In the recursive power, you may only use multiplication and recursion.
  // You may assume the base is positive and the power is not negative.
  @Test
  public void testPower(){
    assertEquals(1, power(2,0));
    assertEquals(1, power(17,0));
    assertEquals(8, power(2,3));
    assertEquals(9, power(3,2));
  }

  @Test
  public void testReverse(){
    assertEquals("live", reverse("evil"));
    assertEquals("tool", reverse("loot"));
    assertEquals("radar", reverse("radar"));
  }

  // N choose K things.
}
