import java.util.Scanner;
class FibonacciSeriesUsingFunction{
     void Fibonacci(int a){//declaring method
		 int b = 0;// first
		 int c = 1;
		 System.out.print("Fibonacci series: "+b+" "+c);
		 int i = a;
		 while(i>0){
			 int temp = b;
			 b = c;
			 c = temp+b;
			 System.out.print(" "+c);
			 i--;
		 }
		 System.out.println();
	 }
  public static void main(String[] args){
	  Scanner input = new Scanner(System.in);
	  System.out.println("Enter a number: ");
	  int number = input.nextInt();
	  FibonacciSeriesUsingFunction obj = new FibonacciSeriesUsingFunction();
	  obj.Fibonacci(number);
  }
}