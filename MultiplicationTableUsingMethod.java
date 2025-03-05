import java.util.Scanner;
class MultiplicationTableUsingMethod{
     static void Table(int a){
		 for(int i= 1;i<11;i++){
			 System.out.println(a+" x "+i+" = "+a*i);
		 }
	 }
  public static void main(String[] args){
	  Scanner input = new Scanner(System.in);
	  System.out.println("Enter a number: ");
	  int number = input.nextInt();
	  Table(number);
  }
}