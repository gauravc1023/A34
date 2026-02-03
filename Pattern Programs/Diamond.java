import java.util.Scanner;
class Diamond
{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number: ");
		int n=sc.nextInt();

		for(int i=0; i<n; i++){
			for(int space=0; space<n-i-1; space++){
				System.out.print(" ");
			}
			for(int star=1; star<=i+1; star++){
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int i=n-2; i>=0; i--){
			for(int space=0; space<n-i-1; space++){
				System.out.print(" ");
			}
			for(int star=1; star<=i+1; star++){
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
/*
    *
   * *
  * * *
 * * * *
* * * * *
 * * * *
  * * *
   * *
    *
*/