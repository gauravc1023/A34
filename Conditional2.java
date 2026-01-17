import java.util.Scanner;
class Conditional2{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Age : ");
		int age = sc.nextInt();	
		
		String res = age > 18 ? "Greater" : "Smaller";
		System.out.println(res);
	}
}