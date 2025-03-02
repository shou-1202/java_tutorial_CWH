import java.util.Scanner;
class SumOfTwoMatrices{
  public static void main(String[] args){
	  Scanner input = new Scanner(System.in);
	  int [][] a = new int[2][3];
	  int [][] b = new int[2][3];
	  System.out.println("Enter elements for first array:");
	  for(int i = 0;i<2;i++){
		  for(int j = 0;j<3;j++){
			  a[i][j] = input.nextInt();
		  }
	  }
	  System.out.println("Enter elements for second array:");
	  for(int i = 0;i<2;i++){
		  for(int j = 0;j<3;j++){
			  b[i][j] = input.nextInt();
		  }
	  }
	  int [][] c = new int[2][3];
	  for(int i=0;i<2;i++){
		  for(int j =0;j<3;j++){
			  c[i][j] = a[i][j] + b[i][j];
		  }
	  }
	  for(int k=0;k<2;k++){
		 for(int l=0;l<3;l++){
			 System.out.print(c[k][l]+" ");
		 }
		 System.out.println();
	  }
	  
  }
}