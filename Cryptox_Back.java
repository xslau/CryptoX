/**
 * CrytoX: The Basic Cryptography Program
 * CryptoX Back
 * @author: Xzavian Slaughter
 *
 * The purpose of this program is to provide the code for a cryptography program that can generate random psaswords, create passwords from phrases through character 
 * replacement, and encode and decode Atbesh cryptograms. 
 */

import java.util.Scanner;
import java.util.Random; 
public class Cryptox_Back {

	Scanner input = new Scanner(System.in); 
	private int choice = 0; 
        private int length; 	
	private String password = "";
	private String phrase = ""; 
       	private String focus = "";
	private String solve = ""; 	

	private static final char [] TOTAL_SET = {' ','!', '@', '#', '$', '%', '^', '&', '*', '(', ')', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
		'A', 'B', 'C', 'D', 'E', 'F','G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z','a','b','c','d','e','f','g',		'h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};

	private static final char [] ALPHA_SET = {' ','A','a','B','b','C','c','D','d','E','e','F','f','G','g','H','h','I','i','J','j','K','k','L','l','M','m','N','n','O','o',	'P','p','Q','q','R','r','S','s','T','t','U','u','V','v','W','w','X','x','Y','y', 'Z','z'};

       	private static final char [] ATBESH_SET = {' ','Z','z','Y','y','X','x','W','w','V','v','U','u','T','t','S','s','R','r','Q','q','P','p','O','o','N','n','M','m','L','l', 'K','k','J','j','I','i','H','h','G','g','F','f','E','e','D','d','C','c','B','b','A','a'}; 	

	/**
	 *Random Password Generator
	 *@author: Xzavian Slaughter
	 */
	public void RandomPW() {

		//Aesthetic Line Placement
		spacer(); 
		
		//Input for length of password
		System.out.println("Password Length: "); 
		length = input.nextInt();

		//Population of array with random character of array consisting of capital and lowercase letters, symbols, and numbers
		for (int i = 0; i < length; i++) {

			Random rand = new Random(); 
			password = password + TOTAL_SET[rand.nextInt(TOTAL_SET.length)];   
		}

		System.out.println("Password: " + password);
		password = ""; 
		spacer(); 			 
	}

	/**
	 *Password Creator from a User Inputted Phrase
	 *@author: Xzavian Slaughter
	 */
	public void PWCreator() {

		//Aesthetic Line
		spacer(); 
		password = ""; 

		//User input for given phrase
		System.out.println("Enter phrase");
	        phrase = input.nextLine();

		//Character substitution algo
		for(int i = 0; i < phrase.length(); i++) {

			if(phrase.charAt(i) == 'A' || phrase.charAt(i) == 'a') {

				password = password +'@';

			} else if (phrase.charAt(i) == 'B' || phrase.charAt(i) == 'b') {

				password = password + '&'; 

			} else if (phrase.charAt(i) == 'C' || phrase.charAt(i) == 'c') {

				password = password + '(';

			} else if (phrase.charAt(i) == 'E' || phrase.charAt(i) == 'e') {

				password = password + '3';

			} else if (phrase.charAt(i) == 'H' || phrase.charAt(i) == 'h') {

				password = password + '#'; 

			} else if (phrase.charAt(i) == 'I' || phrase.charAt(i) == 'l') {

				password = password + '1';

			} else if (phrase.charAt(i) == 'i') {

				password = password + '!'; 

			} else if (phrase.charAt(i) == 'O' || phrase.charAt(i) == 'o') {

				password = password + '0';

			} else if (phrase.charAt(i) == 'Q' || phrase.charAt(i) == 'q') {

				password = password + '%'; 	

			} else if (phrase.charAt(i) == 'S' || phrase.charAt(i) == 's') {

				password = password + '$';

			} else {

				password = password + phrase.charAt(i);   
			}
		}

		System.out.println("Password: " + password); 	

	}

	/**
	 *Atbesh CrypTool
	 *Solves Atbesh Cryptograms
	 *@author: Xzavian 
	 *
	 */
	public void Atbesh() {

		spacer(); 
		System.out.println("Enter phrase: "); 
		focus = input.nextLine(); 
		spacer(); 

		for (int i = 0; i < focus.length(); i++) {

			for(int j = 0; j < ALPHA_SET.length; j++) {

				if(focus.charAt(i) == ATBESH_SET[j]) 
					solve = solve + ALPHA_SET[j]; 
				
			}
		}
		 
		System.out.println("Solved: " + solve); 
		
	}
	

	//Exit Protocol
	public void Exit() {

		spacer(); 
		System.out.println("Goodbye!");
	        spacer(); 	
		System.exit(0); 
	}

	//Aesthetic Line Static Program
	private static void spacer() {

		for (int i = 0; i < 34; i++) {

			System.out.print("-"); 
		}

		System.out.println();
	}	
}
