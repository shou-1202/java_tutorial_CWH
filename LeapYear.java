import java.util.Scanner;//importing scanner
class LeapYear{
    public static void main(String[] args){
		int year;// declaring variables to store values
		Scanner input = new Scanner(System.in);//opening scanner object
		System.out.println("Enter a year: ");
		year = input.nextInt();//reading input from the user
		if((year%4==0)&&(year%100!=0)||(year%400==0)){
			System.out.println("It's a Leap Year!");
		}
		else{
			System.out.println("It's not a Leap Year!");
		}
		input.close();
	}
}