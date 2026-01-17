class DecimalToBinary{
	public static void main(String [] args){
		for(int i=0;i<128;i++){
			int num = i;
			String binary = Integer.toBinaryString(num);
			System.out.println(num+" : "+binary);
		}
	}
}