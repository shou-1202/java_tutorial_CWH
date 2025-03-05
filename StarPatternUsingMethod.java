import java.util.Scanner;
class StarPatternUsingMethod{
     void Pattern(int a){
		 for(int i= 1;i<a;i++){
			 for(int j =0;j<i;j++){
				 System.out.print("*");
			 }
			 System.out.println();
		 }
	 }
  public static void main(String[] args){
	  Scanner input = new Scanner(System.in);
	  System.out.println("Enter a number: ");
	  int number = input.nextInt();
	  StarPatternUsingMethod obj = new StarPatternUsingMethod();
	  obj.Pattern(number);
  }
}