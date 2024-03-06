package anudeep;
// In this example we have a parent class with a show()method,
// and a child class that extends the parent class and overrides the show() method.
//when we create an instance of child and call the show() method.
// The overriden method in the child class is executed ,not the one in the parent class.
class Parent{
	public void show() {
		System.out.println("It is parant class show..");
	}
}
class Child extends Parent{
	@Override
	public void show() {
		System.out.println("It is child class show..");
	}
}
public class Methodoverriding {
	public static void main(String[] args) {
		
Parent obj=new Parent();
obj.show();
Child obj1=new Child();
obj1.show();
Parent pp=new Child();
pp.show();


}
}
