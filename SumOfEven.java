package anudeep;

import java.util.Scanner;

public class SumOfEven {
public static void main(String[] args) {
	int i,sum=0;
	int a[]=new int[10];
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the numbers");
	for(i=0;i<10;i++) {
		a[i]=sc.nextInt();
	}
	for(i=0;i<10;i++) {
		if(a[i]%2==0) {
			sum=sum+a[i];
		}
	}
	System.out.println(sum);
}
}
