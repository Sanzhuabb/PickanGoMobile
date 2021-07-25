

import java.util.Scanner;


public class Seller extends Account{
	static String shopName;
	static String shopType;
	
	
	
	Seller(String name,String email,String password,
			String phoneNum,String accountType,String shopName,String shopType)
	{
		super(name,email,password,phoneNum,accountType);
		Seller.shopName=shopName;
		Seller.shopType=shopType;	
	}
	
	public static void sellerRegister() {
		Shop.createShop();
	}	
}
