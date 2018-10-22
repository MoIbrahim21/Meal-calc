import java.util.Scanner;

/**
 *  
 * @author mibrahim21
 *
 */
public class Mealrecipet {

	public static void main(String[] args) 
	{
		Scanner user = new Scanner(System.in);
		System.out.println("Welcome to your automated reciept calculator");
		System.out.println("In order to continue please press enter... ");
		user.nextLine();
		
		System.out.println("Please enter your first order regarding the appetizer:  " );
		String order1 = user.nextLine();
		System.out.println("Please enter the cost of your first order: ");
		String order1Cost = user.nextLine();
		
		System.out.println("Please enter the name of your Entree: ");
		String order2 = user.nextLine();
		System.out.println("Please enter the cost of your Entree: ");
		String order2Cost = user.nextLine();
		
		System.out.println("Please enter the name of your dessert: ");
		String order3 = user.nextLine();
		System.out.println("Please enter the cost of your dessert: ");
		String order3Cost = user.nextLine();
		
		System.out.println("Please enter the name of your beverage: ");
		String order4 = user.nextLine();
		System.out.println("Please enter the cost of your beverage: ");
		String order4Cost = user.nextLine();
		
		System.out.println("Please enter the percentage of tip you are planning to give" + " (In decimals please)" );
		String tax = user.nextLine();
		
		double order1C = Double.parseDouble(order1Cost);
		double order2C = Double.parseDouble(order2Cost);
		double order3C = Double.parseDouble(order3Cost);
		double order4C = Double.parseDouble(order4Cost);
		double tip = Double.parseDouble(tax);
		
		double total = order1C + order2C + order3C + order4C;
		double tax1 = total * tip;
		double taxtotal = .06 * total;
		
		System.out.println("Name           Cost");
		System.out.println(order1 + "      " + order1Cost);
		System.out.println(order2 + "      " + order2Cost);
		System.out.println(order3 + "      " + order3Cost);
		System.out.println(order4 + "      " + order4Cost);
		System.out.println();
		System.out.println("Subtotal         " + total);
		System.out.println("Tax        " + tax);
		System.out.println("Tip" + tip* 100 +"%        " + tax1);
		System.out.println("Total      " + (total + tax1 + tax));
		

		
		
	
	
	
	
	
	}
	
	

}
