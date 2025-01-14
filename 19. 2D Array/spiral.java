public class spiral {
  public static void PrintSprial(int matrix[][]){
    int startRow= 0;
    int Stratcol = 0 ;
    int EndRow = matrix.length - 1 ;
    int Endcol = matrix[0].length - 1; 

while(startRow <= EndRow &&  Stratcol<= Endcol){
  // top 
  for(int j=Stratcol; j<Endcol; j++){
    System.out.print(matrix[startRow][j]);
  }
  // right 
  for (int i=startRow+1; i<EndRow; i++){
    if(startRow == EndRow){
      break;
    }
    System.out.println(matrix[i][Endcol]);
  }
  // botom
  for (int j=Endcol-1; j<Stratcol; j--){
    if(Stratcol == Endcol){
      break;
    }
    System.out.println(matrix[EndRow][j]);
// left
for (int i=EndRow-1 ; i<startRow+1; i--){
  System.out.println(matrix[i][Stratcol]);

}
Stratcol ++ ;
startRow ++ ;
EndRow -- ;
Endcol -- ;
  }
  System.out.println();
}



    }
  public static void main(String[] args) {
    int matrix[][] = {
      {1,2,3,4},
      {5,6,7,8},
      {9,10,11,12},
      {13,14,15,16}
    };
    PrintSprial(matrix) ; 
  }
}
