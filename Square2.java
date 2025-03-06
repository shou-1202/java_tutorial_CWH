import java.util.Scanner;
class Square{
	double side;
	public double calculatingArea(){
		return side*side;
	}
	public double perimeter(){
		return 4*side;
	}
}
class Square2{
   public static void main(String[] args){
	   Square obj = new Square();
	   Scanner input = new Scanner(System.in);
	   System.out.println("Enter side of square: ");
	   double n = input.nextDouble();
	   obj.side = n;
	   System.out.println("Area: "+obj.calculatingArea());
	   System.out.println("Perimetr: "+obj.perimeter());
   }
}