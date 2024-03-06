package anudeep;

import java.util.Scanner;

public class ArrayDemo5 {
	public static void main(String[] args) {
		
	
int a[]=new int[5];
int i,max;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the numbers =");
for(i=0;i<5;i++) {
	a[i]=sc.nextInt();
}
max=a[0];
for(i=0;i<5;i++) {
	if(a[i]>max) {
		max=a[i];
	}
	System.out.println(max);
}
System.out.println("maximum number ="+ max);
}
}