import java.util.Scanner;

public class Factorial {

public static int FactFun (int n){
  int f = 1 ;
  for(int i = 1 ; i<=n; i++){
    f = f*i;
  }

  return f ;

}



  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the number please to find a factorail:");
    int n = sc.nextInt() ;

    if(n>=0 && n<20){
      int findfact = FactFun(n) ;
      System.out.println("the factorail of this n number is :" + findfact);
    }else{
      System.out.println("OOPPS your number must greater thn (0) or mustbe less than (20) ");
    }






   
  }
}
