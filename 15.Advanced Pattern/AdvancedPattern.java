

public class AdvancedPattern{
// * question no 1
// # print Hallow rectange

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


  // * question no 2
// Iverted rotated half pyramid

public static void HalfPyramid(int n){
  for(int i =1; i<=n; i++){
    // spaces
    for(int j=1; j<=n-i; j++){
System.out.print("");

    }
    // star
    for(int j=1;j<=i; j++ ){
      System.out.print("*");
    }
    System.out.println();
  }

}


// ! question no 3
// * inverted half pyramid with number

public static void FloydTriangle(int number){
  int counter = 1 ;
  for(int i=1; i<=number; i++){
    for(int j=1; j<=i; j++){
      System.out.print(counter + " ");
      counter++;
    }
    System.out.println();
  }

}

public static void HalfPyramidWithNumber(int n){
  for(int i=1; i<=n; i++){
for(int j=1; j<=(n-i)+1; j++){
  System.out.print(j);
}
System.out.println();
  }
}


  public static void main(String[] args) {
    //* */ HallowRectangle(6, 5);
    //* */ HalfPyramid(5);
    // *FloydTriangle(5) ;
    //* */ HalfPyramidWithNumber(5);
    
  }
}