// # print Hallow rectange


public class AdvancedPattern{
// * question no 1
  public static void HallowRectangle(int row, int col){

    for(int i=1; i<=row; i++){
for(int j = 1; j<=col; j++){
  if(i==1||i==row|| j==1|| j==col){
    System.out.print("*");
  }else{
    System.out.print(" ");
  }
}
System.out.println();
    }

  }



  public static void main(String[] args) {
    HallowRectangle(6, 5);
    
  }
}