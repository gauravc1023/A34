//PRODUCT OF ALL DIGIT IN GIVEN NUMBER
import java.util.Scanner;

class  ProdOfDigitInNum{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");			
		int num = sc.nextInt();

		int prod = 1;

		while(num>0){
			int digit = num % 10;
			prod = prod * digit;
			num/=10;
		}
		System.out.println("Product of the digits is : "+ prod);
	}
}