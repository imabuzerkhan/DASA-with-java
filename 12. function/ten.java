public class ten {
  public static boolean Isprime(int n) {
      if (n <= 1) {
          return false;  
      }
      for (int i = 2; i <= Math.sqrt(n); i++) {
          if (n % i == 0) {
              return false;  
          }
      }
      return true;  
  }

  public static void main(String[] args) {
      System.out.println(Isprime(4));  // Should print: false
      System.out.println(Isprime(5));  // Should print: true
  }
}
