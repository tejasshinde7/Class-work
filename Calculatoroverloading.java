package anudeep;

public class Calculatoroverloading {
public int add(int a,int b) {
	
	return a+b;
}
public int add(int a,int b,int c) {
	
	return a+b+c;
}
public double add(double a,double b) {
	
	return a+b;
}
public double add(double a,double b,double c) {
	
	return a+b+c;
}
public static void main(String[] args) {
	Calculatoroverloading obj=new Calculatoroverloading();
	int sum1=obj.add(15, 20);
	System.out.println(sum1);
	int sum2=obj.add(10, 20, 30);
	System.out.println(sum2);
	double sum3=obj.add(50.5,60.9);
	System.out.println(sum3);
	double sum4=obj.add(10.2, 12.5,15.5);
	System.out.println(sum4);
}
}
