import java.util.Scanner;
import java.util.Random;
class Game{// initializing class
	int computerInput;
	int userInput;
	int numberOfGuess = 0;
	
	public void computerGuess(){// random number generating from computer
		Random random = new Random();
		computerInput = random.nextInt(100);// assigning the number to variable
	}
	public void userGuess(){// method to take user input
		Scanner input = new Scanner(System.in);
		System.out.println("Guess the number: ");
		userInput = input.nextInt();//assigning user input value to variable
	}
	public boolean isCorrect(){
		numberOfGuess++;
		if(userInput==computerInput){//applying condition
			System.out.println("Congratulations! you guessed it correct");
			System.out.println("You guessed it in "+ numberOfGuess+" attempts");
			return true;// breaking the loop if this condition is met
		}
		else if(userInput>computerInput){
			System.out.println("It is too High");
		}
		else if(userInput<computerInput){
			System.out.println("It is too Low");
		}
		return false;
	}
}

class GuessTheNumberGame{
   public static void main(String[] args){// main function
	   Game obj = new Game();// creating object of our class
	   obj.computerGuess();// calling method to generate a number
	   while(true){// using while loop to continuously generating till user guessed it right
	   obj.userGuess();
	   if(obj.isCorrect()){
		   break;
	   }
	   }
   }
}