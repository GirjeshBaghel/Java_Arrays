// taking 2D two array from user than multiplication of that 2d array
package Arrays;
import java.util.Scanner;

public class Mulitple_2D {
	
	  Scanner sc = new Scanner(System.in);					// global variable declaration
	 int row,col,i,j,k;
	
	public  void multiple()							// multiple method
	{
		
		System.out.print("Enter the Row : ");				// taking no of row from user
		row = sc.nextInt();
		System.out.print("Enter the Col : ");				// taking no of col from user
		col = sc.nextInt();	
		
		if(row == col)							// if no of row are equal to no of col then process will be execute
		{
		
			System.out.println("A Array : ");			// taking first from user
			int arr[][] = new int[row][col];
			for(i=0; i<row; i++)
			{
				for(j=0; j<col; j++)
				{
					arr[i][j] = sc.nextInt();		// storing that array in a loop format
					
				}
				System.out.println();				// breaking the line
			}
			
			System.out.println("B Array : ");			// taking b array from user
			int brr[][] = new int[row][col];
			for(i=0; i<row; i++)
			{
				for(j=0; j<col; j++)
				{
					brr[i][j] = sc.nextInt();		// storing that array from the loop
					
				}
				System.out.println();
			}
			int crr[][] = new int[row][col];			// taking a another array to strong both array
			System.out.println("Multiplication of these Matrix is...");
				for(i=0; i<row; i++)
				{
					for(j=0; j<col; j++)
					{
						for(k=0; k<arr.length; k++)
						{
							crr[i][j]+= arr[i][k]*brr[j][k];  // mulitiplication of both array by the help of third array
						}
					}
				}
				
				for(i=0; i<row; i++)
				{
					for(j=0; j<col; j++)
					{
						System.out.print("   "+crr[i][j]);	// after multiplication array will be print
						
					}
					System.out.println();
				}
			
		}
		else
			System.out.print("Please write Square matrix here..");		// if row and col are not equal then else part will be execute
		
	}
					
	public static void main(String[] args)						// main method
	{
		Mulitple_2D ob = new Mulitple_2D();					// creating object of class
		ob.multiple();								// mulitple method is calling
		
	}

}
