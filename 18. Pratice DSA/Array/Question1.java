/*
minimum of an array using minimum number of comparisons
 */

 public class Question1{
  public static void minimumNum(int num[]){
    int min = Integer.MAX_VALUE;
    for(int i=0; i<num.length; i++){
      if(min > num[i]){
        min = num[i];
      }
    }
    System.out.println("The minimum Number is " + min);
  }
  public static void main (String args[]){
    int num[] = {1,2,3,4,8,4,2,8,6};
    minimumNum(num);
  }
 }