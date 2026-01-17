import java.util.Scanner;

class ContainZeroOrNot{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int num = sc.nextInt();

		boolean assump = false; 
		
		int temp = num;

		for( ; num>0 ; num /= 10)	
		{
			int digit = num % 10;

			if (digit == 0) 
			 { 
				assump = true; 
				break;
			 }
		}

		if (assump) 
		{ 
			System.out.println("The number contains 0.");
		} 
		else 
		{ 
		System.out.println("The number does not contain 0."); }
	}

}