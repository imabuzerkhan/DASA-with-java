import java.util.*;
public class two {

public static int Calculatesum( int num1 , int num2){
 
  int sum = num1 + num1;
  return sum;
}


  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();

  int value = Calculatesum(a , b);
  System.err.println("the value is a : " + value);

  }
}
