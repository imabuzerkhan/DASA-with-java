public class BubbleSoerted {

    public static void BubbleSort(int num[]){
     int swap =0;
      //  for loop for turns
      for (int trun = 0 ; trun < num.length-1; trun++){
         
  // inner loop
  for (int j = 0 ; j < num.length - 1 - trun ; j ++){
       if(num[j] < num[j+1]){
        // swap 
        int temp = num[j];
         num[j] = num[j+1];
         num[j+1] = temp;
         swap++ ;
  
       }
  }
    
      }
    }
  
    public static void Array(int num[]){
      for(int i=0; i<num.length; i++){
        System.out.println(num[i]);
      }
      System.out.println();
    }
  
    
    public static void main(String[] args) {
      int num[] = {1,2,3,4,5,6};
      BubbleSort(num);
      Array(num);
    }
  }
