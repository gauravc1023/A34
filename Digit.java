import java.util.Scanner;
class Digit{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Character :");
	
		char ch = sc.next().charAt(0);
		
		if(ch>=48 && ch<=57){
			System.out.println(ch + " is Digit");
		}
		if(!(ch>=48 && ch<=57)){
			System.out.println(ch + " is Not Digit");
		}
	}
}