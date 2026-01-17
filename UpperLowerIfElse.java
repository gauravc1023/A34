import java.util.Scanner;
class UpperLowerIfElse{
	public static void main(String [] aargs){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Alphabet : ");

		char ch = sc.next().charAt(0);
		
		if(ch>=65 && ch<=90){
			System.out.println(ch + " is Uppercase");
		}
		else{
			System.out.println(ch + " is Lowercase");
		}
	}
}