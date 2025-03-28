import java.util.Scanner;
abstract class Monkey{//initializing abstract class
    abstract void jump();
	abstract void bite();
}
interface BasicAnimal{
	void eat();
	void sleep();
}
class Human extends Monkey implements BasicAnimal{
	void jump(){
		System.out.println("Monkey starts jumping");
	}
	void bite(){
		System.out.println("Even the gentlest monkey may bite when cornered");
	}
	public void eat(){
		System.out.println("It is said that humans follow monkey eating habits");
	}
	public void sleep(){
		System.out.println("Monkeys sleep in trees, humans sleep in beds—both dreaming of a world where they rule.");
	}
}
class AbstractAndInheritance{
   public static void main(String[] args){//main function
   Human obj = new Human();
   obj.jump();
   obj.bite();
   obj.eat();
   obj.sleep();
   }
}