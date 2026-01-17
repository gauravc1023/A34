import java.util.Scanner;

class CountDigitInNumber{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num ;
		
		int count=0;
		for(num = sc.nextInt(); num>0 ; num/=10)
		{
			count++;
			
		}
	

		System.out.println(count);
	}

}