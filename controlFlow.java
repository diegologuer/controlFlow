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
		reader.close();
		
		
		

		
	}
}
