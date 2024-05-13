// public class type{
//   public static void main (String args[]){
//  char a = 'a';
//  short b = 20;
// byte a = 22;
// short b = 34;
// System.out.println(a-b);
//   }
// }
// ! java automatically promotes each types short , char or byte oprand to int when we added or use any arthimethic operation.

// ** ye sirf expression ke sath use hota aur kise ke sath bhi nhi
// ** aur int ko byte char short me convert nhi kar sakte hai

// ** second rule 
public class type{
  public static void main (String args[]){
int c = 23;
float d= 23.65f;
byte a = 22;
short b = 34;
long e =27;
double f = 56;
double ans = a+b+c+d+e+f;
System.out.println(ans);
  }
}

// ** it check the largest data and convert all the value according largest data type.