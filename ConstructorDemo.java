package anudeep;
class Pet{
	int age;
	String name;
	Pet(String name,int age){
		System.out.println("Your pet name is :"+ name +" he is "+ age +" years old");
		System.out.println("pet is Rombo and he is 12 years old..");
	}
}
public class ConstructorDemo{
public static void main(String[] args) {
	Pet p=new Pet("YoYo", 45);
	
}
}
