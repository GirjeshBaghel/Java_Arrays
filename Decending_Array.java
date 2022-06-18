import java.util.*;
class Decending_Array
{
    // decending method calling by the inside the main method
    public static void decending()
    {
        
        int[] arr = new int[10];
        int temp=0;
        
        // taking 10 values from user
        System.out.print("Please enter the 10 values : ");
        
        // taking array from user
        for(int i=0; i<arr.length;i++)
        {
            Scanner sc = new Scanner(System.in);
            arr[i] = sc.nextInt();
            
        }
        
        // array sorting in the loop
        for(int i=0; i<arr.length; i++)
        {
            for(int j=i+1; j<arr.length; j++)
            {
                if(arr[i]<arr[j])
                {
                   temp = arr[i];
                   arr[i] = arr[j];
                   arr[j] = temp; 
                }
            }
        }
        
        // breaking the line
        System.out.println();

        // after sorting array , Array will be print
        System.out.println("Elements of array sorted in decending order is : ");    
        for (int i = 0; i < arr.length; i++)
         {     
             System.out.print(arr[i] + " ");    

         }  
    }    
      
    
    // main method 
     public static void main(String[] args)
     {
         // decending method is calling
        decending();
    }
 }
    
