package anudeep;

import java.util.Scanner;

// wap to find the minimum of array(accept 5 values)
public class ArrayDemo4 {
public static void main(String[] args) {
	int a[]=new int[5];
	int i,min;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the five elements=");
	for(i=0;i<5;i++) {
		a[i]=sc.nextInt();
	}
	min=a[0];
	for(i=0;i<5;i++) {
		if(a[i]<min) {
			min=a[i];
		}
		System.out.println(min);
	}
	System.out.println("the minimum  element ="+ min);
	
}
}
