import java.util.Scanner;

public class Arr_Function 
{
	int size,i,j,temp;
	
	// accepting_array function is calling by main methos
	public int[] accepting_array()
	{
		Scanner sc=new Scanner(System.in);
		
		//taking the size fro user
		System.out.print("\nEnter the size");
		size=sc.nextInt();
		int[] num=new int[size];
		System.out.println("Enter "+size+" numbers");
		
		for(i=0;i<size;i++)
		{
			num[i]=sc.nextInt();
		}
		
		System.out.println("\nThe numbers are\n");
		for(i=0;i<size;i++)
		{
			System.out.print(num[i]+"\t");
		}
		
		return num;		
	}
	
	// ascending function is calling by anothet class
	public void ascending()
	{
		int arr[]=accepting_array();
		for(i=0;i<size;i++)
		{
			for(j=i+1;j<size;j++)
			{
				if(arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println("\nNumbers is ascending order:");
		for(i=0;i<size;i++)
		{
			System.out.print(arr[i]+"\t");
		}
	}
	
	// descending function is calling by anothet class
	public void descending()
	{
		int[] arr=accepting_array();
		
		for(i=0;i<size;i++)
		{
			for(j=i+1;j<size;j++)
			{
				if(arr[i]<arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println("\nNumbers is DESC order:");
		for(i=0;i<size;i++)
		{
			System.out.print(arr[i]+"\t");
		}
	}
	
	
	// greater function is calling by anothet class
	public void greater()
	{
		int[] arr=accepting_array();
		temp=arr[1];
		
		for(i=0;i<size;i++)
		{
			if(temp<arr[i])
			{
				temp=arr[i];
			}
		}
		System.out.println("\nThe greater number is = "+temp);	
	}
	
	// smaller function is calling by anothet class
	public void smaller()
	{
		int[] arr=accepting_array();
		temp=arr[1];
		
		for(i=0;i<size;i++)
		{
			if(temp>arr[i])
			{
				temp=arr[i];
			}
		}
		System.out.println("\nThe smaller  number is = "+temp);
	}
	
	// average function is calling by anothet class
	public void average()
	{
		int sum =0;
		int[] arr = accepting_array();
		
		for(i=0; i<size; i++)
		{
			sum += arr[i];
		}
		double  avg = sum/size;
		System.out.println(" \nAverage of Array : "+avg);
	}

}
