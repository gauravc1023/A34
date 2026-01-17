//Byte-> Short -> int -> long -> float -> double -> Boolean
//		char

class Widening{
	public static void main(String [] args){
		int ch = 'A';
		System.out.println(ch);
		int i = ch;
		long l = ch;
		float f = ch;
		double d = ch;
		

		double d2 = 234.2345f;
		System.out.println(d2);

		float f1 = 'z';
		System.out.println(f1);
	
		long l1 = 2132134;
		System.out.println(l1);
		
		long l2 = 234234;
		System.out.println(l2);
	}
}