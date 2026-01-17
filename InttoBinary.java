import java.util.Scanner;
class InttoBinary
{
	public static void main(String [] args){
		int num = new Scanner(System.in).nextInt();
		String binary = Integer.toBinaryString(num);
		System.out.println(num + " : "+ binary);
	}
}