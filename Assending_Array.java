import java.util.*;
class Assending_Array
{
    // it is assending function that call by main method
    public static void assending()
    {
        
        int[] arr = new int[10];
        int temp=0;
                
        System.out.print("Please enter the 10 values : ");
        
        //taking array from user 
        for(int i=0; i<arr.length;i++)
        {
            Scanner sc = new Scanner(System.in);
            arr[i] = sc.nextInt();
            
        }
        
        // sorting array in assending array
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

        // after sort a array , Array will be print
        System.out.println("Elements of array sorted in ascending order: ");    
        for (int i = 0; i < arr.length; i++)
         {     
             System.out.print(arr[i] + " ");    

         }  
    }    
      
     // main method
     public static void main(String[] args)
     {
         // assending function is calling
        assending();
    }
 }
    
