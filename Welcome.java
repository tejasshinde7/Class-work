package anudeep;


	import java.util.Scanner;
	public class Welcome {
	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Get input from the user
	        System.out.print("Enter your name: ");
	        String userName = scanner.nextLine();

	        // Display welcome message
	        System.out.println("Welcome, " + userName + "!");

	        // Close the scanner
	        scanner.close();
	    }
	}


