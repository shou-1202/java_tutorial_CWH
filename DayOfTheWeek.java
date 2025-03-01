import java.util.Scanner;//importing scanner
class DayOfTheWeek{
    public static void main(String[] args){
		int day;// declaring variables to store values
		Scanner input = new Scanner(System.in);//opening scanner object
		System.out.println("Enter a number: ");
		day = input.nextInt();//reading input from the user
		switch(day){
			case 1 -> System.out.println("Monday");
			case 2 -> System.out.println("Tuesday");
			case 3 -> System.out.println("Wednesday");
			case 4 -> System.out.println("Thursday");
			case 5 -> System.out.println("Friday");
			case 6 -> System.out.println("Saturday");
			case 7 -> System.out.println("Sunday");
			default -> System.out.println("You have entered wrong number");
		}
		input.close();
	}
}