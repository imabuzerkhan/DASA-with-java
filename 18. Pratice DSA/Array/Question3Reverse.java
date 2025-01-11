// Array Reverse – 
public class Question3Reverse {
  public static void ReverseArray(int num[]){
    int start = 0;
    int end = num.length-1;
    while(start<end){ 
      // Step 1: start = 0, end = 6 (first and last elements)
//       Swap num[0] and num[6] → {9, 4, 6, 3, 8, 4, 1}
// Move start to 1, end to 5.
      int temp = num[end];
      num[end] = num[start];
      num[start] = temp;

      start ++;
      end -- ;
    }
  }
  public static void main (String args[]){
    int num[] = {1,4,6,3,8,4,9};
    
    ReverseArray(num);
    for(int i=0; i<num.length; i++){
      System.out.print(num[i] + " ");
    }
  }
}
