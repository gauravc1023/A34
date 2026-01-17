import java.util.Scanner;

class Hotel
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);

		
		System.out.println("----------Welcome to Taza Hotel----------");

		System.out.println("1.Veg");
		System.out.println("2.Non-Veg");

		System.out.println("Enter your option: ");
		
		int op = sc.nextInt();
	
		switch(op)
		{
			case 1:
			{
				System.out.println("-------Veg Menu--------");
				System.out.println("1. Poha   -------   20.0");
				System.out.println("2. Upma   -------   20.0");
				System.out.println("3. Idli   -------   40.0");
				System.out.println("4. Dosa   -------   70.0");
				System.out.println("5. Vada Pav -----   15.0");
				System.out.println("6. Varan Batti --   100.0");
				System.out.println("7. Paneer Masala    120.0");

				System.out.println("Enter your option: ");

				int ip = sc.nextInt();
	
				switch (ip)
				{
					case 1:
					case 2:
					{
						System.out.println("Enter the quantity: ");
						int no = sc.nextInt();
						
						double billAmt = no * 20;

						System.out.println("Total bill: " + billAmt);
						break;
					}
					case 3:
					{
						System.out.println("Enter the quantity: ");
						int no = sc.nextInt();
						
						double billAmt = no * 30;
	
						System.out.println("Total bill: " + billAmt);		
						break;		
					}
					case 4:
					{
						System.out.println("Enter the quantity: ");
						int no = sc.nextInt();

						double billAmt = no * 70;
						System.out.println("Total bill: " + billAmt);
						break;
					}
					case 5:
					{
						System.out.println("Enter the quantity: ");
						int no = sc.nextInt();
		
						double billAmt = no * 15;
						System.out.println("Total bill:" + billAmt);
						break;
					}
					default:
					{
						System.out.println("Not in the Menu !!");
					}
				}
				
			}
			break;
			case 2:
			{
				System.out.println("-----Non-Veg Menu-----");
				System.out.println("1. Chicken Biryani ----- 200.0");
				System.out.println("2. Chicken 65      ----- 400.0");
				System.out.println("3. Mutton Handi    ----- 700.0");
				System.out.println("4. Egg Omlette     ----- 80.0");
				System.out.println("5. Fish Fry        ----- 150.0");
				System.out.println("6. Mutton Thali    ----- 150.0");

				System.out.println("Opening shortly !!");

				break;
			}
			default:
			{
				System.out.println("Order something what every human");
			}
		}
		
	}
}