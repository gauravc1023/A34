import java.util.Scanner;
class LeapYear{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Year : ");
	
		int year = sc.nextInt();

		if(year%400==0 || (year%4==0 && year%100!=0)){
			System.out.println(year + " is a Leap Year");
		}
		if(!(year%400==0 || (year%4==0 && year%100!=0))){
			System.out.println(year + " is not a Leap Year");
		}
	}
}