
package gameoflife;

public class Grid1
{
    public void dispGrid(int[][] arr, int row, int col)
    {
        // print the original generation set
        System.out.println("Original Generation Set");
         for (int i = 0; i < row; i++)
            {
                for (int j = 0; j < col; j++)
                {
                    System.out.print(arr[i][j]+"|");
                }
                System.out.println();
            }
    }
    // here padding the 0s.
    public int[][] padMatrix(int[][] arrP, int row, int col)
    {
        int[][] paddedMatrix = new int[10][10] ;
            for (int i = 0; i < row+2; i++)
            {
                for (int j = 0; j < col+2; j++)
                {
                    paddedMatrix[i][j] = 0;
                }
               
            }
            for (int i = 0; i < row; i++)
            {
                for (int j = 0; j < col; j++)
                {
                    paddedMatrix[i+1] [j+1] = arrP[i][j];
                }
                System.out.println();
            }
            return paddedMatrix;
    }
}
