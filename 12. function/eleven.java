
// ! check it is a prime no or not

public class eleven{
public static boolean Isprime(int n){
for(int i=2; i<=n; i++){
  if(n%i==0){
    return false;
  }
}
return true ;
}


  public static void main(String[] args) {
    System.out.println(Isprime(3));
  }
}