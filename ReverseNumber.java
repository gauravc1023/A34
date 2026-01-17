import java.util.Scanner;

class ReverseNumber{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a Number : ");			// PRINT REVERSE NUMBER
		int num = sc.nextInt();
		
		int rev = 0;

		while(num>0){
			int last = num % 10;

			rev = rev * 10 + last;

			num/=10;
		}
		System.out.println("Reverse of given number is " + rev);
	}
}