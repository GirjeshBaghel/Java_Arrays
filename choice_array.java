import java.util.Scanner;

public class choice_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		user_choice();

	}
	public static void user_choice()
	{
		Arr_demo1 obj=new Arr_demo1();
		Scanner sc=new Scanner(System.in);
		System.out.println("1:ASC \n2:DESC \n3:GRT \n4:SM \n 5: AVRG");
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