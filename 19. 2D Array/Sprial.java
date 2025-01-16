public class Sprial {
  public static void PraticeSprial(int matrix[][]){
    int Startrow = 0;
    int Startcol = 0;
    int Endrow = matrix.length-1;
    int EndCol = matrix[0].length-1;

// while loop likhne condtion check karne ke liye
while(Startrow <= Endrow && Startcol <= EndCol){
  // print => top => Stratrow
  for(int j=Startcol; j<=EndCol; j++){
  
    System.out.print(matrix[Startrow][j] + " ");

   
  }
 
  // print => right => end col
  for(int i= Startrow+1;i<=Endrow; i++ ){
    System.out.print(matrix[i][EndCol] + " ");

    
  }
  

  // print => Bottom => end row 
  for(int j=EndCol-1; j>= Startcol; j--){
    if(Startrow== Endrow){
      break;
    }
    System.out.print(matrix[Endrow][j] + " ");

   
  }

   // print => left => Start col
   for(int i=Endrow-1; i>= Startrow+1; i--){
    if(Startcol== EndCol){
      break;
    }
    System.out.print(matrix[i][Startcol] + " ");

    
   }
 Startrow++;
 Startcol ++;
 Endrow --;
 EndCol --; 

}
System.out.println();

  }
  public static void main (String args[]){
    int matrix[][] = {
      {1,2,3,4},
      {5,6,7,8},
      {9,10,11,12},
      {13,14,15,16}
    };
    PraticeSprial(matrix);
  }
}
