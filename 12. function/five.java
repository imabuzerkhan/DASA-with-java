// ** find the factorail of n number

public class five {
  public static int Factorial(int n){
int a = 1;
for(int i=1; i<=n; i++){
  a =a*i;
}
return a;
  }
  public static void main(String[] args) {
    System.out.println(Factorial(5));
  }
}
