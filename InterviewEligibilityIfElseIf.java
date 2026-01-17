import java.util.Scanner;

class InterviewEligibilityIfElseIf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Percentage: ");
        int percent = sc.nextInt();

        if(percent > 60){
            System.out.println("You are eligible for interview.");
        } else {
            System.out.println("You are NOT eligible for interview.");
        }
    }
}
