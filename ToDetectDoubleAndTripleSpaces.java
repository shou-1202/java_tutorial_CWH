import java.util.Scanner;//importing scanner
class ToDetectDoubleAndTripleSpaces{
    public static void main(String[] args){
		String str;// declaring variables to store values
		Scanner input = new Scanner(System.in);//opening scanner object
		System.out.println("Enter a string: ");
		str = input.nextLine();//reading input from the user
		System.out.println(str.indexOf("  "));//printing the result
		System.out.println(str.indexOf("   "));
		input.close();//closing scanner object
	}
}