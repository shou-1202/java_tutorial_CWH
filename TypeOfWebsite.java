import java.util.Scanner;//importing scanner
class TypeOfWebsite{
    public static void main(String[] args){
		String website;// declaring variables to store values
		Scanner input = new Scanner(System.in);//opening scanner object
		System.out.println("Enter your website: ");
		website = input.nextLine();//reading input from the user
		if(website.endsWith(".com")){
			System.out.println("Commercial Website");
		}
		else if(website.endsWith(".org")){
			System.out.println("Organizational Website");
		}
		else if(website.endsWith(".in")){
			System.out.println("Indian Website");
		}
	}
}