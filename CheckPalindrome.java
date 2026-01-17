//CHECK IF THE GIVEN NUMBER AND REVERSE NUMBER IS SAME OR NOT 

import java.util.Scanner;

class CheckPalindrome{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a Number: ");				
		int num = sc.nextInt();
	
		int rev = 0;
	
		while(num>0){
			int digit = num % 10;

			rev = rev * 10 + digit;

			num/=10;
		}

		if(num==rev){
			System.out.println("Given Number and Reverse Number is Same");
		}
		else{
			System.out.println("Given Number and Reverse Number is Same");
		}
	}
}