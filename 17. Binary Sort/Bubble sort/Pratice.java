public class Pratice { 
  public static void BubbleSort(int num[]){
    for(int i=0; i<num.length-1; i++){
      for(int j=0; j<num.length-1-i; j++){
        if(num[j] > num[j+1]){
          int temp = num[j];
          num[j] = num[j+1];
          num[j+1] = temp;
        }
      }
    }
  }
  public static void main(String[] args) {
    int num[] = {4,5,3,1,2};
    BubbleSort(num);
    for(int i=0; i<num.length; i++){
      System.out.println(num[i]);
    }
  }
}
