import java.util.Scanner;//importing scanner
import java.util.Random;
class RockPaperScissor{
    public static void main(String[] args){
	Scanner input = new Scanner(System.in);//opening scanner object
	Random random = new Random();
	System.out.println("Enter your choice: (rock, paper, scissors)");
	String userChoice = input.nextLine().toLowerCase();
	int choice = random.nextInt(3);
	String computerChoice;
	if(choice == 0){
		computerChoice = "rock";
	}
	else if(choice == 1){
		computerChoice = "paper";
	}
	else{
		computerChoice = "scissors";
	}
	System.out.println("Computer Chose: "+computerChoice);
	if (userChoice.equals(computerChoice)){
        System.out.println("It's a tie!");
    } 
	else if ((userChoice.equals("rock") && computerChoice.equals("scissors")) ||(userChoice.equals("paper") && computerChoice.equals("rock")) ||(userChoice.equals("scissors") && computerChoice.equals("paper"))) {
        System.out.println("You win!");
    } 
	else{
        System.out.println("Computer wins!");
    }
	input.close();
	
  }
}