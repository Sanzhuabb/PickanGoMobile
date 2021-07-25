import java.util.Scanner;

public class Menu {
	int menuState;
	Scanner in = new Scanner(System.in);
	Menu(int menuState){
		this.menuState=menuState;
	}
	
	public static void menu(int menuState) {
	Scanner in = new Scanner(System.in);
	
	if (menuState== 1) {
		System.out.println(
				"-Welcom to PickanGo!\n-What can I help you?"
				+ "\n--Select 1 to the menu"
				+ "\n--Select 2 to register an account."
				+ "\n--Select 3 to view account details"
				+ "\n--Select 4 to search an item"
				+ "\n--Select 5 to exit PickanGo Mobile");
		menu(in.nextInt());
	}
	else if (menuState == 2) {
		Account.register();
	}
	else if (menuState == 3) {
		Account.viewAccountDetails();
	}
	
	else if (menuState == 4) {
		Customer.searchItem();
	}
	else if (menuState == 5) {
		System.exit(0);
	}
	else {
		System.out.println("Invalid input. Please select from 1-6");
						Menu.menu(in.nextInt());
	}
	}
}
