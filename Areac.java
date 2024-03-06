package anudeep;

import java.util.Scanner;

public class Areac {
	
	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        String userInput;
	        
	        while (true) {
	            // Ask the user if they want to calculate the area
	            System.out.print("Do you want to find the area of a circle? (yes/no): ");
	            userInput = scanner.nextLine().toLowerCase();
	            
	            // Check if the user wants to exit
	            if (!userInput.equals("yes")) {
	                break;
	            }
	            
	            // Get the radius from the user 
	            System.out.print("Enter the radius of the circle: ");
	            double radius = scanner.nextDouble();
	            
	            // Consume the newline character left in the buffer
	            scanner.nextLine();
	            
	            // Calculate the area of the circle
	            double area = Math.PI * Math.pow(radius, 2);
	            
	            // Display the result
	            System.out.println("The area of the circle with radius " + radius + " is: " + area);
	        }
	        
	        // Close the scanner
	        scanner.close();
	        
	        System.out.println("Program exited. Thank you!");
	    }
	}


