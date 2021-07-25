package ca.kpu.info3235.teamproject;

public class pgMenu {

	boolean conditions(boolean menu, boolean register, boolean viewAccountDetails, boolean searchItems, boolean exit) {
		if(menu && !register && !viewAccountDetails && !searchItems && !exit) {
			System.out.println("\nHello, this is PickanGo app Menu, please input numbers to select where you want to go!");
			return true;
		} else if(!menu && register && !viewAccountDetails && !searchItems && !exit) {
			System.out.println("\nWelcome to the register page, please fill in your personal information to create your own account!");
			return true;
		} else if(!menu && !register && viewAccountDetails && !searchItems && !exit) {
			System.out.println("\nPlease login your account to check information in here!");
			return true;
		} else if (!menu && !register && !viewAccountDetails && searchItems && !exit) {
			System.out.println("\nPlease enter the key words to see the items!");
			return true;
		} else if (!menu && !register && !viewAccountDetails && !searchItems && exit) {
			System.out.println("\n you have been successfully exit the PickanGo app, hope to see you next time. BYE~");
			return true;
		} else {
			System.out.println("\nSorry! Failed.");
			return false;
		}
	}

	public void depositNoNegative(int x) throws IllegalArgumentException{
		if (x <= 0) throw new IllegalArgumentException();
		System.out.println("\nException detected!");
	}

}
