import java.util.Scanner;
class NumIsPrime{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);	
		System.out.print("Enter a Number : ");
		int num = sc.nextInt();
		int cnt = 0;
		for(int i = 1; i<=num; i++)
		{
			if(num%i == 0){
				cnt++;
			}
		}
		if(cnt == 2){
			System.out.println(num + " is Prime");
		}else{
			System.out.println(num + " is Not Prime");
		}
	}
}