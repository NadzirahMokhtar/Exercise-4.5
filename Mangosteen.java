
import java.util.Scanner;
import java.text.DecimalFormat;

//Sub class of Fruits
public class Mangosteen extends Fruits{
	
	private static DecimalFormat df2 = new DecimalFormat("#.##"); 
	Scanner input = new Scanner(System.in);
	
	private double grams;
	private double Carbs;
	private double totalCarbs;
	private double price, disc;

	public Mangosteen(String name, double g, double h, double i) { //Constructor for Subclass
		super(name);
		grams = g;
		Carbs = h;
		price = i;
		
		System.out.print("Enter the Grams of Mangosteen : ");
		grams = input.nextDouble();
		
		if(grams < 200) {
			Carbs();
			System.out.println(name);
			System.out.println("Mangosteen is Less Than 200g. \nTotal Carbohydrates : " + df2.format(Carbs()));
			
		} 
		
		else if(grams > 200 && grams < 400) {
			g = 346;
			Carbs(g);
			System.out.println(name);
			System.out.println("The mangosteen is Less Than 200g and More Than 400g. \nTotal Carbohydrates : " + df2.format(Carbs(g)));
			
		} 
		
		else if(grams > 400){
			int b = 3;
			double gg = 459;
			Carbs(gg, b);
			System.out.println(name);
			System.out.println("Mangosteen is More Than 400g. \nTotal Carbohydrates : " + df2.format(Carbs(gg, b)));
			
		} 
		
		else {
			System.out.println("Invalid input. Please enter a valid number.");
			
		}
		
			Discount avd = new MangosteenDiscount(); 
			System.out.println("Discount: " + avd.rateOfDiscount()); 
			disc = avd.rateOfDiscount();
	}
	
	public double Carbs() {
		return totalCarbs = Carbs * 100;
		
	}
	
	public double Carbs(double g) {
		return totalCarbs = Carbs * g;
		
	}
	
	public double Carbs(double gg, int b) {
		return totalCarbs = Carbs * gg * b;
		
	}
	
	public double totalPrice() {
		return (price * grams) * (1 - disc);
		
	}
	
	public String toString() {
		return "\nCarbohydrates" + "\nFruit name\t\t: " + getName() + "\nTotal Carbohydrates\t: " + df2.format(totalCarbs) + "\nTotal Price\t\t: RM " + df2.format(totalPrice()) + "\n----------Thank you, Come Again Next Time!----------";
	
	}
	
}	//End Mangosteen extend Fruits class