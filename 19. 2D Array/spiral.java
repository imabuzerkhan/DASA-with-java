public class spiral {
  public static void PrintSprial(int matrix[][]) {
      int startRow = 0;
      int Stratcol = 0;
      int EndRow = matrix.length - 1;
      int Endcol = matrix[0].length - 1;

      while (startRow <= EndRow && Stratcol <= Endcol) {
          // Top boundary
          for (int j = Stratcol; j <= Endcol; j++) {
              System.out.print(matrix[startRow][j] + " ");
          }
          startRow++;

          // Right boundary
          for (int i = startRow; i <= EndRow; i++) {
              System.out.print(matrix[i][Endcol] + " ");
          }
          Endcol--;

          // Bottom boundary
          if (startRow <= EndRow) { // Ensure there is a bottom row to print
              for (int j = Endcol; j >= Stratcol; j--) {
                  System.out.print(matrix[EndRow][j] + " ");
              }
              EndRow--;
          }

          // Left boundary
          if (Stratcol <= Endcol) { // Ensure there is a left column to print
              for (int i = EndRow; i >= startRow; i--) {
                  System.out.print(matrix[i][Stratcol] + " ");
              }
              Stratcol++;
          }
      }
      System.out.println();
  }

  public static void main(String[] args) {
      int matrix[][] = {
          {1, 2, 3, 4},
          {5, 6, 7, 8},
          {9, 10, 11, 12},
          {13, 14, 15, 16}
      };
      PrintSprial(matrix);
  }
}
