import java.util.Scanner;
class PrimeNumber{
		public static void main(String [] args){
			System.out.print("Enter a number : ");
			int num = new Scanner(System.in).nextInt();
			
			String op=
				(num<2)?
				(num + " not Prime"):
				((num%2==0 || num%3==0 || num%5==0 || num%7==0)?
					((num==2 || num==3 || num==5 || num==7)?
						(num + " is prime"):
						(num + " not Prime")):
					(num+" is Prime"));
				System.out.println(op);	
		}
}		