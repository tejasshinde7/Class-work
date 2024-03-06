package anudeep;

import java.util.Scanner;

public class ArrayDemo3 {
public static void main(String[] args) {
	int a[]=new int[5];
	int b[]=new int[5];
	int c[]=new int[5];
	int i;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the numbers for array 1");
	for(i=0;i<5;i++) {
		a[i]=sc.nextInt();
	}
	System.out.println("enter the numbers for array 2");
	for(i=0;i<5;i++) {
		b[i]=sc.nextInt();
	}
	System.out.println("the sum of these two array are =");
	for(i=0;i<5;i++) {
		c[i]=a[i]+b[i];
		System.out.println(c[i]);
	}
}
}
