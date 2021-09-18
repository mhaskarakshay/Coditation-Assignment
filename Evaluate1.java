
package gameoflife;
public class Evaluate1 
{
    int[][][] generation = new int[10][10][100];
    
    public void workOnNeigbour(int[][] paddedMatrix, int row, int col)
    {
        int count = 0;
           int Current = 0 ;
           System.out.println("Next Generation set");
            for (int i = 1; i < row+1; i++)
            {
                for (int j = 1; j < col+1; j++)
                {
                    count = 0;
                    /*
                    -here we check after padding that each cells surounding cell to adding them in count.
                    - its check by the horizontaly, verticaly, Daigonaly.
                    */
                    
                    Current = paddedMatrix[i - 1][ j - 1] + paddedMatrix[i - 1][j + 1] + paddedMatrix[i + 1][j - 1] + paddedMatrix[i + 1][ j + 1] +
                        paddedMatrix[i - 1][ j] + paddedMatrix[i][ j + 1] + paddedMatrix[i ][ j - 1] + paddedMatrix[i + 1][ j]; 
                    // dead cell with exactly three live neighbors comes to life
                    if (paddedMatrix[i][ j] == 0 && Current == 3)
                    {
                        paddedMatrix[i][ j] = 1;
                        System.out.print("| " + paddedMatrix[i][ j] + " Reincarnated");
                         
                    }
                    // Any live cell with two or three live neighbors lives, unchanged, to the next generation.	
                    else if (Current == 2 || Current == 3)
                    {
                        System.out.print("| " + paddedMatrix[i][ j] + " Lives");
                        
                    }
                     //live cell with fewer than two live neighbours dies by loneliness
                    else if (Current < 2 || Current > 3)
                    {
                        System.out.print("| " + paddedMatrix[i][ j] + " Dies");
                        paddedMatrix[i][ j] = 0;
                       
                    }
                }
                
                System.out.println();
            }
    }
}
