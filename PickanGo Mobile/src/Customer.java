

import java.util.Scanner;


public class Customer extends Account{
	static String address;
	static String postalCode;
	
	
	
	Customer(String name,String email,String password,
			String phoneNum,String accountType,String address,String postalCode)
	{
		super(name,email,password,phoneNum,accountType);
		Customer.address=address;
		Customer.postalCode=postalCode;	
	}
	
	public static void customerRegister() {
		
		Scanner in=new Scanner(System.in);
		System.out.println("-Please enter your address:");
		address=in.nextLine();
		System.out.println("-Please enter your postal code:");
		postalCode=in.nextLine();
	}
	
	public static void searchItem() {
		String itemNameIn;
		Scanner in=new Scanner(System.in);
		System.out.println("Please enter the item name to be searched");
		itemNameIn=in.nextLine();
		
		if (Item.ItemList.containsKey(itemNameIn)) {
			System.out.println(Item.itemToString(Item.ItemList.get(nameIn)));
		}
		else {
			System.out.println(
					"-Item not found"
					+ "\nTry search again by entering 4"
					+ "\n-Return to the main menu by entering 1"
					+ "\n-Exit PickanGo by entering 5");
			Menu.menu(in.nextInt());
		}
	}
	

	
}
