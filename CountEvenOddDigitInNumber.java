import java.util.Scanner;

class CountEvenOddDigitInNumber{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		
		int num ;
		
		int evenCount = 0;
		int oddCount = 0;

		
		for(num = sc.nextInt() ; num > 0; num/=10 )
		{
			int digit = num%10;

			if(digit%2 == 0)
			{
			     evenCount++;
			}
			else 
			{
			     oddCount++;
			}
			
		}
		System.out.println("Count of even Digit's is " + evenCount );
		System.out.println("Count of odd Digit's is " + oddCount );
	}
}