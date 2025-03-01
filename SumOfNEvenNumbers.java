import java.util.Scanner;
class SumOfNEvenNumbers{
    public static void main(String[] args){
	int sum = 0, n;
	Scanner input = new Scanner(System.in);	
	System.out.println("Enter a number: ");
	n = input.nextInt();
	int i = 0;
	while(i<(n*2)){
		sum += i;
		i += 2;
	}
	System.out.println("Sum of first "+n+" even numbers: "+sum);
	input.close();
  }
}