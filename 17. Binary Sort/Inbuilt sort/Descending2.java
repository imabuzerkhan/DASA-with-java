import java.util.Arrays;
import java.util.Collections;
public class Descending2 {
  public static void main(String[] args) {
   Integer num[] = {2,3,6,5,4,1};
    Arrays.sort(num,0,4,Collections.reverseOrder());

    for(int i=0; i<num.length; i++){
      System.out.println(num[i]);
    }
  }
  
}
