package anudeep;


	import java.util.Scanner;
	public class Calculator {
	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Get input from the user
	        System.out.print("Enter the first number: ");
	        double num1 = scanner.nextDouble();

	        System.out.print("Enter the second number: ");
	        double num2 = scanner.nextDouble();

	        // Display the available operations
	        System.out.println("Select an operation:");
	        System.out.println("1. Addition");
	        System.out.println("2. Subtraction");
	        System.out.println("3. Multiplication");
	        System.out.println("4. Division");

	        // Get user choice
	        System.out.print("Enter the operation number (1-4): ");
	        int choice = scanner.nextInt();

	        // Perform the selected operation
	        switch (choice) {
	            case 1:
	                System.out.println("Result: " + (num1 + num2));
	                break;
	            case 2:
	                System.out.println("Result: " + (num1 - num2));
	                break;
	            case 3:
	                System.out.println("Result: " + (num1 * num2));
	                break;
	            case 4:
	                if (num2 != 0) {
	                    System.out.println("Result: " + (num1 / num2));
	                } else {
	                    System.out.println("Error: Division by zero is not allowed.");
	                }
	                break;
	            default:
	                System.out.println("Invalid choice. Please enter a number between 1 and 4.");
	        }

	        // Close the scanner
	        scanner.close();
	    
	    }
	}


