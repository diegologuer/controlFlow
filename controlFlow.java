import java.io.BufferedReader;
import java.io.InputStreamReader;

public class controlFlow {
	public static void main(String[] args) throws Exception{
		//Part 1: Commission Calculator
		//1-Using IntelliJ, write a Java app that takes numerical input from a user
		//2-The app should calculate commission based on this chart used by the retail store.
		System.out.println("----------Part1----------");
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the ammount: ");
		int sale = Integer.parseInt(reader.readLine());
		float comission = 0.0F;
		
		if(sale >= 10000) {
			comission = sale * 0.3F;
		}
		else if((sale >= 5001) && (sale <= 9999) ) {
			comission = sale * 0.2F;
		}
		else if((sale >= 1001) && (sale <= 4999)) {
			comission = sale * 0.1F;
		}
		else {
			comission = 0.0F;
		}
		
		System.out.println("Comission is: $" + comission);
		
		
		//Part 2: Movie Discounts
		//A movie cinema does price discounting depending on a customer's age.
		//The app prompts a user to enter their age on the IntelliJ console after which it checks whether the user meets the discount conditions.
		System.out.println("----------Part2----------");
		System.out.println("Enter you age: ");
		
		int age  = Integer.parseInt(reader.readLine());
		float total = 0.0F;
		
		if (age > 60) {
			//55% discount
			total = 7 * 0.45F;
		}
		if (age < 5) {
			//60% discount
			total = 7 * 0.40F;
		}
		else {
			total = 7;
		}
		
		System.out.println("The total price for the ticket is: " + total);
		
		
		reader.close();
		
	}
}
