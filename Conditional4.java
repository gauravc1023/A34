import java.util.Scanner;
class Conditional4{
	public static void main(String [] args){
		System.out.println("Enter Number : ");
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		String number  = (num%2==0)?"Even": "Odd";
		System.out.println(number);

	}

}