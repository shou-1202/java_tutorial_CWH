import java.util.Scanner;//importing scanner
class IncomeTax{
    public static void main(String[] args){
		double salary, tax;// declaring variables to store values
		Scanner input = new Scanner(System.in);//opening scanner object
		System.out.println("Enter your salary: ");
		salary = input.nextDouble();//reading input from the user
		System.out.println("Salary: "+salary);
		if(salary>250000){
			tax  = salary*0.05;
			System.out.println("tax: "+ tax);
		}
		else if(salary>500000){
			tax = salary*0.2;
			System.out.println("tax: "+ tax);
		}
		else if(salary<250000){
			System.out.println("Tax cannot be applied!");
		}
		else{
			tax = salary*0.3;
			System.out.println("tax: "+ tax);
		}
	}
}