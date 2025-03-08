import java.util.Scanner;
class Cylinder{
	private double radius;
	private double height;
	public double getRadius(){
		return radius;
	}
	public void setRadius(double rad){
		radius = rad;
	}
	public double getHeight(){
		return height;
	}
	public void setHeight(double heit){
		height = heit;
	}
	public double surfaceArea(){
		return (2*3.14*radius)*(radius+height);
	}
	public double volume(){
		return 3.14*radius*radius*height;
	}
}
class SetCylinderRadiusAndHeight{
   public static void main(String[] args){
	   Cylinder obj = new Cylinder();
	   obj.setHeight(11.5);
	   obj.setRadius(5.2);
	   System.out.println("Height: "+obj.getRadius());
	   System.out.println("Radius: "+obj.getHeight());
	   System.out.println("Radius: "+obj.surfaceArea());
	   System.out.println("Radius: "+obj.volume());
   }
}