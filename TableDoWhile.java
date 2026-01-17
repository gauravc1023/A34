import java.util.Scanner;
class TableDoWhile{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Enter a Number : ");

		int num = sc.nextInt();
	
		int i=2;
		do
		{
			System.out.println(i*num);
			
			i++;
		}
		while(i<=10);

	}
}