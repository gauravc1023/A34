import java.util.Scanner;

class DrivingLicenceIfElseIf{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Age: ");
        int age = sc.nextInt();

        System.out.print("Enter RTO Test Marks: ");
        int marks = sc.nextInt();

        if(age >= 18 && marks > 60){
            System.out.println("Eligible for Driving Licence.");
        } else {
            System.out.println("NOT eligible, must reappear for test.");
        }
    }
}
