import java.util.Scanner;
class UpperLower{
	public static void main(String [] aargs){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Alphabet : ");

		char ch = sc.next().charAt(0);
		
		if(ch>=65 && ch<=90){
			System.out.println(ch + " is Uppercase");
		}
		if(ch>=97 && ch<=122){
			System.out.println(ch + " is Lowercase");
		}
	}
}