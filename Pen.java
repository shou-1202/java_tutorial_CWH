import java.util.Scanner;
abstract class Pen1{//initializing abstract class
    abstract void write();
	abstract void refill();
}
class FountainPen extends Pen1{
	void write(){
		System.out.println("You can start Writing");
	}
	void refill(){
		System.out.println("Ink is finished, Please refill");
	}
	void changeNib(){
		System.out.println("Nib is damaged, Please change");
	}
}
class Pen{
   public static void main(String[] args){//main function
   FountainPen obj = new FountainPen();
   obj.write();
   obj.refill();
   obj.changeNib();
   }
}
