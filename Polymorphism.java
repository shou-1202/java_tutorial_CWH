import java.util.Scanner;
abstract class Telephone{//initializing abstract class
    abstract void ring();
	abstract void lift();
	abstract void disconnect();
}
class SmartPhone extends Telephone{
	void ring(){// demosntrating polymorphism
		System.out.println("Phone is ringing");
	}
	void lift(){
		System.out.println("Display is turning on");
	}
	void disconnect(){
		System.out.println("Phone is disconnected");
	}
	void camera(){
		System.out.println("Photo is saved in gallery");
	}
}
class Polymorphism{
   public static void main(String[] args){//main function
   Telephone phone = new SmartPhone();//dynamic method dispatch
   phone.ring();
   phone.lift();
   //phone.camera(); it will give error as reference is provide for telephone and it does not contain camera method
   }
}