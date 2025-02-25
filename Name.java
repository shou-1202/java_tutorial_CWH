import java.util.Scanner;//importing scanner
class Name{
    public static void main(String[] args){
		String name;// declaring variables to store values
		Scanner input = new Scanner(System.in);//opening scanner object
		System.out.println("Enter your name: ");
		name = input.nextLine();//reading input from the user
		System.out.println("Hello "+name+" have a good day!");//printing the result
		input.close();//closing scanner object
	}
}