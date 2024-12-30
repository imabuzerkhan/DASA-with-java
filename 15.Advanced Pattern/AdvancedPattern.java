

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
// * FloydTriangle with number

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

// ! question no 4
// * inverted half pyramid with number
public static void HalfPyramidWithNumber(int n){
  for(int i=1; i<=n; i++){
for(int j=1; j<=(n-i)+1; j++){
  System.out.print(j);
}
System.out.println();
  }
}


// ! question no 5
// * tilt hallow traingle

public static void tiltHallowtriangle(int rows, int cols){
// * outer layer
for(int i=1; i<=rows; i++){
  // * spaces
  for(int j=1; j<=rows-i;  j++ ){
    System.out.print(" ");
  }
  for(int j =1; j<=cols; j++){
    if(i==1|| i== rows || j==1 || j==cols ){
      System.out.print("*");
    }else{
      System.out.print(" ");
    }
  }
  System.out.println();
}

}
// ! question 5 
// * 0.1 tragle

public static void ZeroOneTrangle(int n ){
  // * outer layer
  for(int i=1; i<=n; i++){
    // * inner layer
    for(int j=1; j<=i; j++){
      if((i+j) % 2 == 0){
        System.out.print(1);
      }else{
        System.out.print(0);
      }
    }
    System.out.println();
  }
}

// ! question no 6 
// * Butterfly pattern

public static void ButterflyPattern(int n){
// * outer loop
for(int i =1; i<=n; i++){
  // * star
  for(int j=1; j<=i; j++){
    System.out.print("*");
  }
  //* */ Spaces
  for(int j=1; j<= 2*(n-i); j++){
    System.out.print(" ");
  }
  // * star 
  for(int j=1; j<=i; j++){
    System.out.print("*");
  }

System.out.println();  

}
// * for second part
// * outer loop
for(int i =n; i>=1; i--){
  // * star
  for(int j=1; j<=i; j++){
    System.out.print("*");
  }
  //* */ Spaces
  for(int j=1; j<= 2*(n-i); j++){
    System.out.print(" ");
  }
  // * star 
  for(int j=1; j<=i; j++) {
    System.out.print("*");
  }
System.out.println();
  }

}
// ! question 7 
// * solid rhombus
public static void solidRhombus(int n) {
  // * outer loop
  for(int i=1; i<=n; i++){
    // spaces
    for(int j=1; j<=n-i; j++){
      System.out.print(" ");
    }
    for (int j=1; j<=n; j++){
      System.out.print("*");
    }
    System.out.println();
  }
  
}

// ! question no 8 
// * diamond pattern
public static void Daimondpattern(int n) {
  // 1st half of the diamond
  for (int i = 1; i <= n; i++) {
    // Print spaces
    for (int j = 1; j <= n - i; j++) {
        System.out.print(" ");
    }
    // Print stars
    for (int j = 1; j <= (2 * i) - 1; j++) {
        System.out.print("*");
    }
    System.out.println();
}

 // 2nd half of the diamond
 for (int i = n - 1; i >= 1; i--) {
  // Print spaces
  for (int j = 1; j <= n - i; j++) {
      System.out.print(" ");
  }
  // Print stars
  for (int j = 1; j <= (2 * i) - 1; j++) {
      System.out.print("*");
  }
  System.out.println();
}
}

public static void NumberPyramid(int n){
  for (int i = 1; i<=n; i++){
    // Spacess
    for(int j=1 ; j <= n-i; j++){
      System.out.print(" ");
    }
    //  inner loop
    for (int j = 1 ; j<=i; j++){
      System.out.print(i + " ");
    }
    System.out.println();
  }
}

// palindromic pattern
public static void palindromic(int n){
  // outter loop
  for (int i =1 ; i<=n; i++){
    // spaces
    for (int j = 1 ; j<= n-i; j++){
      System.out.print(" ");
    }
    // acending 
    for (int j=i; j>=1; j--){
      System.out.print(j + " ");
    }
    // for desc
    for (int j=2; j<=i; j++){
      System.out.print(j + " ");
    }
    System.out.println();
  }
}

  public static void main(String[] args) {
    //* */ HallowRectangle(6, 5);
    //* */ HalfPyramid(5);
    // *FloydTriangle(5) ;
    //* */ HalfPyramidWithNumber(5);
    //* */ tiltHallowtriangle(5, 5);
    //* */ ZeroOneTrangle(5);
  // * ButterflyPattern(4);
    //* */ solidRhombus(4);
    //* */ Daimondpattern(5);
    // NumberPyramid(5);
    palindromic(5);
  }
}