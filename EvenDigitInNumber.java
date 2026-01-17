import java.util.Scanner;

class EvenDigitInNumber{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		
		int num ;
		
		
		for(num = sc.nextInt() ; num > 0; num/=10 )
		{
			int digit = num%10;

			if(digit%2 == 0)
			{
			     System.out.println("The Given Number contain Even Digit ");
			     break;
			} 
			else 
			{
			     System.out.println("The Given Number does not contain Even Digit ");
			     break;
			}
				
		}
		
	}
}