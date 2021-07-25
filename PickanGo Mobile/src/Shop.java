import java.util.HashMap;
import java.util.Scanner;

public class Shop {
	static String shopName;
	static HashMap<String, Item> itemList;
	
	static HashMap<String,Shop> Shops=new HashMap<String, Shop>();
	Shop(String shopName, HashMap<String, Item> itemList){
		this.shopName=shopName;
		this.itemList=itemList;
		
	}
	
	public static void createShop(){
		Scanner in=new Scanner(System.in);
		System.out.println("Please enter your shop name.");
		shopName=in.nextLine();
		Item.createItemList();
		Shops.put(shopName,new Shop(shopName,Item.ItemList));
	}
	
	
	
}
