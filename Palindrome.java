package anudeep;

import java.util.Scanner;

public class Palindrome {
	
		public static void main(String args[]){
		int n, rem,sum=0,temp;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		n=sc.nextInt();
		temp=n;
		while(n>0)
		{
		rem=n%10;
		sum=(sum*10)+rem;
		n=n/10;
		}
		if(temp==sum){

		System.out.println("palindrome number");
		}

		else
		{

		System.out.println(" not palindrome number");

		}

		}
		}

