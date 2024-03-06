package anudeep;
class Animal{
	public void SoundOfAnimal() {
		System.out.println("The animals makes a sound");
	}
}
class Cat extends Animal{
	public void SoundOfAnimal() {
		System.out.println(" Cat meows ");
	}
}
/*class Dog extends Animal{
	@Override
	public void SoundOfAnimal() {
		System.out.println("Dog barks");
	}*/
	
	class Cow{
		public void SoundOfAnimal() {
			System.out.println("cow cose");
		}
	}

public class AnimalOverriding {
public static void main(String[] args) {
	Cat c=new Cat();
	c.SoundOfAnimal();
	//Dog d=new Dog();
	// d.SoundOfAnimal();
	Cow cc=new Cow();
	cc.SoundOfAnimal();
}
}

