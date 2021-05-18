

public class Main {
	public static void main(String[] args) {
		System.out.println("Welcome to Fruits Stall ");
		System.out.println();
		
		Apple obj1 = new Apple("Apple", 4.99);
		System.out.println(obj1);
		System.out.println();
		
		RedApple obj2 = new RedApple("Red Apple", "Fuji", 2.50, "Red", "Sweet");
		System.out.println(obj2);
		System.out.println();
		
		GreenApple obj3 = new GreenApple("Green Apple", "Ginger Gold", 4.99, "Green", "Sweet-Sour");
		System.out.println(obj3);
		System.out.println();
		
		Watermelon obj4 = new Watermelon("Watermelon", 200, 0.0657, 0.15);
		System.out.println(obj4);
		System.out.println();
		
		Mangosteen obj5 = new Mangosteen("Mangosteen", 250, 2.35, 0.22);
		System.out.println(obj5);
		System.out.println();
	}

}