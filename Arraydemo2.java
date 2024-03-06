package anudeep;

import java.util.Scanner;

public class Arraydemo2 {

	public static void main(String[] args) {
		//dynamic declaration of an elements...
		// TODO Auto-generated method stub
int num[]=new int[5];
		int i;
Scanner sc=new Scanner(System.in);
System.out.println("Ennter the fiver numbers");
for(i=0;i<5;i++) {
	num[i]=sc.nextInt();
}
System.out.println("you have entered...");
for(i=0;i<5;i++) {
	System.out.println(num[i]);
}
	}

}
