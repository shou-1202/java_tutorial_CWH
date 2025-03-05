import java.util.Scanner;
class StarPatternUsingRecusriveFunction{
     void Pattern(int a){
		if(a==0){
			return;
		}
		System.out.print("* ");
		Pattern(a-1);
	 }
	 void Rows(int row){
		 if(row==0){
			 return;
		 }
		 Pattern(row);
		 System.out.println();
		 Rows(row-1);
	 }
	 void Row(int rows){
		 int b = 1;
		 while(b<=rows){
			 Pattern(b);
			 System.out.println();
		     b++;
		 }
		 if(b>rows){
			 return;
		 }
	 }
  public static void main(String[] args){
	  Scanner input = new Scanner(System.in);
	  System.out.println("Enter the number of rows: ");
	  int numberOfRows = input.nextInt();
	  StarPatternUsingRecusriveFunction obj = new StarPatternUsingRecusriveFunction();
	  obj.Rows(numberOfRows);
	  obj.Row(numberOfRows);
  }
}