import java.util.Scanner;
class 	Circle{
	double radius;
	public double calculatingArea(){
		return 3.14*(radius*radius);
	}
	public double perimeter(){
		return 2*3.14*radius;
	}
}
class Circle2{
   public static void main(String[] args){
	   Circle obj = new Circle();
	   Scanner input = new Scanner(System.in);
	   System.out.println("Enter radius of circle: ");
	   double radius = input.nextDouble();
	   obj.radius = radius;
	   System.out.println("Area: "+obj.calculatingArea());
	   System.out.println("Perimetr: "+obj.perimeter());
   }
}