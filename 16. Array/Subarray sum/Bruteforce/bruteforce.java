public class bruteforce{
  public static void BruteForce(int number[]){
int n = number.length;
    int maxium = Integer.MIN_VALUE;
    for(int i=0; i<n; i++){
      int curr = 0;
      for(int j=i; j<n; j++){
        curr += number[j];
       

        if(maxium<curr){
          maxium = curr;
          
        }
        
      }
    }
    System.out.println("the maxium no is " + maxium);
  }
  public static void main(String[] args) {
    int number[] = {2,4,6,8,10};
    BruteForce(number);
  }
}