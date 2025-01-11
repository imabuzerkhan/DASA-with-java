public class Question1 {
  public static void SelectionSort(int num[]){
    // outer loop
    for(int i=0; i<num.length; i++){
      int minimum = i;
      // outer
      for (int j=i+1; j<num.length; j++){
        if (num[minimum]>num[j]){
          minimum = j ;
        }
       
      }
      int temp = num[minimum];
      num[minimum] = num[i];
      num[i] = temp ;
    }
  }
  public static void main (String args[]){
    int num[] = {5,1,3,4,2};
    SelectionSort(num);
    for(int i=0; i<num.length; i++){
      System.out.println(num[i] + " ");
    }
  }
}
