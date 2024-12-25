public class FunctionOverloading {

  // * Multiple functions with same name but different parameters ko function overloading kehte hain. 
  // * Yeh sirf function ke parameters (number ya type) par depend karta hai.

  // 2 integers ka sum return karta hai
  public static int sum(int a, int b) {
      return a + b;
  }

  // 3 integers ka sum return karta hai
  public static int sum(int a, int b, int c) {
      return a + b + c;
  }

  // * Overloading data types ke sath (function ka naam same hai par parameter ka type alag hai)
  // 2 float values ka sum return karta hai
  public static Float sum(Float a, Float b) {
      return a + b;
  }

  public static void main(String args[]) {
      // 2 integers ka sum
      int sum1 = sum(2, 5);
      System.out.println("Sum of 2 integers: " + sum1);

      // 3 integers ka sum
      int sum2 = sum(4, 6, 7);
      System.out.println("Sum of 3 integers: " + sum2);

      // 2 float values ka sum
      Float sum3 = sum(2.5f, 4.7f);
      System.out.println("Sum of 2 floats: " + sum3);
  }
}
