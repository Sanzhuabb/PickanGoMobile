import java.util.HashMap;
import java.util.Scanner;

public abstract class Account {

static String password;
static String name;
static String phoneNum;
static String email;
static String accountType;
static String nameIn;
static String passwordIn;
static String accountTypeIn;
static boolean loggedIn=false;

static HashMap<String,Customer> CustomerAccounts = new HashMap<String,Customer>();
static HashMap<String,Seller> SellerAccounts= new HashMap<String, Seller>();

Account(String name,String email,String password,String phoneNum,String accountType){
	
	Account.password=password;
	Account.name = name;
	Account.phoneNum=phoneNum;
	Account.email=email;
	Account.accountType=accountType;
	}

public static void register() {
	Scanner in = new Scanner(System.in);
	System.out.println("-Please enter your name:");
	name=in.nextLine();
	
	System.out.println("-Please enter your email:");
	email=in.nextLine();
	
	System.out.println("-Please enter your password:");
	password=in.nextLine();
	
	System.out.println("-Please enter your phoneNumber:");
	phoneNum=in.nextLine();
	
	System.out.println("-Who would you like to be? Customer or Seller.");
	accountType=in.nextLine();
	
	 if(accountType.equals("Customer") || accountType.equals("customer") ) {
		 
		Customer.customerRegister();
		CustomerAccounts.put(name,new Customer(name,email,password,phoneNum,accountType,Customer.address,Customer.postalCode ));
		
		System.out.println("-Customer account created.");

		System.out.println(
				"-Try do it again by entering 2"
				+ "\n-Return to the main menu by entering 1" 
				+ "\n-Exit PickanGo by entering 5");
		Menu.menu(in.nextInt());
	}
	 else if (accountType.equals("Seller")||accountType.equals("seller")) {
		Seller.sellerRegister();
		SellerAccounts.put(name, new Seller(name,email,password,phoneNum,accountType,Seller.shopName,Seller.shopType));
		 
		 System.out.println("Seller account created.\n");
		
		System.out.println(
				"Try do it again by entering 2"
				+ "\n-Return to the main menu by entering 1" 
				+ "\n-Exit PickanGo by entering 5");
		Menu.menu(in.nextInt());
	 }
	 else {System.out.println(
			 	"Invalid input. Please enter 'Customer' or 'Seller'"
				+ "\nTry do it again by entering 2"
				+ "\n-Return to the main menu by entering 1" 
				+ "\n-Exit PickanGo by entering 5");
		Menu.menu(in.nextInt());
	 }
	
}

public static void customerLogin(String userName,String password) {
	Scanner in = new Scanner(System.in);
	
	if(CustomerAccounts.containsKey(userName)) {

		if(CustomerAccounts.get(userName).password.contentEquals(password)){
			System.out.println("-You logged in successfully");
			loggedIn=true;
		}
		else {
			System.out.println(
					"-Password is incorrect."
					+ "\nTry do it again by entering 3"
					+ "\n-Return to the main menu by entering 1"
					+ "\n-Exit PickanGo by entering 5");
			Menu.menu(in.nextInt());
		}
	}
	else {
		System.out.println(
				"-User does not exit."
				+ "\nTry do it again by entering 3"
				+ "\n-Return to the main menu by entering 1"
				+ "\n-Exit PickanGo by entering 5");
	Menu.menu(in.nextInt());	
	}
	
}

public static void sellerLogin(String userName,String password) {
	Scanner in = new Scanner(System.in);
	
	if(SellerAccounts.containsKey(userName)) {

		if(SellerAccounts.get(userName).password.contentEquals(password)){
			System.out.println("-You logged in successfully");
			loggedIn=true;
		}
		else {
			System.out.println(
					"-Password is incorrect."
					+ "\nTry do it again by entering 3"
					+ "\n-Return to the main menu by entering 1"
					+ "\n-Exit PickanGo by entering 5");
			Menu.menu(in.nextInt());
		}
	}
	else {
		System.out.println(
				"-User does not exit."
				+ "\nTry do it again by entering 3"
				+ "\n-Return to the main menu by entering 1"
				+ "\n-Exit PickanGo by entering 5");
	Menu.menu(in.nextInt());	
	}
	
}

public static void viewAccountDetails(){
	Scanner in = new Scanner(System.in);
	System.out.println("-Login");
	System.out.println("--Account type:");
	accountTypeIn=in.nextLine();
	System.out.println("--Name:");
	nameIn=in.nextLine();
	System.out.println("--Password:");
	passwordIn=in.nextLine();
	
	if (accountTypeIn.equals("Customer")||accountTypeIn.equals("customer")) {
		customerLogin(nameIn,passwordIn);
		if(loggedIn==true) {
		System.out.println(customerToString(CustomerAccounts.get(nameIn)));
		}
	}
	else if (accountTypeIn.equals("Seller")||accountTypeIn.equals("seller")) {
		sellerLogin(nameIn,passwordIn);
		if(loggedIn==true) {
			System.out.println(sellerToString(SellerAccounts.get(nameIn)));
			}
	}
	
}



public static String customerToString(Customer customer) {
	return "--Account Details:\n" + "---Name: " + customer.name + "\n" + "---Email: " + customer.email + "\n" 
			+ "---PhoneNumber:" + customer.phoneNum + "\n" + "---Account Type: " + customer.accountType + "\n"
			+ "---Address: " + customer.address + "\n" + "---Postal code: " + customer.postalCode;
     
}

public static String sellerToString(Seller seller) {
	return "--Account Details:\n" + "---Name: " + seller.name + "\n" + "---Email: " + seller.email + "\n" 
			+ "---PhoneNumber:" + seller.phoneNum + "\n" + "---Account Type: " + seller.accountType + "\n"
			+ "---Shop Name: " + seller.shopName + "\n" + "---Postal code: " + seller.shopType;
     
}


}
