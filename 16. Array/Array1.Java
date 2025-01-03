// find the key index using binary search techniques

public class Array1 {
  public static int FindingKey(int number[] ,int key){
int start = 0 ;
int end = number.length - 1 ;


while (start<=end){
  int mid = (start + end) / 2 ;
  // comparision
  if(number[mid]== key){
    return mid ;
  }
  else if (number[mid] < key){
    start = mid + 1 ;
  }else{
    end = mid - 1 ;
  }
}

    return -1 ;
  }
  public static void main(String[] args) {
    int number[] = {2,4,6,8,10,12,14,16,18,20};
    int key = 1;
    int res = FindingKey(number, key);

    if(res != -1){
      System.out.println("the index " + key + " is : " + res);
    }else{
      System.out.println("the key is not found");
    }
  }
}
