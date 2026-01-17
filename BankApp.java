import java.util.ArrayList;
import java.util.Scanner;
class BankApp
{
	static String name ; //null
	static int pin ; //0
	static double balance ; //0.0
	static Long contact ;  // 0
	static final Long ACCOUNT = 1234_1345_1324L;
	static final String IFSC_CODE = "LCF000001";
	static ArrayList<String> transactions = new ArrayList<>();
	
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);

		welcomeLoop:
		for ( ; ; )
		{
			System.out.println("\n ****** WELCOME ****** ");
			System.out.println("  *** LAXMI CHIT FUND *** \n ");
			System.out.println("1. LOGIN ");
			System.out.println("2. CREATE ACCOUNT");
			System.out.print("\n Enter your option : ");
			int opt = sc.nextInt();
			switch(opt){
				case 1:
				{
				    if(name == null){
					System.out.println("\n CREATE YOUR ACCOUNT FIRST \n");
					continue ;
				    }
				    // loop runs 3 times and app terminates if cred is wrng
				    for(int i=1, attempt = 3; i<=3 ; i++)
				    {
					System.out.println("\n *** LOGIN *** ");
					System.out.print("Contact : ");
					Long userContact = sc.nextLong();
					System.out.print("Pin : ");
					int userPin = sc.nextInt();
					if(contact == userContact && pin == userPin )
					{
						homePage:
						for ( ; ; )
						{
							System.out.println("\n ***** HOME PAGE ***** \n");
							System.out.println("1. Deposit ");
							System.out.println("2. withdraw ");
							System.out.println("3. Check Balance ");
							System.out.println("4. Transactions ");
							System.out.println("5. Logout");
							System.out.print("\n Enter your option : ");
							int op1 = sc.nextInt();
							switch(op1)
							{
								case 1:{
								     System.out.println("\n *** DEPOSIT MODULE *** \n");
								     System.out.print("Enter your amount : ");
								     double depAmt = sc.nextDouble();
								     balance += depAmt;
								     transactions.add("Deposit : " + depAmt);
								     System.out.println("\n AMOUNT DEPOSITED SUCCESSFULY \n");
								     break;
								}
								case 2: {
								     System.out.println("\n *** WITHDRAW MODULE ***\n");
								     System.out.print("Enter an amount : ");
								     double withDrwAmt = sc.nextDouble();
								     System.out.print("Enter your pin : ");
							             int userPin1 = sc.nextInt();
								     if(userPin1 == pin){
									if(withDrwAmt<=balance){	
										balance -= withDrwAmt;
										transactions.add("Withdraw : " + withDrwAmt);
										System.out.println("\n AMOUNT DEBITED SUCCESSFULY\n ");
									}else{
										System.out.println("\n INSUFFICIENT FUNDS \n");
									}
								     }else{
									System.out.println("\n INVALID PIN \n ");
								     }
								     break;
							    }
							    case 3:{
								     System.out.println("\n *** CHECK Balance Module *** \n");
								     System.out.print("Enter your pin : ");
								     int userPin2 = sc.nextInt();	
								     if(userPin2 == pin){
									 System.out.println("Your avl bal is :" + balance + "rs.");											     
									 }else{
									 System.out.println("\n INVALID PIN\n");
									 break;																									
									}
								}
								case 4 :{
								     System.out.println("\n ***** Transaction MODULE ******\n");
								     for(String ele : transactions ){
									 System.out.println(ele);
								     }
								     break;
							 	}
							 	case 5 : {
								     System.out.println(" ***** THANK U & VISIT AGAIN *****");
								     continue welcomeLoop ; 
								}
								default : {
								     System.out.println("\n INVALID OPTION \n");
								}
							
							}
						}
					}
				    else{
						System.out.println("\n INVALID CRED\n");
						System.out.println(" ATTEMPT LEFT : "+ --attempt);
					}
				
				}
				System.out.println("\n YOUR ACCCOUNT IS BEEN BLOKED FOR 24 HOURS \n");
				System.exit(0);  //JVM terminate
				break;
				}
				case 2:
				{
					if(name != null){
						System.out.println("\n ACCOUNT ALREADY EXIST \n");
					}
					System.out.println("\n *** ACCOUNT CREATION ***");
					System.out.print("Name : ");
					name = new Scanner(System.in).nextLine();
					System.out.print("Pin : ");
					pin = sc.nextInt();
					System.out.print("Contact : ");
					contact = sc.nextLong();
					System.out.print("Balance : ");
					balance = sc.nextDouble();
					transactions.add("Deposit (Creation) : " + balance);
					System.out.println("\n ACCOUNT CREATED SUCCESSFULLY \n");
					break;
				}
				default :{
					System.out.println(" \n INVALID OPTION \n");
				}
			}
		}
	}
}