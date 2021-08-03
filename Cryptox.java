/**
 * CryptoX Front End 
 * @author Xzavian Slaughter
 * 
 * Front end of program meant to interact with back end and take in user input
 * 
 */
import java.util.Scanner; 

public class Cryptox {

	public static void main (String [] args) {

		Scanner input = new Scanner(System.in); 
		int choice = 0; 

		System.out.println("Welcome to CrytpoX!");
		Cryptox_Back Source = new Cryptox_Back(); 

		while(choice != 4) {

			System.out.println("1: Generate a Random Password of N length\n2: Atbesh\n3: Password Creator\n4: Exit"); 
			choice = input.nextInt(); 

			switch(choice) {

				case 1: 
					Source.RandomPW();
					break;
				case 2: 
					Source.Atbesh(); 
					break;
				case 3: 
					Source.PWCreator(); 
					break; 	
				case 4: 
					Source.Exit();
				        break;
				default: 
					System.out.println("Sorry! Something went wrong..."); 
					break; 	

			}		

		}
	}
}
