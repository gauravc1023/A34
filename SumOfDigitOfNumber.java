//SUM OF ALL THE DIGIT OF GIVEN NUMBER
import java.util.Scanner;

class SumOfDigitOfNumber{
	public static void main(String [] args){
		
		Scanner sc = new Scanner(System.in);			
		System.out.println("Enter a Number : ");
		int num = sc.nextInt();	
	
		int sum = 0;

		while(num>0)
		{	
			int last = num % 10;
			sum+=last;
			num/=10;
		}
		System.out.println("Sum of all digit :" + sum);
	} 
}