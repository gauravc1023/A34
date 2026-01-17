import java.util.Scanner;

class VowelConsonantMethod{
	static char a;
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a character : ");
		a = sc.next().toUpperCase().charAt(0);
		vowelConsonant();
	}
	public static void vowelConsonant(){
		if(a=='A'|| a=='E'|| a=='I' || a=='O' || a=='U')
			System.out.println(a+ " is Vowel ");
		else 
			System.out.println(a+ " is Consonent");
	}
}