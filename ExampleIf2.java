import java.util.Scanner;
class ExampleIf2{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int num = sc.nextInt();

		if(num%5==0 && num%2!=0){
			System.out.println("HiFive");	
		}
		if(num%2==0 && num%5!=0){
			System.out.println("HiTwo");
		}	
		if(num%2==0 && num%5==0){
			System.out.println("HiFiveHiTwo");
		}


//2		System.out.println("By 'Return' Approach ");
		if(num%5==0 && num%2==0){
			System.out.println("HiFiveHiTwo");
			return ;
		}				
		if(num%2==0){
			System.out.println("HiTwo");
		}
		if(num%5==0){
			System.out.println("HiFive");
		}						
	}
}