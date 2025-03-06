import java.util.Scanner;
class Rectangle{
	double length;
	double width;
	public double calculatingArea(){
		return length*width;
	}
	public double perimeter(){
		return 2*(length+width);
	}
}
class Rectangle2{
   public static void main(String[] args){
	   Rectangle obj = new Rectangle();
	   Scanner input = new Scanner(System.in);
	   System.out.println("Enter length of rectangle: ");
	   double length = input.nextDouble();
	   obj.length = length;
	   System.out.println("Enter width of rectangle: ");
	   double width = input.nextDouble();
	   obj.width = width;
	   System.out.println("Area: "+obj.calculatingArea());
	   System.out.println("Perimetr: "+obj.perimeter());
   }
}