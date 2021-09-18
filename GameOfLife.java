
package gameoflife;
import java.util.Scanner;

public class GameOfLife  
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
                
        System.out.println("Enter Number of Row");
        int row=sc.nextInt();       // enter the number of rows
        System.out.println("Enter Number of Column");
        int col=sc.nextInt();       // enter the number of columns
        int[][] arr = new int[row][col];    // array Initilizing
        
        System.out.println("Enter Element");
        for (int i = 0; i < row; i++)
            {
                for (int j = 0; j < col; j++)
                {
                    arr[i][j]=sc.nextInt();
                }
            }
       
          Grid1 g1=new Grid1();     // calling gird1 class by creating his object
        g1.dispGrid(arr,row,col);   // here we call the method display 
        
        int[][] paddedMat = g1.padMatrix(arr,row,col);  
        
        Evaluate1 e1 = new Evaluate1(); // here we call evaluate calls by creating his object
        e1.workOnNeigbour(paddedMat,row,col);   // method of that class.
    }
    
}
