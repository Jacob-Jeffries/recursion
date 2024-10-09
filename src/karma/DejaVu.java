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

  public static int fibonacci(int anIndex){
    if (anIndex == 0){
      return 1;
    } else if(anIndex == 1){
      return 1;
    } else {
      return fibonacci(anIndex-1) + fibonacci(anIndex-2);
    }
  }

  public static int multiply(int x, int y){
    if( x == 0 || y == 0) {
      return 0;
    }else{
      return x + multiply(x, (y-1));
    }
  }

  public static int power(int x, int y){
    if ( x == 0){
      return 0;
    } else if (y == 0){
      return 1;
    }else{
      return x * power(x, (y-1));
    }
  }

  public static String reverse(String aWord){
    if (aWord.length() < 2){
      return aWord;
    }else{
      return reverse(aWord.substring(1)) + aWord.charAt(0);
    }
  }

  public static int nChooseK(int n, int k){
    if (n == k){
      return (int) 1;
    }
  }
}