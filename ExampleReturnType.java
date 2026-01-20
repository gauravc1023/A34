import java.util.Scanner;

class ExampleReturnType{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.print     ("Enter a Number : ");
		int input = sc.nextInt();

		String output = findWeekDay1(input);
		System.out.println(output);
	}
	
	public static String findWeekDay1(int input){
		if(input<1 || input > 7)
			return "INVALID INPUT";
	
		String [] weekDays = {"Mon","Tue","Wed","Thu","Fri","Sat","Sun"};
		return weekDays[input-1];
	}
	
	public static String findWeekDay2(int input){
		String weekDay = switch(input){
			case 1 -> "MONDAY";
			case 2 -> "TUESDAY";
			case 3 -> "WEDNESDAY";
			case 4 -> "THURSDAY";
			case 5 -> "FRIDAY";
			case 6 -> "SATURDAY";
			case 7 -> "SUNDAY";
			default -> "INVALID INPUT";
		};
		return weekDay;
	}

}