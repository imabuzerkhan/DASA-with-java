import java.util.Scanner;

public class Tax {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int Salary = sc.nextInt();
    int rate;

    if(Salary<=500000){
      rate = 0;
    } else if(Salary>=500000 && Salary>=1000000){
      rate = (int)(Salary*0.2);

    } else{
      rate = (int)(Salary*0.3);
    }

System.out.println("the tax rate is :" + rate );

  }
}
