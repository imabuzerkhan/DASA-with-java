public class Subarray {
  public static void SubArrays(int number[]){
    // outer loop
    for(int i = 0 ; i < number.length; i++){
       int start = i ;
      //  inner
      for (int j = i; j<number.length; j++){
        int end = j ;
         // print subarray
        for(int k = start; k<=end ; k++){
          System.out.print(" "+number[k]);
  
        }
        System.out.println();
      }
     
      System.out.println();
    }
  }
  public static void main(String[] args) {
    int number[] = {2,4,6,8,10};
   SubArrays(number);
  }
}
