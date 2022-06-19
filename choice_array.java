import java.util.Scanner;

// this class is form to controll the method of Array
public class choice_array {

	public static void main(String[] args) {
		user_choice();
	}
	public static void user_choice()
	{
		Arr_demo1 obj=new Arr_demo1();
		Scanner sc=new Scanner(System.in);
		System.out.println(" 1 : Ascending \n 2 : Decending \n 3 : Greater \n 4 : Smallest \n 5 : Average");
		int choice=sc.nextInt();
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
}
