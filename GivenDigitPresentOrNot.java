import java.util.Scanner;

public class GivenDigitPresentOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        System.out.print("Enter a digit to check: ");
        int digit = sc.nextInt();

        boolean found = false;
        int num = number;

        while (num > 0) {
            int currentDigit = num % 10;  
            if (currentDigit == digit) {
                found = true;
                break;
            }
            num /= 10;  
        }

        if (found) {
            System.out.println( digit + " is present in " + number);
        } else {
            System.out.println( digit + " is NOT present in " + number);
        }

        
    }
}

