import java.util.Scanner;
class Pattern5
{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number: ");
		int n=sc.nextInt();

		for(int i=0; i<n; i++){
			for(int j=0; j<n-i-1; j++){
				System.out.print("  ");
			}
			for(int j=0; j<n; j++){
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
/*
        * * * * *
      * * * * *
    * * * * *
  * * * * *
* * * * *

*/