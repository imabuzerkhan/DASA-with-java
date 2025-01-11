public class Question4ReverseAgain {
  public static void ReverseAgain(int num[]){
    int start = 0;
    int end = num.length-1;
    while(start<end){
      int temp = num[end];
      num[end] = num[start];
      num[start] = temp;

      start++;
      end--;
    }
  }

  public static void main (String args[]){
    int num[] = {2,4,36,3,54,3,2,4,23,6};
  
    ReverseAgain(num);
    for(int i=0; i<num.length; i++){
      System.out.print(num[i] + " ");
    }
  }
}
