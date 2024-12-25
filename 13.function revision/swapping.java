public class swapping {

  // * Yeh method do integer values ko swap karne ki koshish karta hai.
  public static void swap(int a, int b) {
      // a aur b ko naye values assign karte hain (jo main method ke original values ko affect nahi karega).
      a = 20; 
      b = 30;

      // Temporary variable jo values ko swap karne ke liye use hota hai.
      int temp = a;
      a = b;
      b = temp;

      // Yeh changes sirf iss method ke andar dikhai denge.
      System.out.println("Swap method ke andar:");
      System.out.println("a ki value hai: " + a); // Swapped value of a.
      System.out.println("b ki value hai: " + b); // Swapped value of b.

      // * Note: Yahan jo changes ho rahe hain, woh main method ke values ko affect nahi karenge 
      // * kyunki Java primitive types ke liye 'call by value' use karta hai.
  }

  public static void main(String[] args) {
      // Variables a aur b ko declare aur initialize karte hain.
      int a = 10;
      int b = 5;

      // Swap method ko call karte hain, jisme a aur b ki copies pass hoti hain.
      swap(a, b);

      // Swap method call ke baad a aur b ki values ko print karte hain.
      System.out.println("Swap method call ke baad:");
      System.out.println("a ki value hai: " + a); // a ki original value unchanged hai.
      System.out.println("b ki value hai: " + b); // b ki original value unchanged hai.

      // * Explanation:
      // * Java mein jab aap primitive data types (jaise int) ko pass karte ho, to unki values copy hoti hain.
      // * Swap method sirf copies ko modify karta hai, original variables ko nahi.
      // * Isi wajah se main method ke a aur b ki values unchanged rehti hain.
  }
}
