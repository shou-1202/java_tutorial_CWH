import java.util.Scanner;
class EvenAndOdd{
public static void main(String[] args){
  Scanner input = new Scanner(System.in);
  int size = input.nextInt();
  int [] a = new int[size];//declaring an array
  int [] odd = new int[size];
  int [] even = new int[size];
  int s = 0, p = 0, q = 0;
  int sizeOfOdd = 0;
  int sizeOfEven = 0;
  for(int i = 0;i<a.length;i++){
	  System.out.println("\nEnter a number "+(i+1)+": ");
      a[i] = input.nextInt();// storing input value in the variable
  }
  for(int i = 0;i<a.length;i++){
	  if(a[i]%2==0){
		  even[s] = a[i];
		  s++;
		  sizeOfEven++;
	  }
  }
  for(int i = 0;i<a.length;i++){
	  if(a[i]%2!=0){
		  odd[p] = a[i];
		  p++;
		  sizeOfOdd++;
	  }
  }
  for(int j = 0;j<sizeOfOdd;j++){
      a[j] = odd[j];
  }
  for(int k = sizeOfOdd;k<(sizeOfEven+sizeOfOdd);k++){
      a[k] = even[q];
      q++;
  }	  
  System.out.println("Final Array: ");
  for(int i = 0;i<a.length;i++){
	  System.out.println(a[i]);
  }
  input.close();//closing scanner object
}
}