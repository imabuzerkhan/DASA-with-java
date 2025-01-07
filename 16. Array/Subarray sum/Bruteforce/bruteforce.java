public class bruteforce {
  public static void SubarraySum(int Array[]){
    // int maxValue = Integer.MIN_VALUE ;
    // int currSum = 0 ;
   
    // outer loop
    for (int i=0; i<Array.length; i++){
      int start = i ;
      // ineer loop
      for(int j=i; j<Array.length; j++){
        int end = j ;
        // inner 
      for (int k=start; k<=end; k++){
System.out.print(Array[k] + " ");
      }
      System.out.println();
      }
      
    }
    System.out.println();
    

  }
  public static void main (String args[]){
    int Array[] = {2,4,6,8} ;
   SubarraySum(Array);
   
    // for(int i =0; i<Array.length; i++){
    //   System.out.println(Array[i]);
    // }
  }
}
