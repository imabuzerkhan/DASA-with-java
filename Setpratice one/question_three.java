import java.util.*;

public class question_three {
  public static void main(String args[]){
    Scanner Sc = new Scanner(System.in);
    float pen = Sc.nextFloat();
    float pencial = Sc.nextFloat();
    float Eraser = Sc.nextFloat();

    float totalvalue = (pen+pencial+Eraser);
    float newTotal = totalvalue + (0.18f * totalvalue);
  System.out.println(newTotal);

  }
  
}
