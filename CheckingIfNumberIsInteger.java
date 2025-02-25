import java.util.Scanner;//importing scanner
class CheckingIfNumberIsInteger{
    public static void main(String[] args){
		System.out.println("Enter a number: ");
		Scanner input = new Scanner(System.in);//opening scanner object
		System.out.println(input.hasNextInt());// checking if input number is integer or not
		input.close();
	}
}