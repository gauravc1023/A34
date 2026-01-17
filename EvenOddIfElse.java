import java.util.Scanner;
class EvenOddIfElse{
	public static void main(String [] args){
		System.out.print("Enter a number : ");

		int num = new java.util.Scanner(System.in).nextInt();

		if(num%2 == 0){
			System.out.println(num + " is Even.");		
		}
		else{
			System.out.println(num + " is Odd.");
		}

	}
}