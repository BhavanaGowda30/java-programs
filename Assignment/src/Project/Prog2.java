package Project;
import java.util.Scanner;
class marts
{
	void menu()
	{
		System.out.println("Electronics");
		System.out.println("Clothes");
		System.out.println("Sports");
		System.out.println("Books");
	}
	
	void payment()
	{
		System.out.println(" The following payment methods are available ");
		System.out.println("Credit card");
		System.out.println("Debit card ");
		System.out.println("Cash on delivery");
		
	}
}

public class Prog2 
{
	public static void main(String[] args) 
	{
		System.out.println("------------WELCOME TO ONLINE SHOPPING------------------");
		System.out.println("You can shop in:");
		marts m=new marts();
		m.menu();
		System.out.println("Enter what would you shop in:");
		Scanner sc=new Scanner(System.in);
		String key1=sc.nextLine();
		if(key1.equals("Electronics"))		
		{
			System.out.println("You can shop the following in electronics:");
			System.out.println("Smart TV");
			System.out.println("Laptops");
			System.out.println("Smart Phones");
		}
		
		else if(key1.equals("Clothes"))
		{
			System.out.println("You can shop the following in clothes:");
			System.out.println("Ethnic Wear");
			System.out.println("Western Wear");
			System.out.println("Casual Wear");
		}
		else if(key1.equals("sports"))
		{
			System.out.println("You can shop the following in sports:");
			System.out.println("Cricket");
			System.out.println("Carrom");
			System.out.println("Badminton");
		}
		else if(key1.equals("books"))
		{
			System.out.println("You can shop the following in books:");
			System.out.println("Books on horror");
			System.out.println("Books on fiction");
			System.out.println("Books on romantic");
		}
		
		
		System.out.println("What would you like to shop in? "+key1);
		String key2=sc.nextLine();
		
		if(key2.equals("smart tv"))
		{
			System.out.println("The following are available in: "+key2);
			System.out.println("Xiaomi tv");
			System.out.println("Sony tv");
		}
		else if(key2.equals("laptops"))
		{
			System.out.println("The following are available in: "+key2);
			System.out.println("Dell");
			System.out.println("Lenovo");
		}
		else if(key2.equals("smart phone"))
		{
			System.out.println("The following are available in: "+key2);
			System.out.println("Iphone");
			System.out.println("One plus");
		}
		else if(key2.equals("Ethnic wear"))
		{
			System.out.println("The following are available in: "+key2);
			System.out.println("Kurta and leggings");
			System.out.println("Lehanga");
		}
		else if(key2.equals("Western wear"))
		{
			System.out.println("The following are available in: "+key2);
			System.out.println("dungree");
			System.out.println("dresses");
		}
		else if(key2.equals("casual wear"))
		{
			System.out.println("The following are available in: "+key2);
			System.out.println("Top & jeans");
			System.out.println("Shrugs");
		}
		else if(key2.equals("cricket"))
		{
			System.out.println("The following are available in: "+key2);
			System.out.println("Cricket ball");
			System.out.println("Cricket bat");
		}
		else if(key2.equals("carrom"))
		{
			System.out.println("The following are available in: "+key2);
			System.out.println("carrom board");
			System.out.println("carrom checkers");
		}
		else if(key2.equals("badminton"))
		{
			System.out.println("The following are available in: "+key2);
			System.out.println("badminton racket");
			System.out.println("badminton cock");
		}
		else if(key2.equals("horror"))
		{
			System.out.println("The following are available in: "+key2);
			System.out.println("lights out");
			System.out.println("annabell");
		}
		else if(key2.equals("romantic"))
		{
			System.out.println("The following are available in: "+key2);
			System.out.println("if its not forever");
			System.out.println("2 states");
		}
		else if(key2.equals("fiction"))
		{
			System.out.println("The following are available in: "+key2);
			System.out.println("the alpha");
			System.out.println("twilight");
		}
		
		System.out.println("What do you wish to buy?");
		String key4=sc.nextLine();

		if(key4.equals("Xiaomi tv"))
		{
			System.out.println("Device name : "+key4);
			System.out.println("Price of "+key4+" is 25000");
			int x=25000;
			System.out.println("Discount is 10% on "+key2);
			System.out.println("Price after discount is "+(x-x/10));
		}
		else if(key4.equals("Sony tv"))
		{
			System.out.println("Device name : "+key4);
			System.out.println("Price of "+key4+" is 25000");
			int x=25000;
			System.out.println("Discount is 10% on "+key2);
			System.out.println("Price after discount is "+(x-x/10));
		}
		else if(key4.equals("Dell"))
		{
			System.out.println("Device name : "+key4);
			System.out.println("Price of "+key4+" is 25000");
			int x=25000;
			System.out.println("Discount is 20% on "+key2);
			System.out.println("Price after discount is "+(x-(2*x)/10));
		}
		else if(key4.equals("Lenovo"))
		{
			System.out.println("Device name : "+key4);
			System.out.println("Price of "+key4+" is 25000");
			int x=25000;
			System.out.println("Discount is 20% on "+key2);
			System.out.println("Price after discount is "+(x-(2*x)/10));
		}
		else if(key4.equals("Iphone"))
		{
			System.out.println("Device name : "+key4);
			System.out.println("Price of "+key4+" is 50000");
			int x=50000;
			System.out.println("Discount is 20% on "+key2);
			System.out.println("Price after discount is "+(x-(2*x)/10));	
		}
		else if(key4.equals("One plus"))
		{
			System.out.println("Device name : "+key4);
			System.out.println("Price of "+key4+" is 40000");
			int x=40000;
			System.out.println("Discount is 20% on "+key2);
			System.out.println("Price after discount is "+(x-(2*x)/10));	
		}
		else if(key4.equals("Kurta and Leggings"))
		{
			System.out.println("Item name : "+key4);
			System.out.println("Price of "+key4+" is 3000");
			int x=3000;
			System.out.println("Discount is 20% on "+key2);
			System.out.println("Price after discount is "+(x-(2*x)/10));
		}
		else if(key4.equals("Lehanga"))
		{
			System.out.println("Item name : "+key4);
			System.out.println("Price of "+key4+" is 8000");
			int x=8000;
			System.out.println("Discount is 20% on "+key2);
			System.out.println("Price after discount is "+(x-(2*x)/10));
		}
		else if(key4.equals("Dungree"))
		{
			System.out.println("Item name : "+key4);
			System.out.println("Price of "+key4+" is 3000");
			int x=3000;
			System.out.println("Discount is 20% on "+key2);
			System.out.println("Price after discount is "+(x-(2*x)/10));
		}
		else if(key4.equals("Dresses"))
		{
			System.out.println("Item name : "+key4);
			System.out.println("Price of "+key4+" is 3000");
			int x=3000;
			System.out.println("Discount is 20% on "+key2);
			System.out.println("Price after discount is "+(x-(2*x)/10));
		}
		else if(key4.equals("Top and jeans"))
		{
			System.out.println("Item name : "+key4);
			System.out.println("Price of "+key4+" is 3000");
			int x=3000;
			System.out.println("Discount is 20% on "+key2);
			System.out.println("Price after discount is "+(x-(2*x)/10));
		}
		else if(key4.equals("Shrugs"))
		{
			System.out.println("Item name : "+key4);
			System.out.println("Price of "+key4+" is 1000");
			int x=1000;
			System.out.println("Discount is 20% on "+key2);
			System.out.println("Price after discount is "+(x-(2*x)/10));
		}
		
		else if(key4.equals("Cricket bat"))
		{
			System.out.println("Item name : "+key4);
			System.out.println("Price of "+key4+" is 1000");
			int x=1000;
			System.out.println("Discount is 20% on "+key2);
			System.out.println("Price after discount is "+(x-(2*x)/10));
		}
		else if(key4.equals("Cricket ball"))
		{
			System.out.println("item name : "+key4);
			System.out.println("price of "+key4+" is 500");
			int x=500;
			System.out.println("discount is 20% on "+key2);
			System.out.println("price after discount is "+(x-(2*x)/10));
		}
		else if(key4.equals("carrom board"))
		{
			System.out.println("item name : "+key4);
			System.out.println("price of "+key4+" is 5000");
			int x=5000;
			System.out.println("discount is 20% on "+key2);
			System.out.println("price after discount is "+(x-(2*x)/10));
		}
		else if(key4.equals("carrom checkers"))
		{
			System.out.println("item name : "+key4);
			System.out.println("price of "+key4+" is 500");
			int x=500;
			System.out.println("discount is 20% on "+key2);
			System.out.println("price after discount is "+(x-(2*x)/10));
		}
		else if(key4.equals("badminton racket"))
		{
			System.out.println("item name : "+key4);
			System.out.println("price of "+key4+" is 1500");
			int x=1500;
			System.out.println("discount is 20% on "+key2);
			System.out.println("price after discount is "+(x-(2*x)/10));
		}
		else if(key4.equals("badminton cock"))
		{
			System.out.println("item name : "+key4);
			System.out.println("price of "+key4+" is 50");
			int x=50;
			System.out.println("discount is 10% on "+key2);
			System.out.println("price after discount is "+(x-x/10));
		}
		else if(key4.equals("lights out"))
		{
			System.out.println("item name : "+key4);
			System.out.println("price of "+key4+" is 400");
			int x=400;
			System.out.println("discount is 20% on "+key2);
			System.out.println("price after discount is "+(x-x/10));
		}
		else if(key4.equals("annabell"))
		{
			System.out.println("item name : "+key4);
			System.out.println("price of "+key4+" is 500");
			int x=500;
			System.out.println("discount is 10% on "+key2);
			System.out.println("price after discount is "+(x-x/10));
		}
		else if(key4.equals("if its not forever"))
		{
			System.out.println("item name : "+key4);
			System.out.println("price of "+key4+" is 500");
			int x=500;
			System.out.println("discount is 10% on "+key2);
			System.out.println("price after discount is "+(x-x/10));
		}
		else if(key4.equals("2 states"))
		{
			System.out.println("item name : "+key4);
			System.out.println("price of "+key4+" is 500");
			int x=500;
			System.out.println("discount is 10% on "+key2);
			System.out.println("price after discount is "+(x-x/10));
		}
		else if(key4.equals("the alpha"))
		{
			System.out.println("item name : "+key4);
			System.out.println("price of "+key4+" is 600");
			int x=600;
			System.out.println("discount is 10% on "+key2);
			System.out.println("price after discount is "+(x-x/10));
		}
		else if(key4.equals("twilight"))
		{
			System.out.println("item name : "+key4);
			System.out.println("price of "+key4+" is 600");
			int x=600;
			System.out.println("discount is 10% on "+key2);
			System.out.println("price after discount is "+(x-x/10));
		}
		
		System.out.println("Do you want to buy the product "+key4);
		String key5=sc.nextLine();
		if(key5.equalsIgnoreCase("yes"))
		{
			System.out.println("product added to cart");
			System.out.println("Please fill in your details");
			
			System.out.println("Enter your name");
			String name=sc.nextLine();
			
			System.out.println("Enter your Phone Number");
			long phno=sc.nextLong();
			
			sc.nextLine();
			System.out.println("Enter your email");
			String email=sc.nextLine();
			
			System.out.println("Enter your address");
			String address=sc.nextLine();
			System.out.println("You will be directed to the payment method");
		}
		
		m.payment();
		System.out.println("how would you like to pay?");
		String key6=sc.nextLine();
		
		if(key6.equals("credit card"))
		{
			System.out.println("Enter your card Number");
			long card=sc.nextLong();
			
			System.out.println("Enter your cvv");
			String cvv=sc.nextLine();
		}
		else if(key6.equals("debit card"))
		{
			System.out.println("Enter your card Number");
			long card=sc.nextLong();
			
			System.out.println("Enter your cvv");
			int cvv=sc.nextInt();
		}
		else if(key6.equals("cash on delivery"))
		{
			System.out.println("Please pay the required amount at the time of delivery");	
		}
		System.out.println("Thanks for shopping with us!!! ");
		System.out.println("your order will be delivered within 3-5 days");
		
	}
}
