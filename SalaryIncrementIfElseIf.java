import java.util.Scanner;

class SalaryIncrementIfElseIf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Salary: ");
        double salary = sc.nextDouble();

        System.out.print("Enter Target Score: ");
        int score = sc.nextInt();

        if(score > 90){
            salary = salary + (salary * 0.03);
        } else {
            salary = salary + (salary * 0.01);
        }

        System.out.println("Updated Salary = " + salary);
    }
}
