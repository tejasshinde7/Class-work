package anudeep;

public class Methodoverloading {
    public double area(double pi,int r) {
    	
    	double area=pi*r*r;
    	return area;
    	
    }
    public int area(int s) {
    	
    	int area =s*s;
    	return area;
    }
    public int are(int l,int b) {
    	int area=l*b;
    	return area;
    }
    public static void main(String[] args) {
		Methodoverloading m=new Methodoverloading();
		System.out.println("Area of cricle= "+ m.area(3.14, 4));
		System.out.println("area of square= "+m.area(5));
		System.out.println("area of rectangle ="+m.are(8, 9));
	}
}
