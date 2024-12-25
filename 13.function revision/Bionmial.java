import java.util.Scanner;

public class Bionmial {

public static int FactFun (int n){
  int f = 1 ;
  for(int i = 1 ; i<=n; i++){
    f = f*i;
  }

  return f ;

}

public static int BionmialCoff(int n , int r){
 int  N_fact = FactFun(n);
 int R_fact = FactFun(r) ;
 int NMR_Fact = FactFun(n-r);
 int FindBino = N_fact / (R_fact * NMR_Fact );
 return FindBino ;


}


  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Please enter the value of N:");
    int n = sc.nextInt() ;
    System.out.println("Please enter the value of R:");

    int r  = sc.nextInt();
    int value = BionmialCoff(n, r) ;
    System.out.println("The Value of bionomial cofficient " + n + " " + r +  " is :" + value);


  






   
  }
}

