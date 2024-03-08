import java.util.Scanner;

		
public class FarenheitToCelciusConv {

	public static void main(String[] args) {
		
		double value = 0; String Selections = " ";

		String UserAsk = " ";
		
		boolean Breaker = true;
		
		Scanner scanner = new Scanner(System.in);
		
			System.out.print("Enter  ( F - Celsius to Fahrenheit or C - Fahrenheit to Celsius)" );
			 Selections = scanner.next().toUpperCase();
			
		
		double Farenheit = (value * 9/5) + 32;
		
		double Celcius = (value - 32) * 9/5;
		
			
		do {	
			switch(Selections) {
				case "F": {
					System.out.print("Enter value : ");
					 value = scanner.nextDouble();
					 Farenheit = (value * 9/5) + 32;
					 System.out.printf("The result is %.2f ",  Farenheit,  "Farenheit");
					 break;
				}
				case "C": {
					System.out.print("Enter value : ");
					 value = scanner.nextDouble();
					 Celcius = (value - 32) * 9/5;
					 System.out.printf("The result is %.2f ", Celcius, " Celcius ");
					 break;
				}
			}
		System.out.println("Do you want to convert again Enter Y/N");
		UserAsk = scanner.next().toUpperCase();
		}while(UserAsk == "Y");
		
	}

}
