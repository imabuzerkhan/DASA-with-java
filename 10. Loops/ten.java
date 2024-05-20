import java.util.Scanner;

public class ten {
  public static void main(String[] args) {
    do{
      Scanner Sc = new Scanner(System.in);
      int n = Sc.nextInt();
      if(n%10 ==0){
break;
      }
      System.out.println(n);
    }while(true);
  }
}
