
import java.text.DecimalFormat;
import java.util.Scanner;

public class GreenApple extends Apple {
	private static DecimalFormat df2 = new DecimalFormat("#.##"); 
	Scanner input = new Scanner(System.in);
	
	private String colour;
	private String taste;
	private String type;
	double balance;
	
	public GreenApple(String name, String ef, double a, String c, String d) {
		super(name, a);
		colour = c;
		taste = d;
		type = ef;
		
	}
	
	public String getColour() {
		return colour;
		
    }
		
	public String getTaste() {
		return taste;
		
	}
		
	public String getType() {
		return type;
		
	}
		
	public double calBalance() {
		System.out.print("Enter your payment : RM ");
		double pt = input.nextDouble();
			
		return balance = pt - totalprice;
		
	}
		
	public String orderDetails() {
		return "\n----------Order Details----------" + "\n" + getName() + "\nType\t\t: " + getType() + "\nColour\t\t: " + colour + "\nTaste\t\t: " + taste + "\nQuantity\t: " + quantity;
		
	}
		
	public String paymentDetails() {
		return "\n----------Payment Details----------" + "\nTotal price\t: RM " + df2.format(totalprice) + "\nBalance\t\t: RM " + df2.format(calBalance());
		
	}

	public String toString() {
		return orderDetails() + "\n" + paymentDetails() + "\n----------Thank you, Come Again Next Time!----------";
	}
	
}	//End GreenApple extends Apple class