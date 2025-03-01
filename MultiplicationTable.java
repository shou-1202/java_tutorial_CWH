import java.util.Scanner;
class MultiplicationTable{
    public static void main(String[] args){
	int  n;
	Scanner input = new Scanner(System.in);	
	System.out.println("Enter a number: ");
	n = input.nextInt();
	int i = 1;
	while(i<11){
		System.out.println(n+" X "+i+" = "+(n*i));
		i++;
	}
	
  }
}