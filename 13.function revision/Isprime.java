public class Isprime {

public static boolean IsPrime(int n ){
//   boolean  Isprime = true ;
  if(n==2){
    System.out.println("it is a prime number");
    return true ;
  
  }
  for(int i=2; i<=Math.sqrt(n); i++){
    if(n%i==0){
     System.out.println("it is not a prime number");
  return false ;
   
    }// }else{
    //   System.out.println("it is a prime number");
    //   return true ;
    // }
  }
 return true ; 
}



  public static void main(String[] args) {
   boolean value = IsPrime(5);
   System.out.println(value);
    
  }
}
