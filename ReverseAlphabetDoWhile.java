import java.util.Scanner;
class ReverseAlphabetDoWhile{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
	
		//System.out.println("Enter a Number : ");

		int start = 122;
	
		do
		{
			System.out.println((char)start);
			
			start--;
		}
		while(start>=97);

	}
}