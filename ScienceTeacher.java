package anudeep;

import java.util.Scanner;

class Teacher
{
	int tid;
	String tname;
	double sallary;
	Scanner sc=new Scanner(System.in);
	public void accept() {
		System.out.println("Enter the id");
		tid=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the teacher name:");
		tname=sc.nextLine();
		System.out.println("Enter your sallary:");
		sallary=sc.nextDouble();
	}
}
class Hra{
	double salary;
}
public class ScienceTeacher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
