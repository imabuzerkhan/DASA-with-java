public class ArthimeticUnarypost {
  public static void main (String args[]){
    int a = 10;
    //* */ int b = a++;   //! post increment 
    int b = a--;
    // System.out.println(a); //? 11
    // System.out.println(b); //? 10
    System.out.println(a); //? 9
    System.out.println(b); //? 10
  }
}


