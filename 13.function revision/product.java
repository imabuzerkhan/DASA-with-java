import java.util.Scanner;

public class product {

public static int product1 (int a , int b) {
  return a*b ;
}



  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int a  = sc.nextInt();
    int b = sc.nextInt();

    int showpro = product1(a,b);
    System.out.println("The multiple of a and b is:"+showpro);

  }
}
