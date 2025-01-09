
public class Solve2 {
  public static void Solving(int number[]){
    int Maximum = Integer.MIN_VALUE;
    int current = 0;
for(int i=0; i<number.length; i++){
  current += number[i];
  if(current<0){
    current = 0;
  }

}
Maximum = Math.max(Maximum, current);
System.out.println(Maximum);
  }
  public static void main(String[] args) {
    int number[] = {1,2,4,-4,-7,4,-6,5,-5};
    Solving(number);
  }
}
