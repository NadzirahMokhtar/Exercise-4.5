
import java.util.Scanner;
import java.text.DecimalFormat;

public class Apple extends Fruits { //Subclass of Fruits
	
	private static DecimalFormat df2 = new DecimalFormat("#.##"); 
	Scanner input = new Scanner(System.in);
	
	protected int quantity;
	protected double price;
	protected double totalprice;
	protected double discount;
	
	public Apple(String name, double a) { //Constructor for Subclass
		super(name); 
		price = a;
		
		System.out.print("Enter the Quantity of " + getName() + " You Want: ");
		quantity = input.nextInt();
		
		if(name.equals("Apple")) {
			Discount ad = new AppleDiscount(); //New object for Apple discount	
			System.out.println("Discount: " + ad.rateOfDiscount());
			discount = ad.rateOfDiscount();
			
		}
		
		else if (name.equals("Red Apple")){
			Discount rad = new RedAppleDiscount(); //New object for RedApple discount	
			System.out.println("Discount: " + rad.rateOfDiscount());
			discount = rad.rateOfDiscount();
		
		} 
			
		else if(name.equals("Green Apple")) {
			Discount gad = new GreenAppleDiscount(); //New object for GreenApple discount	
			System.out.println("Discount: " + gad.rateOfDiscount() * 100 + "%");
			discount = gad.rateOfDiscount();
			
		}
		
		else {
			System.out.println("Sorry, there's no discount!");
			
		}
		
		if(quantity < 50) {
			totalPrice();  //Overloading method with no argument
			System.out.println(name);
			System.out.println("You Had Add " + quantity + " Apple into Cart. \nTotal Price of " + quantity + " Apple is RM " + df2.format(totalPrice()));
				
		} 
			
		else if(quantity >= 50 && quantity < 100) {
			double a2 = 2.99; 
			totalPrice(a2); //Overloading method with 1 argument
			System.out.println(name);
			System.out.println("You Had Add " + quantity + " Apple into Cart. \nTotal Price of " + quantity + " Apple is RM " + df2.format(totalPrice(a2)));
				
		} 
			
		else {
			double a3 = 1.99; 
			totalPrice(a3,quantity);
			System.out.println(name);
			System.out.println("You Had Add " + quantity + " Apple Cart." + "\nTotal Price of " + quantity + " Apple is RM " + df2.format(totalPrice(a3,quantity)));
			
		}
		
	}
	
	public double totalPrice() {
		return totalprice = (price * quantity) * (1 - discount);
		
	}
			
	public double totalPrice(double a2) {
		return totalprice = (a2 * quantity) * (1 - discount);
			
	}
			
	public double totalPrice(double a3, double b) {
		return totalprice = ((a3 * b) * (1 - discount));
			
	}
}
