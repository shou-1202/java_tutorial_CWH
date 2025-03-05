import java.util.Scanner;
class SumOfNaturalNumbersUsingRecursiveFunction{
     int Sum(int a){
		 if(a==0){
		     return 0;
		 }
		 else{
			 return a+Sum(a-1);
		 }
	 }
	 int SumOfNumbers(int b){
		 int sum = 0;
		 while(b>0){
			sum += b;
			b--;
		 }	
         return sum;		 
	 }		 
  public static void main(String[] args){
	  Scanner input = new Scanner(System.in);
	  System.out.println("Enter a number: ");
	  int number = input.nextInt();
	  SumOfNaturalNumbersUsingRecursiveFunction obj = new SumOfNaturalNumbersUsingRecursiveFunction();
	  int result = obj.Sum(number);
	  System.out.println("Sum of first "+number+" natural numbers is "+result);
	  int result2 = obj.SumOfNumbers(number);
	  System.out.println("Sum of first "+number+" natural numbers is "+result2);
  }
}