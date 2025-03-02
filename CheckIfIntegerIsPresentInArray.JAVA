import java.util.Scanner;
class CheckIfIntegerIsPresentInArray{
  public static void main(String[] args){
	  int [] arr = {5, 10 ,15, 20, 25};
	  Scanner input = new Scanner(System.in);
	  System.out.println("Enter a number: ");
	  int n = input.nextInt();
	  int flag = 0;
	  for(int i = 0;i<5;i++){
		  if(arr[i] == n){
		     System.out.println("Element found at index "+i+" of array");
			 flag = 1;
			 break;
		  }
	  }
	  if(flag==0){
		  System.out.println("Sorry! element not found");
	  }
  }
}