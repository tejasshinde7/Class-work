package anudeep;

public class AverageOfArray {
public static void main(String[] args) {
	int i,avg,sum=0;
	int a[]= {67,4,65,98,34};
	for(i=0;i<5;i++) {
		sum=sum+a[i];
	
	}
	avg=sum/5;
	System.out.println("The average ="+ avg);
}
}
