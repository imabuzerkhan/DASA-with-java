// *Maximum and minimum of an array using minimum number of comparisons

public class Question2 {
  public static void MaximumNum(int num[]){
    int max = Integer.MIN_VALUE;
    for(int i=0; i<num.length; i++){
      if(max < num[i]){
        max = num[i];
      }
     
    }
 
    System.out.println("the maximum number is " + max);
  }
  public static void main (String args[]){
    int num[] = {1,2,3,4,8,4,2,8,6};
    MaximumNum(num);
  }
}
