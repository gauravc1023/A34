strictfp class Driver{
	public static void main(String [] args){
		double num1 = 22;
		double num2 = 7;
		double output = pi(num1, num2);

		System.out.println(output);
	}
	
	public static strictfp double pi(double num1 , double num2){
		double pi = num1 / num2 ;
		return pi;
	}
}