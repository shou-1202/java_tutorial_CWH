import java.util.Scanner;//importing scanner
class Cgpa{
    public static void main(String[] args){
		float marks1, marks2, marks3, cgpa;// declaring variables to store values
		Scanner input = new Scanner(System.in);//opening scanner object
		System.out.println("Enter marks for 3 subjects: ");
		marks1 = input.nextFloat();//reading input from the user
		marks2 = input.nextFloat();
		marks3 = input.nextFloat();
		cgpa = (marks1+marks2+marks3)/30;//calculating cgpa
		System.out.println("the cgpa is "+cgpa);//printing the result
		input.close();//closing scanner object
	}
}