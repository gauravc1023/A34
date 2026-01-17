import java.util.Scanner;

class FactorialsMethod{
	static int num ;
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number : ");
		num = sc.nextInt();
		factorials();
	}
	public static void factorials(){
		Long tot = 1L;
		for(int i = 1; i<=num ; i++){
			tot *= i ;
		}
		System.out.println(tot);
	}
}