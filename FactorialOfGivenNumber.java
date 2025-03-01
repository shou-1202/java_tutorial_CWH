import java.util.Scanner;
class FactorialOfGivenNumber{
    public static void main(String[] args){
	int  n,n2, factorial = 1, factorial2 = 1;
	Scanner input = new Scanner(System.in);	
	System.out.println("Enter two number: ");
	n = input.nextInt();
	n2 = input.nextInt();
	for(int i = 1;i<=n;i++){
		factorial *= i;
	}
	System.out.println("Factorial of "+n+" is "+factorial);
	int j =1;
    while(j<=n2){
	  factorial2 *= j;
	  j++;
    }
	System.out.println("Factorial of "+n2+" is "+factorial2);
  }
}