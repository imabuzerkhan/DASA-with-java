

public class Kadanes {
  public static void KadaneMethod(int number[]){
    int Maximum = Integer.MIN_VALUE;
    int curr = 0 ;

    for(int i=0; i<number.length; i++){
      curr += number[i];
      if(curr<0){
        curr = 0;
      }
      
    }
    Maximum = Math.max(Maximum, curr) ;
    System.out.println(Maximum);
    
  }
  public static void main (String args[]){
    int number[] = {-2,-3,4,5,-1,4,-3};
    KadaneMethod(number);
  }
}
