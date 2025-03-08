import java.util.Scanner;
class Rectangle{
	private double length;
	private double width;
	public Rectangle(){
		length = 4;
		width = 5;
	}
	public Rectangle(double len, double wid){
		length = len;
		width = wid;
	}
	public void displayInfo(){
	    System.out.println("length: "+length);
		System.out.println("radius: "+width);
	}
}
class ConstructorOverloading{
   public static void main(String[] args){
	   Rectangle obj1 = new Rectangle();
	   obj1.displayInfo();
	   Rectangle obj2 = new Rectangle(11.2, 12.4);
	   obj2.displayInfo();
   }
}