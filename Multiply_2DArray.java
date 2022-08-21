package Arrays;
import java.util.Scanner;

public class Mulitple_2D {
	
	  Scanner sc = new Scanner(System.in);
	 int row,col,i,j,k;
	
	public  void multiple()
	{
		
		System.out.print("Enter the Row : ");
		row = sc.nextInt();
		System.out.print("Enter the Col : ");
		col = sc.nextInt();	
		
		if(row == col)
		{
		
			System.out.println("A Array : ");
			int arr[][] = new int[row][col];
			for(i=0; i<row; i++)
			{
				for(j=0; j<col; j++)
				{
					arr[i][j] = sc.nextInt();
					
				}
				System.out.println();
			}
			
			System.out.println("B Array : ");
			int brr[][] = new int[row][col];
			for(i=0; i<row; i++)
			{
				for(j=0; j<col; j++)
				{
					brr[i][j] = sc.nextInt();
					
				}
				System.out.println();
			}
			int crr[][] = new int[row][col];
						System.out.println("Multiplication of these Matrix is...");
				for(i=0; i<row; i++)
				{
					for(j=0; j<col; j++)
					{
						for(k=0; k<arr.length; k++)
						{
							crr[i][j]+= arr[i][k]*brr[j][k]; 
						}
					}
				}
				
				for(i=0; i<row; i++)
				{
					for(j=0; j<col; j++)
					{
						System.out.print("   "+crr[i][j]);
						
					}
					System.out.println();
				}
			
		}
		else
			System.out.print("Please write Square matrix here..");
		
	}
	
	public static void main(String[] args)
	{
		Mulitple_2D ob = new Mulitple_2D();
		ob.multiple();
		
	}

}
