import java.util.Scanner;
public class Decryption {
	static Scanner input = new Scanner(System.in);
	
	
	public static void Decrypt() {
		String message;
		int key;
		
		System.out.println("Please enter your message you would like to decode:");
		message = input.next();	
		System.out.println("How many letters do you want to de-shift your message?");
		key = Encryption.userNumberValidation();
		
		char[] messageToCharacters = message.toCharArray();
		
		System.out.println("Original message: " + message);
		System.out.print("Decrypted message: ");
		
		for (char letter : messageToCharacters) {
			letter -= key;
			System.out.print(letter);
		}
		System.out.println("");
		
	}
}
