import java.util.Scanner;
class BinaryToIntegerMethod{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number :");

		String num = sc.next();

		int number = binaryToInteger(num);
		System.out.println(num + " : "+ number);
	}
		
	public static int binaryToInteger(String num){
		int p=0, sum = 0;
		for(int i=num.length()-1 ; i>=0 ; i--){
			char ch = num.charAt(i);	
			int integer = ch-48;
			int pow = power(2,p);
			sum += (pow*integer);
			p++;
		}
		return sum;
	}
	public static int power(int n, int p){
		int pow = 1;
		for(int i= 1; i<=p ; i++){
			pow*=n;
		}
		return pow;
	}	
}