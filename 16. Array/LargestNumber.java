import java.util.*;

public class LargestNumber {

  public static int Largestnumber(int number[]){
// * print largest number in array using this techniques
    int largest = Integer.MIN_VALUE;
    int Samllest = Integer.MAX_VALUE;

    // for largest number
    for(int i=0; i<number.length; i++){
      if(largest<number[i]){
        largest = number[i];
      }
       // for smallest number
   
      if(Samllest > number[i]){
        Samllest = number[i]; 
      }
  
   
    }
    System.out.println("smallest number is " + Samllest);
    
    return largest ;

  }



  public static void main(String[] args) {
    int number[] = {2,4,3,74,2,1,9,4};
   int LargestNumber = Largestnumber(number);
   System.out.println(LargestNumber);
  }
}
