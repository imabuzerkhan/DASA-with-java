import java.util.Scanner;

public class nine {
  public static int average(){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    int value = a+b+c/3;
    System.out.println("the average of three number is:"+ value);
    return value;
  }
  public static void main(String[] args) {
    
    average();
  }
}
