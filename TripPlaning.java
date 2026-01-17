import java.util.*;
class TripPlaning{
	public static void main(String [] args){

		System.out.println(" ***** Trip Planing *****");

		String adhyaksh = "Gaurav";
		ArrayList<String> location = location();
	
		String [] contactList = {"Manjit","Vaibhav","Arvind","Sanket","Himanshu"};		
		ArrayList<String> names = new ArrayList<String>();
		names.add("Gaurav");
		
		for(int i=0; i<contactList.length; i++){
			String name = contactList[i];
			boolean resp = calling(name, location);
			if(resp){
				names.add(name); 
			}
		}

		vehicle(names , location);
	}
	
	public static void vehicle(ArrayList<String> names, ArrayList<String> location){
		String [] offerings = offerings();
		System.out.println("Location : " + location);
		System.out.println("Names : " + names);
		System.out.println("Reached");
		System.out.println(Arrays.toString(offerings));
		System.out.println("Trip Completes");
	}

	public static String [] offerings(){
		String prasad = "MODAK";
		String flower = "HIBISCUS";
		String grass = "DURVA";
		String donation = "101";
		String fruit = "Coconut";
		String prayer = "JALDI SE JOB DILA DO";

		String [] offerings = {prasad, flower, grass, donation, fruit, prayer};
		return offerings;
	}

	public static boolean calling(String name, ArrayList<String> location){
		System.out.println("\n Gaurav"+ " Calling " + name );
		Scanner sc = new Scanner(System.in);
		System.out.print("\n Are you Coming : ");
		String resp = sc.next().toUpperCase();
		if(resp.equals("YES"))
			return true;
		else
			return false;
	}
	
	public static ArrayList<String> location(){
		String place = "Dagdu Sheth Ganpati";
		String address = "ABC Chowk, Mandai Road, Pune, MH ";	
		String timings = "6:00 am ";
		String date = "14/01/2026";
		
		ArrayList<String> venue = new ArrayList<String>();
		venue.add(place);
		venue.add(address);
		venue.add(timings);
		venue.add(date);
		return venue;
	}
}