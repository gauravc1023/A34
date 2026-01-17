class SwitchExample{
	public static void main(String [] args){
		System.out.println("Enter a character : ");
		char ch = new java.util.Scanner(System.in).next().charAt(0);

		//vowel or consonant

		switch(ch){
			case 'A','E','I','O','U' : System.out.println(ch + " is a VOWEL"); break;
		
			default : System.out.println(ch + " is a CONSONENT "); 
		}
	}
}