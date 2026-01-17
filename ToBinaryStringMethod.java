import java.util.Scanner;
class ToBinaryStringMethod{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number :");
		int num = sc.nextInt();

		String binary = toBinaryString(num);
		System.out.println(num + " : "+ binary);
		
	}
	public static String toBinaryString(int num){
		String binary = "";
		while(num!= 0){
			int rem = num%2;
			binary = rem + binary;
			num /= 2;
		}
		return binary;
	}
}