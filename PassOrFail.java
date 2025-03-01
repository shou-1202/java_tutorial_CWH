import java.util.Scanner;//importing scanner
class PassOrFail{
    public static void main(String[] args){
		double marks1, marks2, marks3;// declaring variables to store values
		Scanner input = new Scanner(System.in);//opening scanner object
		System.out.println("Enter marks for subject1: ");
		marks1 = input.nextDouble();//reading input from the user
		System.out.println("Enter marks for subject2: ");
		marks2 = input.nextDouble();//reading input from the user
		System.out.println("Enter marks for subject3: ");
		marks3 = input.nextDouble();//reading input from the user
		double total = ((marks1+marks2+marks3)/300)*100;
		if(total>=40){
			if((marks1>=33)&&(marks2>=33)&&(marks3>=33)){
				System.out.println("You have passed the examination!");
			}
			else{
				System.out.println("Sorry! you have failed.");
			}
		}
		else{
			System.out.println("Sorry! you have failed.");
		}
		
	}
}