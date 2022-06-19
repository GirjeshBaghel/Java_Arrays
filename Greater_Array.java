import java.util.*;
class Greater_Array
{
    int n;
    
    // largest function that call inside the main method
    public static int largest()
    {
        
        int[] arr = new int[10];
        
        System.out.print("Please enter the 10 values : ");
        
        // taking array from user
        for(int i=0; i<arr.length;i++)
        {
            Scanner sc = new Scanner(System.in);
            arr[i] = sc.nextInt();
        }
        
        // passing array index value in max to compare the variable
        int max = arr[0];
         for (int i = 1; i < arr.length; i++)
         {
                if (arr[i] > max)
                 max = arr[i];
         }
        
        // return the maximum value to largest function
         return max;
     }
      
     // main method
    
     public static void main(String[] args)
     {
         // In this line largest function is calling and taking the final output from the return type
         System.out.println("Largest in given array is " + largest());
    }
 }
    
