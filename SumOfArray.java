package anudeep;

public class SumOfArray {
public static void main(String[] args) {
	int sum=0,avg;
	int a[]=new int [5];
	a[0]=67;
	a[1]=4;
	a[2]=65;
	a[3]=98;
	a[4]=34;
	for(int i=0;i<5;i++) {
		 sum=sum +a[i];
		 
	}
	avg=sum/5;
	System.out.println("The addition ="+ sum);
	System.out.println(avg);
}
}
