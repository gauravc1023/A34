import java.util.Scanner;

class IfExample{
	public static void main(String [] args){
		System.out.println("starts");
		System.out.println("CAPGEMINI");
		System.out.println("Did u filled the form : ");
		String response = new Scanner(System.in).next();
		if(response.equals("YES")){
			System.out.println("U WILL RECEIVE NEXT ROUND MAIL");
	
		}
		System.out.println("ends");


	}
}