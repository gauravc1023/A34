import java.util.Scanner;
class PrimeNumberIfElse{
		public static void main(String [] args){
			System.out.print("Enter a number : ");
			int num = new Scanner(System.in).nextInt();
			
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