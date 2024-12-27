public class Decimal {

  public static void Dectobin(int decNum) {
      int pow = 0;
      int dec = 0;

      while (decNum > 0) {
          int lastdigit = decNum % 2;
          dec = dec + (lastdigit * (int) Math.pow(10, pow));
          pow++;
          decNum /= 2;
      }

      System.out.println(dec); // Print the decimal equivalent
  }

  public static void main(String args[]) {
     Dectobin(7); // Test with a binary number
  }
}
