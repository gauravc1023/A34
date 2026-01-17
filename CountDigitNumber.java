class PrintDigitInNumber{
	public static void main(String [] args){
		int num ;
		for(num = 1234; num >0 ; num/=10)
		{
			int last = num%10;
			
			System.out.println(last);
				
		}		
	}
}