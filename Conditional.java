import java.util.Scanner;
class Conditional{
	public static void main(String [] args){
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter 2 numbers: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		String res = (a>b)?"Greater":"Smaller";
		System.out.println(res);
}
}