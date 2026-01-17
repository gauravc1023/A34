import java.util.Scanner;

class SwitchMuscle{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("---------Welcome yo QSP fitness");
		System.out.println("Enter the muscle you like to tarin : ");
		
		String mus = sc.next();

		switch(mus)
		{
			case "Chest":
			{
				System.out.println("1. Bench Press");
				System.out.println("2. Inclined Press");
				System.out.println("3. Declined Press");
				System.out.println("4. Inclined dumble Press");
				System.out.println("5. Pec Flies");
				System.out.println("6. Push-Ups");
				break;
			}
			case "Biceps":
			{
				System.out.println("1. Dumble curls");
				System.out.println("2. Scull-rod curls");
				System.out.println("3. Dumble Hammer curls");
				System.out.println("4. Cable curls");
				System.out.println("5. Reverse cable curls");
				System.out.println("6. Breacher curls");	
				break;
			}
			case "Triceps":
			{
				System.out.println("1. Cable Extension");
				System.out.println("2. Scull Rod Extension");
				System.out.println("3. Cable Pull");
				System.out.println("4. Rope Extension");
				System.out.println("5. Dumble Kick");
				System.out.println("6. Diamond Push-ups");
				break;
			}
			case "Back":
			{
				System.out.println("1. Dead-lifts");
				System.out.println("2. Lat pull Down");
				System.out.println("3. Seated row");
				System.out.println("4. Closed arm lat puul down");
				System.out.println("5. Dumble row");
				break;
			}	
			case "Shoulder":
			{
				System.out.println("1. Dumble press");
				System.out.println("2. Arnold press");
				System.out.println("3. Front raises");
				System.out.println("4. side raises");
				System.out.println("5. Shrugs");
				break;
			}
			case "Legs":
			{
				System.out.println("1. Squats");
				System.out.println("2. Lunges");
				System.out.println("3. Leg press");
				System.out.println("4. Leg extension");
				System.out.println("5. Leg curls");
				System.out.println("6. Calfs");	
				break;
			}
			case "Abs":
			{
				System.out.println("1. Crunches");
				System.out.println("2. Leg Raise");
				System.out.println("3. Russian Twists");
				System.out.println("4. Bicycle");
				System.out.println("5. High Knees");
				System.out.println("6. Placks");
				break;
			}
			default:
			{
				System.out.println("Invalid Muscle");
			}
		}
	}
}