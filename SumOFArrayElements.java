class SumOFArrayElements{
  public static void main(String[] args){
	  float [] arr = {2.95f, 3.5f, 6.2f, 9.7f, 8.2f};
	  float sum = 0;
	  for(int i = 0;i<5;i++){
		  sum+=arr[i];
	  }
	  System.out.println("Sum of array elements: "+sum);
  }
}