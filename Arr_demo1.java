import java.util.Scanner;

public class Arr_demo1 
{
	int size,i,j,temp;
	public int[] accepting_array()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("\nEnter the size");
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