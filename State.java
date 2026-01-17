class State{
	public static void main(String [] args){
		String name = "MAHARASHTRA";
		int area = 307_173;
		int totalPopulation = 1286590000;
		String lang = "MARATHI";
		int perCapita = 319474;
		int villages = 44778;
		int voters = (totalPopulation/100)*66;

		System.out.println("******STATE INFORMATION******");
		System.out.println("State Name :"+ name);
		System.out.println("Area :" + area);
		System.out.println("Total Population :" + totalPopulation);
		System.out.println("Language :"+ lang);
		System.out.println("Per Capita :" + perCapita);
		System.out.println("Villages :"+ villages);
		System.out.println("Voters :" + voters);
	}
}