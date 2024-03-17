//encapsulation : the idea behind this is to ensure that the implementaion deatils are not visible to users
//the variables of one class will be hidden from other classes, accesible only through the methods of the current class

class BankAccount {
	private double balance = 0;
	public void deposit(double x){
		if(x > 0){
			balance += x;
		}
	}
}
//this implementation hides the balance variable, enabling acess to it only through the deposit method 
//which validates the amount before modifying the variable
//encapsulation provides the following benfits
//conntrol of the way data is accesed
//more flexible and easy to change

//INHERITANCE 
//this enables one class to acquire the properties(methods and variables) of another
//to inherit from a class use the extend keyword
class Animal {
	protected int legs;
	public void eat()
		system.out.println("animal eats");
}
//protected access modifier makes legs available to only subclassses
class Dog extends Animal{
	Dog(){
		legs = 4;
	}
}
// as you can see the dog class inherits from the animal class
class Myclass{
	public static void main(String[] args){
		Dog d = new Dog();
		d.eat();
	}
}

//POLYMORPHISM
//the idea of having many forms
//this occurs when there are lots of inherited classes i.e subclasses of the same kind
//a call to a member method will be different depending on the object invoking it meaning:
//depending on which animal is making a soound the sound made will differ
class Animal {
	public void makeSound(){
		system.out.println("dandaddan");
	}
}
class Dog extends Animal{
	public void makeSound(){
		system.out.println("woof woof")
	}
class cow extends Animal{
	public void makeSound(){
		system.out.println("moo mooo")
	}
class cat extends Animal{
	public void makeSound(){
		system.out.println("meow meow")
	}

}

class Myclass{
	public static void main(String[] args){
		Animal a = new cow();
		Animal b = new cat();
		a.makeSound();// since a is refrence variable a contains the dog object it will call the makesound function of the object 
		b.makeSound();// this will call that of the cat 	
	}

}

//Overiding and overloading
//method overriding
class Animal {
	public void makeSound(){
		system.out.println("dandaddan");
	}
}
class Dog extends Animal{
	@Override//this is like a comment we call when we override functions
	public void makeSound(){//the class dog overrides the makesound method
		system.out.println("woof woof")
	}
//you cannot override static or final
//if you can not inherit you cannot overlload


java.util.Scanner
class Myclass{
	public static void main(String[] args){
		Scanner Senjougahara_Hitagi = Scanner(System.in)
		my_input = Senjougahara_Hitagi.nextline()
	}
}



//method overloading
//when methods have the same name but different parameters

class Myclass{
	public static void main(String[] args){
	
	}
	public int max(int a, int b){
		if (a > b){
			return a;
		}
		else{
			return b
		}
	}
	//now to overridde the initial max function
	public double max(double a, double b){
		if (a > b){
			return a;
		}
		else{
			return b
		}
	}
	//now the max method also works with variables
	// it is also called compile-time polymorphism
}

//Abstaction
//abstarction provides the outside world with only essential information in a process of representing essential features without including implementaion deatails
//if a class is decalred abstarct you cannot create objects of that class
abstract class Animal {
	int legs;
	public void makesound();
}

class Cat extends Animal{
	public void makeSound(){
		System.out.println("meow");
	}
}
//every animal makes a sound but each has a different way of doing it thats why we define an abstarct class animal and leave the definition of how they make sounds to the subclasses