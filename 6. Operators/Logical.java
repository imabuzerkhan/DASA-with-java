public class Logical{
  public static void main(String args[]){
    int a =3;
    int b = 4;
    //* */ System.out.println((a>b)&& (b>a)); //! if two value are true then only and operator gives true the value otherwise it gives false.
    System.out.println((a>b) || (b>a)); //! agar ek bhi value true hojata hai to Or operator  true return kardetahai .
    System.out.println(!(a<b));
  }
}
