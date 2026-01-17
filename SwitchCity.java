import java.util.Scanner;
class SwitchCity{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("******TRAVAL GUIDE******");
	
		System.out.println("Enter the city name you would like to explore : ");
	
		String city = sc.next();
		System.out.println("List of Places");
		switch(city)
		{
			case "Nashik":
			{
				System.out.println("1. Ramkund Godaghat");
				System.out.println("2. Sita Gupha");
				System.out.println("3. Kalaram Temple");
				System.out.println("4. Goraram Temple");	
				System.out.println("5. Kapaleshwar Temple");
				System.out.println("6. Trimbakeshwar Temple (Jyotirling)");
				System.out.println("7. Anjneri Hill");	
				System.out.println("8. Harihar Fort");
				System.out.println("9. Grape Embessy");
				System.out.println("10. Samarth juice center");
				break;
			}
			case "Mumbai":
			{
				System.out.println("1. CSMT");
				System.out.println("2. Marine Drive");
				System.out.println("3. Gate Way Of India");
				System.out.println("4. Kolaba Market");	
				System.out.println("5. FS Street");
				System.out.println("6. Sidhhivinayak Temple");
				System.out.println("7. Elephanta Caves");	
				System.out.println("8. Mumbai's Famous Vadapav");
				System.out.println("9. Ranibag");
				System.out.println("10. Leopold Cafe");
				break;
			}
			case "Pune":
			{                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          
				System.out.println("1. Dagadusheth Ganpati Temple");
				System.out.println("2. Shanivar Wada");
				System.out.println("3. Lal Mahal");
				System.out.println("4. Tulshibaag");	
				System.out.println("5. FC Road");
				System.out.println("6. Parvati Hill");
				System.out.println("7. Khadakwasla Dam");	
				System.out.println("8. Lonavala-Khandala");
				System.out.println("9. Aga Khan Palace");
				System.out.println("10. Phoneix MarketCitty");
				break;
			}
			case "Nagpur":
			{
				System.out.println("1. Oranges");
				System.out.println("2. Shri Ganesh Mandir Tekdi");
				System.out.println("3. Zero mile");
				System.out.println("4. Deekshabhoomi");	
				System.out.println("5. Pench National Park");
				System.out.println("6. Seminary Hills");
				System.out.println("7. Khindsi Lake");	
				System.out.println("8. Shukrawari Lake");
				System.out.println("9. Maharaj Bagh Zoo");
				break;
			}

		}		
	}
}