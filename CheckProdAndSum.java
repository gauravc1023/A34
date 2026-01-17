//CHECK IF THE SUM OF DIGIT AND PRODUCT IS SAME OR NOT 
import java.util.Scanner;

class CheckProdAndSum{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Number: ");		
		int num = sc.nextInt();

		int sum = 0, prod = 1;

		while(num>0){
			int digit = num % 20;
		
			sum += digit;

			if(digit==0){
			continue;
			}
			prod *= digit;

			num/=10;
		}
		 if(sum==prod){
			System.out.println("Sum and Product of Digits in Number is Same");
		}
		else{
			System.out.println("Sum and Product of Digits in Number is Not Same");

		}
	}
}