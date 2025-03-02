import java.util.Scanner;
class ToCheckIfArrayIsSorted{
  public static void main(String[] args){
	  Scanner input = new Scanner(System.in);
	  int [] a = new int[5];
	  System.out.println("Enter elements for first array:");
	  for(int i = 0;i<5;i++){
		a[i] = input.nextInt();
	  }
	  boolean flag = true;
	  for(int i =0;i<4;i++){
		  if(a[i]>a[i+1]){
			  flag = false;
			  break;
		  }
	  }
	  if(flag==true){
		  System.out.println("Array is sorted");
	  }
	  else{
		  System.out.println("Array is not sorted");
	  }
  }
}