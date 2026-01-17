import java.util.Scanner;
class Conditional3{
	public static void main(String [] args){
		System.out.println("Enter Number : ");
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		String number  = (num<0)?"Negative": "Positive";
		System.out.println(number);
	}
}