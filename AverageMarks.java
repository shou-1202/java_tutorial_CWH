import java.util.Scanner;
class AverageMarks{
  public static void main(String[] args){
	  Scanner input = new Scanner(System.in);
	  System.out.println("Enter number of students: ");
	  int n = input.nextInt();
	  double [] arr = new double[n];
	  for(int i = 0;i<n;i++){
		  System.out.println("Enter marks for student"+(i+1)+":");
		  arr[i] = input.nextDouble();
	  }
	  double sum = 0;
	  for(double elements:arr){
		  sum += elements;
	  }
	  double averageMarks = sum/n;
	  System.out.println("Average marks: "+averageMarks);
  }
}