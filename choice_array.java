import java.util.Scanner;

// this class is form to controll the method of Arr_Function class
public class choice_array {

	// this is user_choice function that calls inside the main method
	public static void user_choice()
	{
		// Arr_Function class object creating for calling the method 
		Arr_Function obj=new Arr_Function();
		Scanner sc=new Scanner(System.in);
		System.out.println(" 1 : Ascending \n 2 : Decending \n 3 : Greater \n 4 : Smallest \n 5 : Average");
		
		// taking user choice
		int choice=sc.nextInt();
		
		// inside the switch case condition is passing according to the user choice
		switch(choice)
		{
		case 1:
				obj.ascending();
				break;
		case 2:
			obj.descending();
			break;
		case 3:
			obj.greater();
			break;
		case 4:
			obj.smaller();
			break;
			
		case 5:
			obj.average();
			break;
			
			default:
				System.out.println("Invalid choice");
				break;
		}
	}
	
	// main method
	public static void main(String[] args) {
		
		user_choice();
	}
}
