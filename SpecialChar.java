import java.util.Scanner;
class SpecialChar{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Character :");
	
		char ch = sc.next().charAt(0);
		
		if(!((ch>=48 && ch<=57)||(ch>='a' && ch<='z')||(ch>='A'&&ch<='Z'))){
			System.out.println(ch + " is a Special Character");
		}
		if((ch>=48 && ch<=57)||(ch>='a' && ch<='z')||(ch>='A'&&ch<='Z')){
			System.out.println(ch + " is Not a Special Character");
		}
	}
}