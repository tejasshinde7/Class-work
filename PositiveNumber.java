package anudeep;

import java.util.Scanner;

public class PositiveNumber {
public static void main(String[] args) {
	int i;
	int a[]=new int[5];
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the numbers =");
		for(i=0;i<5;i++) {
			a[i]=sc.nextInt();
			
		}
		for(int p:a) {
			if(p>0)
			System.out.println(p);
		}
}
}
