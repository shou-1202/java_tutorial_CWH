import java.util.Scanner;//importing scanner
class Letter{
    public static void main(String[] args){
		String name, letter;// declaring variables to store values
		Scanner input = new Scanner(System.in);//opening scanner object
		System.out.println("Enter a name: ");
		name = input.nextLine();//reading input from the user
		letter = "Dear <|name|> , Thanks a lot!";
		System.out.println(letter.replace("<|name|>", name));//printing the result
		input.close();//closing scanner object
	}
}