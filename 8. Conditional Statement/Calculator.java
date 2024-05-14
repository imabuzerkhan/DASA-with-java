import java.util.*;
public class Calculator {
  public static void main(String args[]){
    Scanner Sc = new Scanner(System.in);
    System.out.println("add thhe value of a");
    int a = Sc.nextInt();
    System.out.println("add thhe value of b");
    int b = Sc.nextInt();
    System.out.println("add the operator");
    char operator = Sc.next().charAt(0);
switch (operator) {
  case '+' : System.out.println(a+b);
    
    break;
    case '-' : System.out.println(a-b);
    
    break;
    case '*' : System.out.println(a*b);
    
    break;
    case '/' : System.out.println(a/b);
    
    break;
    case '%' : System.out.println(a%b);
    
    break;

  default: System.out.println("error message");
    break;
}

  }
}
