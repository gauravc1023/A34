import java.util.Scanner;

class BloodDonationIfElseIf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Age: ");
        int age = sc.nextInt();

        System.out.print("Enter Weight: ");
        int weight = sc.nextInt();
        sc.nextLine();

        System.out.print("Consumption Alcohol/Cigarette in last 24 hrs? (yes/no): ");
        String consumption = sc.nextLine();

        if(age >= 20 && weight > 50 && consumption.equalsIgnoreCase("no")){
            System.out.println("You are eligible to donate blood.");
        } else {
            System.out.println("You are NOT eligible to donate blood.");
        }
    }
}
