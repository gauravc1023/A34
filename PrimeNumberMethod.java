import java.util.Scanner;

class PrimeNumberMethod{
	static int num ;
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number : ");
		num = sc.nextInt();
		isPrimeNumber();
	}
	public static void isPrimeNumber(){
		if(num<2){
			System.out.println(num + " not Prime");
		}
		else{
			if((num%2==0 || num%3==0 || num%5==0 || num%7==0)){
				if(num==2 || num==3 || num==5 || num==7)
					System.out.println(num + " is prime");
				else
					System.out.println(num + " not Prime");
			}else{
				System.out.println(num+" is Prime");
			}
		}
	}
}