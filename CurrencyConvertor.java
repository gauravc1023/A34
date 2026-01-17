import java.util.Scanner;

class CurrencyConvertor{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);

		for( ; ; ){
			System.out.println("\n *****WELCOME*****");
			System.out.println("	CURRENCY CONVERTOR");
			System.out.print("Enter an amount (INR) :");
			double inr = sc.nextDouble();
		
			System.out.println("Currency List ");
			System.out.println("1. USD");
			System.out.println("2. EUR");
			System.out.println("3. KWD");
			System.out.println("4. GBP");
			System.out.println("5. AUD");
			System.out.println("6. RUB");
			System.out.println("7. JPY");
			System.out.println("8. CNY");
			System.out.println("9. CAD");
			System.out.println("10. ZAR");

			System.out.println("Enter your option (CUR) :");
			String curr = sc.next().toUpperCase();
		
			Boolean assump = true;
		
			double currConv = 0;
			if(curr.equals("USD")){
				currConv = inr / 90.55;
			}
			else if(curr.equals("EUR")){
				currConv = inr / 106.29;
			}
			else if(curr.equals("KWD")){
				currConv = inr / 295.24;
			}
			else if(curr.equals("GBP")){
				currConv = inr / 121.09;
			}
			else if(curr.equals("AUD")){
				currConv = inr / 60.25;
			}
			else if(curr.equals("RUB")){
				currConv = inr / 1.13;
			}
			else if(curr.equals("JPY")){
				currConv = inr / 0.58;
			}
			else if(curr.equals("CNY")){
				currConv = inr / 12.84;
			}
			else if(curr.equals("CAD")){
				currConv = inr / 65.74;
			}
			else if(curr.equals("ZAR")){
				currConv = inr / 5.37;
			}
			else {
				assump = false;
				System.out.println("INVALID CURR");			
			}
		
			if(assump)
				System.out.printf("%n %.3f INR = %.2f %s %n",inr,currConv,curr);	
			




		}
	}
}