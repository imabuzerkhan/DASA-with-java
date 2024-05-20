import java.util.*;
public class Whilefive {
  public static void main(String args[]){
     Scanner Sc = new Scanner(System.in);
     int n = Sc.nextInt();
     int counter = 1;
     int sum = 0;

     while (counter <=n) {
 sum += counter;
      counter++;
      
     }
     System.out.println("Sum of the given number is: " + sum);
  }
}
