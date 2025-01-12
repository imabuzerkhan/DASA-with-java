import java.util.Arrays;

public class Inbuilt2 {
  public static void main(String[] args) {
    int num[] = {2,4,3,5,1};
    // Sorting with starting and ending index
    Arrays.sort(num, 0 ,5);

    for(int i=0; i<num.length; i++){
      System.out.println(num[i]);
    }
  }
}
