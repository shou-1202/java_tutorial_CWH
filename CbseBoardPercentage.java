import java.util.Scanner;//importing scanner
class CbseBoardPercentage{
    public static void main(String[] args){
		double marks1, marks2, marks3, marks4, marks5;// declaring variables to store values
		Scanner input = new Scanner(System.in);//opening scanner object
		System.out.println("Enter marks for all subjects: ");
		marks1 = input.nextDouble();//reading input from the user
		marks2 = input.nextDouble();
		marks3 = input.nextDouble();
		marks4 = input.nextDouble();
		marks5 = input.nextDouble();
		double percentage = ((marks1+marks2+marks3+marks4+marks5)/500)*100;//calculating percentage
		System.out.println("Your Board Percentage is "+percentage+"%");//printing the result
		input.close();//closing scanner object
	}
}
		
	