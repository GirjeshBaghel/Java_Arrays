import java.util.*;
class Smallest_Array
{
    int n;
    
    // this is smallest function
    public static int Smallest()
    {
        
        int[] arr = new int[10];
        
        System.out.print("Please enter the 10 values : ");
        
        
        // taking array from user
        for(int i=0; i<arr.length;i++)
        {
            Scanner sc = new Scanner(System.in);
            arr[i] = sc.nextInt();
        }
        
        int small = arr[0];
        
        // checking the condition which is smallest value       
        for (int i = 1; i < arr.length; i++)
         {
            if (arr[i] < small)
            small = arr[i];
         }
        
        // return the final output to the method
         return small;
     }
      
     // main method
     public static void main(String[] args)
     {
         // Smallest method is calling and taking output from the return type
         System.out.println("Smallest in given array is " + Smallest());
    }
 }
    
