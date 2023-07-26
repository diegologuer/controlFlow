import java.io.BufferedReader;
import java.io.InputStreamReader;

public class controlFlow2 {

	public static void main(String[] args) throws Exception{
		//Part 2: Movie Discounts
		//A movie cinema does price discounting depending on a customer's age.
		//The app prompts a user to enter their age on the IntelliJ console after which it checks whether the user meets the discount conditions.

		System.out.println("----------Part2----------");
		System.out.println("Enter you age: ");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int age  = Integer.parseInt(reader.readLine());
		float total = 0.0F;
		
		if (age > 60) {
			//55% discount
			total = 7 * 0.45F;
		}
		else if (age < 5) {
			//60% discount
			total = 7 * 0.40F;
		}
		else {
			total = 7;
		}
		
		System.out.println("The total price for the ticket is: $" + total);
		
		
		reader.close();
	}

}
