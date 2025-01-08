// print subarray of {2,4,6,8,10}
// solution 

public class Subarray{
  public static void Arraycc(int Num[]){
  
    for(int i=0; i<Num.length; i++){
     int  start = i ;

     for (int j=i; j<Num.length; j++){
      int end = j ;

      for(int k=start; k<=end; k++){
        System.out.print(Num[k] + " ");

      }
      System.out.println();
     }
     System.out.println();
    }

  }
  public static void main(String[] args) {
    int Num[] = {2,4,6,8,10} ;
    Arraycc(Num);
  }
}