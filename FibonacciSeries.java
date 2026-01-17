import java.util.Scanner;

class FibonacciSeries{
	public static void main(String [] args){
		int first = 0, second = 1, next;

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of terms : ");
		int n = sc.nextInt();
		
		for(int i = 1; i<=n ; i++){
			System.out.print(first +" ");
					
			next = first + second;
			first = second; 
			second = next;	
			
		}
	}
}