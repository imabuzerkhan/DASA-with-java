public class PrimeRange {


public static boolean Isprime(int n){

for(int i = 2; i<=Math.sqrt(n); i++){
  if(n%i==0){
   return false ;
  }
}
return true ;


}

public static void PrimeinRange(int n){
  for(int i=2; i<=n; i++){
    if(Isprime(i)){
      System.out.println(i + "");
    }

  }
  System.out.println();
}





  public static void main(String[] args) {
   PrimeinRange(100);
  }
}
