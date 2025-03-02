import java.util.Scanner;
class ReverseArray{
  public static void main(String[] args){
	  Scanner input = new Scanner(System.in);
	  int [] a = new int[5];
	  int [] b = new int[5];
	  System.out.println("Enter elements for first array:");
	  for(int i = 0;i<5;i++){
		a[i] = input.nextInt();
	  }
	  int j = 0;
	  for(int i = 4;i>=0;i--){
		  while(j<5){
			  b[j] = a[i];
			  j++;
			  break;
		  }
	  }
	  for(int elements:a){
		  System.out.print(elements);
	  }
	  System.out.println();
	  for(int elements:b){
		  System.out.print(elements);
	  }
	  System.out.println();
  }
}