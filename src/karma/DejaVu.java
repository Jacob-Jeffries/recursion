package karma;

public class DejaVu {

  public static int factorial(int n){
    if (n == 0) {
      return 1;
    }else {
    return n * factorial((n-1));
    }
  }

  public static void countdown(int n){
    if(n==0){
      System.out.println("Blast Off!");
      return;
    } else {
      System.out.println(n);
      countdown(n-1);
    }
  }

  public static void countup(int n){
    if(n==0){
      System.err.println("Blast Off!");
      return;
    } else {
      countup(n-1);
      System.out.println(n);
    }
  }
}
