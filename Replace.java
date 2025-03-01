import java.util.Scanner;//importing scanner
class Replace{
    public static void main(String[] args){
		String str;// declaring variables to store values
		Scanner input = new Scanner(System.in);//opening scanner object
		System.out.println("Enter a string: ");
		str = input.nextLine();//reading input from the user
		System.out.println(str.replace(" ", "_"));//printing the result
		input.close();//closing scanner object
	}
}