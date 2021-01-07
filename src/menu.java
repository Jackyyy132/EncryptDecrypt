import java.util.Scanner;
public class menu {
	
	static Scanner input = new Scanner(System.in);
	public static void mainMenu() {
		
		String userMenuChoice;
		do {
			System.out.println("----------------------------------------------------------------------");
			System.out.println("Welcome to shifting letters encryption/decryption");
			System.out.println("A. Encrypt");
			System.out.println("B. Decrypt");
			System.out.println("E. Exit");
			System.out.println("----------------------------------------------------------------------");
			userMenuChoice = input.next().toUpperCase();
			
			if (userMenuChoice.equals("A")) {
				Encryption.Encrypt();
			}
			else if(userMenuChoice.equals("B")) {
				Decryption.Decrypt();
			}
			
			}while(!userMenuChoice.equals("E"));
		
			
			
		
	}
	
}
