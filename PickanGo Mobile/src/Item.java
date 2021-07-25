import java.util.HashMap;
import java.util.Scanner;

public class Item {
static String itemName;
static String itemAmount;
static String itemPrice;

static HashMap<String,Item> ItemList= new HashMap<String,Item>();

Item(String itemName,String itemType, String itemAmount){
	this.itemName=itemName;
	this.itemAmount=itemAmount;
	this.itemPrice=itemPrice;	
}

public static void createItemList() {
	int i=1;
	Scanner in = new Scanner(System.in);
	while(i<=2) {
	System.out.println("Please enter the name of item " + i + " you want to sell.");
	itemName=in.nextLine();
	System.out.println("Please enter the amount of " + itemName + " you want to sell.");
	itemAmount=in.nextLine();
	System.out.println("Please enter the price of " + itemName + " you want to sell.");
	itemPrice=in.nextLine();
	ItemList.put(itemName, new Item(itemName,itemAmount,itemPrice));
	i++;
	}
	
	
}

public static String itemToString(Item item) {
	return "--Item Details:\n" + "---Item Name: " + item.itemName + "\n" + "---Item amount: " + item.itemAmount + "\n" 
			+ "---Item Price:" + item.itemPrice ;

}

}
