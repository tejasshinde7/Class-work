package anudeep;
class Pet1{
	int age;
	String name;
	Pet1(String n,int a){
		name=n;
		age=20;
	}
	public void display() {
		System.out.println("Your name "+ name +" your age"+ age );
	}
}
public class ConstructorDemo2 {
public static void main(String[] args) {
	Pet1 obj=new Pet1("Tejas",45);
	obj.display();
}
}
