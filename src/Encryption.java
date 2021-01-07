import java.util.Scanner;
public class Encryption {
	static Scanner input = new Scanner(System.in);
	
	public static void Encrypt() {
		String message;
		int key;
		
		System.out.println("Please enter your message you would like to encode:");
		message = input.next();	
		System.out.println("How many letters do you want to shift your message?");
		key = userNumberValidation();
		
		
		char[] messageToCharacters = message.toCharArray();
		
		System.out.println("Original message: " + message);
		System.out.print("Encrypted message: ");
		
		for (char letter : messageToCharacters) {
			letter += key;
			System.out.print(letter);
		}
		System.out.println("");
	}
	
	
	public static int userNumberValidation() {
		boolean isNumber = false;
		int key = 0;
		
		do {
			if (input.hasNextInt()) {
				System.out.println("Key 1: " + key);
				isNumber = true;
				key = input.nextInt();
				}
			else {
				System.out.println("Please enter a valid number...");
				input.next();
				}
			
		}while(isNumber == false);
		
		return key;
	}
}
