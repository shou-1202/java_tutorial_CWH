import java.util.Scanner;
class StarPatternUsingMethod2{
     void Pattern2(int a){
		 for(int i= a;i>0;i--){
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
	  StarPatternUsingMethod2 obj = new StarPatternUsingMethod2();
	  obj.Pattern2(number);
  }
}