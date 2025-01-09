//  print sum of subarray pairs
public class bruteforce {
  public static void Sum(int num[]){
    int Maxium = Integer.MIN_VALUE;
    int curr = 0 ;

    for(int i =0; i<num.length; i++){
      int start = i;
     
      for(int j=i; j<num.length; j++){
       int end = j ;
        for(int k=start; k<end; k++){
         curr += num[k];
      
        }
        System.out.println();
      }
      System.out.println();
    }
  }
  

  public static void main (String args[]){
    int num[] = {2,4,6,8,10};
  }
}