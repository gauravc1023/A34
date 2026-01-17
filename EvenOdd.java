import java.util.Scanner;
class EvenOdd{
	public static void main(String [] args){
		System.out.print("Enter a number : ");
		
		int num = new java.util.Scanner(System.in).nextInt();
		System.out.println("By First Approach");

		if(num%2 == 0){
			System.out.println(num + " is Even.");		
		}
		if(num%2 != 0){
			System.out.println(num + " is Odd.");
		}


		System.out.println("By Second Approach");
		if(num/2 == num/2.0){
			System.out.println(num + " is Even.");
		}
		if(num/2 != num/2.0){
			System.out.println(num +" is Odd.");
		}
                                                                                                                                                                                                                                                                                                                                    
		
		System.out.println("By Third Approach");
		if((num/2)*2==num){
		System.out.println(num + " is Even");
		}
		if((num/2)*2 != num){
		System.out.println(num + " is Odd");

		}

	}
}
