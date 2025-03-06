import java.util.Scanner;
class Employee{
	int salary;
	String name;
	public int getSalary(){
		return salary;
	}
	public String getName(){
		return name;
	}
	public String setName(String changeName){
		name = changeName;
		return name;
	}
}
class MethodsAndClass{
   public static void main(String[] args){
	   Employee employee1 = new Employee();
	   employee1.salary = 10000;
	   employee1.name = "Shourya";
	   System.out.println(employee1.getName());
	   System.out.println(employee1.getSalary());
	   System.out.println(employee1.setName("Riya"));
   }
}