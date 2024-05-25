public class Eight {
  // * function overloading  with datatypes

  public static int sum(int a , int b){
   return a+b;
    }
  public static int sum(int a , int b ,int c){
    return a+b+c;
    
   }
   public static float sum(float a ){
    return a;
   }
   public static void main(String[] args) {
    System.out.println(sum(2, 4));
    System.out.println(sum(2, 4 , 4));
    System.out.println(sum(29.2f));
   }
  
}

