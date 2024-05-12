// ? In a program, input 3 numbers : A, B and C. You have to output the average of
//  ? these 3 numbers.

import java.util.*;
public class question_one {
  public static void main(String args[]){
    Scanner Sc = new Scanner(System.in);
    int a = Sc.nextInt();
    int b = Sc.nextInt();
    int c = Sc.nextInt();

    int average = ( a+b+c)/3;
    System.out.println("The average number is: " + average);
  }
}
