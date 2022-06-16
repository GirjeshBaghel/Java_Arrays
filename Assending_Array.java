import java.util.*;
class Assending_Array
{
    public static void assending()
    {
        
        int[] arr = new int[10];
        int temp=0;
        
        System.out.print("Please enter the 10 values : ");
        
        for(int i=0; i<arr.length;i++)
        {
            Scanner sc = new Scanner(System.in);
            arr[i] = sc.nextInt();
            
        }
        for(int i=0; i<arr.length; i++)
        {
            for(int j=i+1; j<arr.length; j++)
            {
                if(arr[i]>arr[j])
                {
                   temp = arr[i];
                   arr[i] = arr[j];
                   arr[j] = temp; 
                }
            }
        }

        System.out.println();


        System.out.println("Elements of array sorted in ascending order: ");    
        for (int i = 0; i < arr.length; i++)
         {     
             System.out.print(arr[i] + " ");    

         }  
    }    
      
     
     public static void main(String[] args)
     {
        assending();
    }
 }
    
