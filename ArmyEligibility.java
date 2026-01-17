import java.util.Scanner;

class ArmyEligibility{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your Age :");
		int age = sc.nextInt();

		System.out.print("Enter your Height in cm :");
		int height = sc.nextInt();

		System.out.print("Enter your weight in kg :");
		int weight = sc.nextInt();
				
		if(age>18 && height>162 && weight>56){
			System.out.println("You are eligible to join Army");
		}
		else {
			System.out.println("You are not eligible to join Army");
		}	
	}
}