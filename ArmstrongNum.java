import java.util.Scanner;
class ArmstrongNum{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number : ");
		
		for(int a=1; a<=100000; a++){
			int num = a , len = 0 , sum = 0;
		
		for(int i = num; i!=0; i/=10)
			len++;
		
		for(int i=num; i!=0 ; i/=10){
			int pow = 1;
			for(int j=1; j<=len ; j++) pow*=(i%10);
			sum +=pow;
		}
		if(sum==num)
			System.out.print(num+ "  ");


		}		
	}
}


