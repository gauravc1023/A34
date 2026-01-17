import java.util.Scanner;

class ValidatePin{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);

		int storedPin = 34566;

		int attempt = 0;
		
		do
		{
			System.out.println("Enter the pin: ");
			int pin = sc.nextInt();
	
			if(storedPin == pin)
			{
				System.out.println("Login success !");
				break;
			}
			else
			{
				System.out.println("Incorrect Pin");
				attempt++;
			}
		}
		while(attempt<3);

		if(attempt == 3)
		{
			System.out.println("Maximum attempts reached !");
		}
	}
}