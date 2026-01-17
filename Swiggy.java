class Swiggy{
	public static void main(String [] args){
		String name = "SWIGGY";
		int restaurants = 250000;
		int riders = 457249;
		int users = 2470000;
		int orders = 250000;
		int canceledOrders = (orders/ 100)*10;
		int complaints = 15000;

		System.out.println("State Name :"+ name);
		System.out.println("Restaurants :" + restaurants);
		System.out.println("Riders:"+ riders);
		System.out.println("Users:" + users);
		System.out.println("Orders:"+ orders);
		System.out.println("Canceled Orders :" + canceledOrders);
		System.out.println("Complaints :"+ complaints);
	}
}