import java.util.Scanner;
class JVM{

	static int bjp , cong , aap , ss , mns , nota ;

	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		   System.out.println("Enter the population : ");
		int population = sc.nextInt();

		for(int i = 1; i<=population; i++){
			System.out.println("\n *****ELECTRONIC VOTING MACHINE***** ");
			System.out.println("LIST OF PARTIES");
			System.out.println("1. BJP");
			System.out.println("2. CONG");
			System.out.println("3. AAP");
			System.out.println("4. MNS");
			System.out.println("5. SS");
			System.out.println("6. NOTA");
			System.out.println("Enter Your Vote");
		
			int option = sc.nextInt();

			if(option == 1){
				bjp++;
				System.out.println("\n You have voted for BJP");
				System.out.println(" ACCHE DIN AAYENGE \n");
			}else if(option == 2){
				cong++;
				System.out.println("\n You have voted for Congress");
				System.out.println(" BHARAT JODO");
			}else if(option == 3){
				aap++;
				System.out.println("\n You have voted for AAP");
				System.out.println("Apka ek vote mujhe azad kr sakta hain.");
			}else if(option == 4){
				mns++;
				System.out.println("\n You have voted for MNS");
				System.out.println("JAI MAHARASHTRA");
			}else if(option == 5){
				ss++;
				System.out.println("\n You have voted for SS");
				System.out.println(" HUM HAIN ASLI SENA");

			}else if(option == 6){
				nota++;
				System.out.println("\n You have not voted for anyone");
				System.out.println("OHHHH, You are educated");
			}else {
				System.out.println("\n INVALID OPTION ");
				i--;
			}
		}

		if(bjp>=cong && bjp>=aap && bjp>=mns && bjp>=ss && bjp>=nota)
		{
			System.out.println("BJP has won this Election by :" + bjp+ "votes.");		
		}
		else if(cong>=bjp && cong>=aap && cong>=mns && cong>=ss && cong>=nota)
		{
			System.out.println("CONGRESS has won this Election by :" + cong+ "votes.");		
		}
		else if(aap>=bjp && aap>=cong && aap>=mns && aap>=ss && aap>=nota)
		{
			System.out.println("AAP has won this Election by :" + aap+ "votes.");		
		}
		else if(mns>=bjp && mns>=cong && mns>=aap && mns>=ss && mns>=nota)
		{
			System.out.println("MNS has won this Election by :" + mns+ "votes.");		
		}
		else if(ss>=bjp && ss>=cong && ss>=mns && ss>=aap && ss>=nota)
		{
			System.out.println("SHIVSENA has won this Election by :" + ss+ "votes.");		
		}
		else 
		{
			System.out.println("NO ONE HAS WON THIS ELECTION");		
		}

	}
}
