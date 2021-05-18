
import java.util.Scanner;
import java.text.DecimalFormat;

//Sub class of Fruits
public class Watermelon extends Fruits{
	
	private static DecimalFormat df2 = new DecimalFormat("#.##"); 
	Scanner input = new Scanner(System.in);
	
	private double grams;
	private double calories;
	private double totalCal, price, disc;

	public Watermelon(String name, double g, double h, double i) { //Constructor for Subclass
		super(name);
		grams = g;
		calories = h;
		price = i;
		
		System.out.print("Enter the Grams of Watermelon : ");
		grams = input.nextDouble();
		
		if(grams < 200) {
			calories();
			System.out.println(name);
			System.out.println("Watermelon is Less Than 200g. \nTotal Calories: " + df2.format(calories()) + " kcal");
			
		} 
		
		else if(grams > 200 && grams < 400) {
			g = 235;
			calories(g);
			System.out.println(name);
			System.out.println("Watermelon is Less Than 200g and More Than 400g. \nTotal Calories: " + df2.format(calories(g)) + " kcal");
		
		} 
		
		else if(grams > 400){
			int b = 5;
			double gg = 438;
			calories(gg, b);
			System.out.println(name);
			System.out.println("Watermelon is More Than 400g. \nTotal Calories: " + df2.format(calories(gg, b)) + " kcal");
		
		} 
		
		else {
			System.out.println("Invalid input. Please enter a valid number.");
			
		}
		
		Discount bd = new WatermelonDiscount(); 
		System.out.println("Discount: " + bd.rateOfDiscount()); 
		disc = bd.rateOfDiscount();
		
	}
	
	public double calories() {
		return totalCal = calories * 100;
	
	}
	
	public double calories(double g) {
		return totalCal = calories * g;
	
	}
	
	public double calories(double gg, int b) {
		return totalCal = calories * gg * b;
	
	}
	
	public double totalPrice() {
		return (price * grams) * (1 - disc);
	
	}
	
	public String toString() {
		return "\nCalories" + "\nFruit name\t: " + getName() + "\nTotal Calories\t: " + totalCal + "\nTotal Price\t: RM " + df2.format(totalPrice()) + "\n----------Thank you, Come Again Next Time!----------";
	
	}
	

}	//End Watermelon extend Fruits class