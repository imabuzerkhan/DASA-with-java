import java.util.* ;
public class AgainPrime {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();

if(num==2){
  System.out.println("n is a prime number");
}else{
  boolean isprime = true;
  //! for(int i=2; i<=num-1; i++){
// * After optimazation
    for(int i=2; i<=Math.sqrt(num); i++){
if(num % i ==0){
  isprime = false ;
}
  }
  if(isprime==true){
    System.out.println("it is a prime number");
  }else{
    System.out.println("it is not a prime number");
  }
}






  }
}
