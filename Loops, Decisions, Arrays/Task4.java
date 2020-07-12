//Name:Hamad Nasir
//Class:BSCS-6C
//Roll Number:120312
//Lab_1 Task_4

package task.four;


import java.util.Scanner;

public class TaskFour { 
    public static void main(String[] args) { 
        int M;
        int N;
        double p;
      
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of rows , columns and percentage:  ");
        M= input.nextInt();
        N= input.nextInt();
        p= input.nextDouble();
        
        //Using array 
        boolean[][] array = new boolean[M+2][N+2];
        for (int i = 1; i <= M; i++)
            for (int j = 1; j <= N; j++)
                array[i][j] = (Math.random() < p);

        // print array
        for (int i = 1; i <= M; i++) {
            for (int j = 1; j <= N; j++)
                if (array[i][j])
                    System.out.print("* ");
                else            
                    System.out.print(". ");
            System.out.println();
        }

        // hold[i][j] = # bombs adjacent to cell (i, j)
        int[][] hold = new int[M+2][N+2];
        for (int i = 1; i <= M; i++)
            for (int j = 1; j <= N; j++)
                //Neighboring cells
                for (int ii = i - 1; ii <= i + 1; ii++)
                    for (int jj = j - 1; jj <= j + 1; jj++)
                        if (array[ii][jj]) hold[i][j]++;

        // print solution
        System.out.println();
        for (int i = 1; i <= M; i++) {
            for (int j = 1; j <= N; j++) {
                if (array[i][j])
                    System.out.print("* ");
                else            
                    System.out.print(hold[i][j] + " ");
            }
            System.out.println();
        }

    }
}