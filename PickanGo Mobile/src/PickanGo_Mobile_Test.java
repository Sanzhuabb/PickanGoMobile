import java.util.Scanner;

public class PickanGo_Mobile_Test {

	

	public static void main(String[] args) {
		int menuState=1;
		
		Scanner input=new Scanner(System.in);
		
			System.out.println(
					"-Welcom to PickanGo!\n-What can I help you?"
					+ "\n--Select 1 to the menu"
					+ "\n--Select 2 to register an account."
					+ "\n--Select 3 to view account details"
					+ "\n--Select 4 to search an item"
					+ "\n--Select 5 to exit PickanGo Mobile");
			Menu.menu(input.nextInt());
		
		
	}
	
	

}
