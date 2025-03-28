package tutorial_12;
import java.util.Scanner;
class Calculator{
	int addition(int a, int b){
		return a+b;
	}
}
public class Packages{
   public static void main(String[] args){//main function
    Calculator obj = new Calculator();
	int sum = obj.addition(5,6);
	System.out.println(sum);
   }
}