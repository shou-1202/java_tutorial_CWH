import java.util.Scanner;
class Cylinder{
	private double radius;
	private double height;
	public Cylinder(double rad, double heit){
		radius = rad;
		height = heit;
		System.out.println("Height: "+height);
		System.out.println("radius: "+radius);
	}
}
class SetCylinderRadiusAndHeightUsingConstructor{
   public static void main(String[] args){
	   Cylinder obj = new Cylinder(5.2, 12.5);
   }
}