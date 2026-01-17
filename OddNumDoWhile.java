import java.util.Scanner;
class OddNumDoWhile{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
	
		//System.out.println("Enter a Number : ");

		int start = 1;
	
		do
		{
			System.out.println(start);
			
			start+=2;
		}
		while(start<=100);

	}
}