package anudeep;
class Myarea{
	public int area(int s) {
		int areasquare=s*s;
		return areasquare;
	}
	public void area() {
		
		int l=10,b=32;
		int area=l*b;
		System.out.println("Area of rectangle= "+area);
	}
	public double sum(int a,double b)
	{
		double c=a+b;
		return c;
	}
}
public class Returndemo {
public static void main(String[] args) {
	Myarea obj=new Myarea();
	System.out.println("Area of square="+obj.area(5));
	System.out.println("sum ="+obj.sum(45, 65.7));
	obj.area();
}
}
