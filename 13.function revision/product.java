import java.util.*;

public class product {


public static int multiply (int a , int b){
  int product = a * b ;
  return product ; 
}



  public static void main(String args[]){
    int prod =  multiply(10, 15) ;
    System.out.println(prod);
    
    Scanner Sc = new Scanner(System.in);
    int a  = Sc.nextInt();
    int b = Sc.nextInt();
    int prod2 = a*b ;
    System.out.println(prod2);



  }
}
