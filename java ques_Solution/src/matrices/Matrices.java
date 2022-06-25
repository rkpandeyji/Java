package matrices;

import java.util.Scanner;

public class Matrices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int row1, column1;
		int row2, column2;
		
		System.out.println("Enter row and column of first matric : ");
		Scanner sc = new Scanner(System.in);
		row1 = sc.nextInt();
		column1 = sc.nextInt();
		
		System.out.println("Enter row and column of second matrix : ");
		row2= sc.nextInt();
		column2 = sc.nextInt();
		
		if(column1 != row2)
			System.out.println("Matrix multiplication is not possible."
					+ "Column of first matrix should be equal to the row of Second matrix.");
		else
		{
			System.out.println("Your resultant matrix will be of size:" +"*" + column2);
			System.out.println("Enter element of first matrix :: ");
			int[][] matrix1 = new int[row1][column1];
			int[][] matrix2 = new int [row2][column2];
			
			for(int i = 0; i<row1; i++)
			{
				for(int j =0; j<column1; j++)
				{
					matrix1[i][j]=sc.nextInt();
				}
			}
			System.out.println("Enter elements of Second matrix :: ");
			
			for(int i=0; i<row2; i++)
			{
				for(int j=0; j<column2; j++)
				{
					matrix2[i][j]= sc.nextInt();
				}
			}
			
			System.out.println("\n" );
			
			int[][] multiply = new int[row1][column2];
			for(int i=0; i<row1; i++)
			{
				for(int j=0; j<column2; j++)
				{
					for(int k=0; k<column1; k++)
					{
						multiply[i][j] += matrix1[i][k] * matrix2[k][j];
					}
				}
			}
			
			//result display
			System.out.println("\n");
			System.out.println("Resultant matrix is :: ");
			for(int i=0; i<row1; i++)
			{
				for(int j=0; j<column2; j++)
				{
					System.out.println(multiply[i][j] + " ");
				}
				System.out.println("\n");
			}
		}
		sc.close();
	}

}
