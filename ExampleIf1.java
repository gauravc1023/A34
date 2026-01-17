import java.util.Scanner;
class ExampleIf1{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number : ");
		int num = sc.nextInt();

		System.out.print("By 'Print Statement' Approach ");
		if(num%5 == 0){
			System.out.print("HiFive");	
		}
		if(num%2 == 0){
			System.out.println("HiTwo");
		}											
	}
}
































