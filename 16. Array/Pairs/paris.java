// print  paris of {2,4,6,8,10}
// solution
public class paris{
  public static void PrintParis(int Array[]){
    int n = Array.length;
    // outter loop
    for(int i = 0; i<n; i++){
      int curr = Array[i] ;
      // inner loop
      for(int j=i+1; j<n; j++){
        System.out.println(curr + "," + Array[j]);
      }
      System.out.println();
    }
  }
  public static void main (String args[]){
    int Array[] = {2,4,6,8,10};
    PrintParis(Array);
  }
}