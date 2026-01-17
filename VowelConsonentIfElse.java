import java.util.Scanner;

class VowelConsonentIfElse{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Character : ");
		char ch = sc.next().toUpperCase().charAt(0);

		if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
			System.out.println(ch + " is a VOWEL");
		}
		else{
			System.out.println(ch +" is a CONSONENT");
		}
	}
}