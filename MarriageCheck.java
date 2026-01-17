import java.util.Scanner;

class MarriageCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Age: ");
        int age = sc.nextInt();

        System.out.print("Enter Property Value: ");
        long property = sc.nextLong();
        sc.nextLine(); // consume extra line

        System.out.print("Enter Surname: ");
        String surname = sc.nextLine();

        if(age >= 21 && (property > 10000000 || surname.equalsIgnoreCase("Ambani"))){
            System.out.println("You is eligible for marriage.");
        } else {
            System.out.println("You is NOT eligible for marriage.");
        }
    }
}
