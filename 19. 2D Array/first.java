// * 2D array
// * creating 2d Array 
import java.util.*;
public class first {
// making one search function to search any number or index
public static boolean Search(int matrix[][], int key){
  for(int i=0; i<matrix.length; i++){
    for(int j=0; j<matrix[0].length; j++){
      if(matrix[i][j]== key){
        System.out.print("key found at( " + i + " , " + j + ")");
        return true;
      }
      
    }
   
  }
  System.out.println("key not found");
  return false;
}
  public static void main(String[] args) {
  
    // write 2d array
    int matrix[][] = new int [3][3];
    int n = matrix.length; int m = matrix[0].length;
    // taking input
    Scanner sc  = new Scanner(System.in);
    // outer loop 
    // loop for n and its mean row
    for(int i=0; i<n; i++){
      // inner loop
      // loop for m and its mean columns
      for(int j=0; j<m; j++){
        // store i and j value in matrix and take input from user to show in output
        matrix[i][j] = sc.nextInt();
      }
    
    }
    // print the output now
    for(int i=0; i<n; i++){
      for(int j=0; j<m; j++){
        System.out.print(matrix[i][j] + " " );
      }
      // print new line
      System.out.println();
    }
  // call search function
  Search(matrix , 5);
  }
}

// done for today