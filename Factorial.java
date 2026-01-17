import java.util.Scanner;
class Factorial{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number : ");
		int number = sc.nextInt();
		Long fac = 1L;
		for(int i = 1; i <= number ; i++){
			fac = fac * i;
		}
		System.out.println(fac);
	}
}