import java.util.Scanner;//importing scanner
class StringToLowerCase{
    public static void main(String[] args){
		String str;// declaring variables to store values
		Scanner input = new Scanner(System.in);//opening scanner object
		System.out.println("Enter a string: ");
		str = input.nextLine();//reading input from the user
		System.out.println(str.toLowerCase());//printing the result
		input.close();//closing scanner object
	}
}