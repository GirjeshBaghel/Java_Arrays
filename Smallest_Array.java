import java.util.*;
class Smallest_Array
{
    int n;
    public static int Smallest()
    {
        
        int[] arr = new int[10];
        
        System.out.print("Please enter the 10 values : ");
        
        for(int i=0; i<arr.length;i++)
        {
            Scanner sc = new Scanner(System.in);
            arr[i] = sc.nextInt();
        }
        
        
        int max = arr[0];
         for (int i = 1; i < arr.length; i++)
         {
            if (arr[i] < max)
            max = arr[i];
         }
         return max;
     }
      
     
     public static void main(String[] args)
     {
         System.out.println("Smallest in given array is " + Smallest());
    }
 }
    
