import java.util.Scanner;

class Calculator{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a Operand 1 :");
		double op1 = sc.nextDouble();
		
		System.out.print("Enter an Operator : ");
		char opr = sc.next().charAt(0);

		System.out.print("Enter a Operand 2 : ");
		double op2 = sc.nextDouble();

		boolean assump = true;

		double output = 0;
		
		if(opr == '+'){
			output = op1 + op2;
		}else if(opr == '-'){
			output = op1 - op2;
		}else if(opr == '*'){
			output = op1 * op2;
		}else if(opr == '/'){
			output = op1 / op2;
		}else if(opr == '%'){
			output = op1 % op2;
		}else{
			System.out.println("INVALID OPERATOR ");
			assump = false;
		}
	
		if(assump){
			//System.out.println(op1 +" "+opr+" "+op2+ " =" + output);
			System.out.printf("%n%.2f %c %.2f = %.3f %n ", op1,opr,op2,output);

		}

	}
}