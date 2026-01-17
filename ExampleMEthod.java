import java.util.Scanner;
class ExampleMEthod{
	public static void main(String [] args){
		personalInformation();
	}
	public static void personalInformation(){
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your name :");
		String name = sc.nextLine();	

		System.out.println("Native Place : ");
		String nativePlace = sc.nextLine();

		System.out.println("Contact : ");
		Long contact = sc.nextLong();

		sc.nextLine();
		System.out.println("Education : ");
		String education = sc.nextLine();

		System.out.println("CGPA : ");
		double cgpa = sc.nextDouble();

		System.out.println("YOP : ");
		int yop = sc.nextInt();

		System.out.println("***** PERSONAL INFORMATION *****");
		System.out.println("Name : " + name);
		System.out.println("Contact : " + contact);
		System.out.println("Education : "+education);
		System.out.println("Native Place : "+ nativePlace);
		System.out.println("CGPA : "+ cgpa);
		System.out.println("YOP : " + yop);
	}
}