import java.util.Scanner;

class PalindromeProgram{
	static String str; //null
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a String : ");
		str = sc.next();  //racecar
		isPalindrome();
	}
	public static void isPalindrome(){
		int i = 0, j = str.length()-1;
		boolean assumpt = true;
		while(i<j)
		{
			if(str.charAt(i) != str.charAt(j)){
				assumpt = false;
				break;
			}
			i++;
			j--;
		}
		if(assumpt){
			System.out.println(str + " is Palindrome");
		}else{
			System.out.println(str + " is not Palindrome");		
		}
	}
}