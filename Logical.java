class Logical{
	public static void main(String [] args){
		System.out.println(true && true);  //true 
		System.out.println(true || true);  //true
		System.out.println(false && true); //false
		System.out.println(!true);     //false
		System.out.println(true || false); //true
		System.out.println(10>20 || 5!=10);  //true
		System.out.println(('a' + 'b')%2 != 0 || false); //true
		System.out.println( 'a' != 97 && !false); //false
		System.out.println(!!false); //false


	
	}
}