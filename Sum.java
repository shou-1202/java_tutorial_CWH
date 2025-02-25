import java.util.Scanner;//importing scanner
class Sum{
    public static void main(String[] args){
		int number1,number2, number3, sum;// declaring variables to store values
		Scanner input = new Scanner(System.in);//opening scanner object
		System.out.println("Enter the numbers: ");
		number1 = input.nextInt();//reading input from the user
		number2 = input.nextInt();
		number3 = input.nextInt();
		sum = number1+number2+number3;//calculating sum of 3 numbers
		System.out.println("Sum of 3 numbers is  "+sum);//printing the result
		input.close();//closing scanner object
	}
}