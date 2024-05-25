// ** Bionomial cofficient

public class Six {
  public static int factorail(int n){
    int f =1;
    for(int i=1; i<=n; i++){
      f =f*i;
    }
    return f;
  }
  public static int Bionomial(int n , int r){
    int a = factorail(n);
    int b = factorail(r);
    int c = factorail(n-r);
    int result = a/(b*c);
    return result;
  }
  public static void main(String[] args) {
    System.out.println(Bionomial(5,2));
  }
}
