public class newone {
  public static boolean isprime(int n){
    if(n==2){
      return true;
    }
    for(int i=2; i<=Math.sqrt(n); i++){
      if(n%i==0){
        return false;
      }
    }
    return true;
  }

public static void Allprime(int n){
for(int i=2; i<=n; i++){
 if( isprime(i)){
  System.err.println(i);
 }
 
}
}


  public static void main(String[] args) {
   Allprime(16);
}

}