import java.util.Scanner;
class FibonacciSeriesUsingRecursiveFunction{
     int Fibonacci(int a){//declaring method
		 if(a<=1){
			 return a;
		 }
		 return Fibonacci(a-1)+Fibonacci(a-2);
	 }
  public static void main(String[] args){
	  Scanner input = new Scanner(System.in);
	  System.out.println("Enter number of terms: ");
	  int terms = input.nextInt();
	  FibonacciSeriesUsingRecursiveFunction obj = new FibonacciSeriesUsingRecursiveFunction();
	  for(int i = 0;i<terms;i++){
		  System.out.print(obj.Fibonacci(i)+" ");
	  }
	  System.out.println();
  }
}