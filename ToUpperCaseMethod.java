import java.util.Scanner;
class ToUpperCaseMethod{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a String : ");
		String str = sc.next();

		toUpperCase(str);
	}
	public static void toUpperCase(String str){
		String output = "";
		for(int  i = 0; i<str.length(); i++){
			char ch = str.charAt(i);
			if(ch>=97 && ch<=122){
				output += (char)(ch-32);
			}else{
				output += ch;
			}
		}
		System.out.println(str);
		System.out.println("UpperCase :" + output);
	}
	
}