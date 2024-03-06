package anudeep;

import java.util.Scanner;



public class Coffee {
int co;
Scanner sc=new Scanner(System.in);
public void accept() {
	System.out.println("Enter the choice :-");
	co=sc.nextInt();
	System.out.println("1.cortado coffe");
	System.out.println("2.Iced coffe");
	System.out.println("3.Affocato coffe");
    System.out.println("4.Irish coffe");
    System.out.println("5.Doppio coffe");
    System.out.println("6.cold brew");
}
public void dataOfCoffe() {
	switch(co) {
	case 1:
		System.out.println("The prize of coffe is 50");
		break;
	case 2:
		System.out.println("the prize of coffe is 100");
		break;
	case 3:
		System.out.println("the prize of coffe is 150");
		break;
	case 4:
		System.out.println("The prize of coffe is 200");
		break;
	case 5:
		System.out.println("the prize of coffe is 300");
		break;
	case 6:
		System.out.println("the prize of coffe is 100");
		break;
		default:
			System.out.println("This coffe is not avilable in that cafe");
			break;
	}
	
}
public static void main(String[] args) {
	Coffee obj=new Coffee();
	obj.accept();
	obj.dataOfCoffe();
}
}
