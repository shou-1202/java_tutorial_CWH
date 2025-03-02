import java.util.Scanner;
class MaximumElementAndMinimumElement{
  public static void main(String[] args){
	  Scanner input = new Scanner(System.in);
	  int [] a = new int[5];
	  System.out.println("Enter elements for first array:");
	  for(int i = 0;i<5;i++){
		a[i] = input.nextInt();
	  }
	  int c = a[0];
	  for(int i = 0; i<5;i++){
		  if(a[i]>c){
			  c = a[i];
		  }
	  }
	  int d = a[0];
	  for(int j = 0;j<5;j++){
		  if(a[j]<d){
			  d = a[j];
		  }
	  }
	  System.out.println("Maximum Element of array: "+c);
	  System.out.println("Minimum Element of array: "+d);
  }
}