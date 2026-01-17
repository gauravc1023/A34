class Demo{
	static String str = "VAR CLASS BLOCK";
	static{
		System.out.println("static block");
	}
	public static void myMethod(){
		System.out.println("static Method");
	}
	static class InnerClass{
		static String str1 = "Inner class static var";
	}
}
class StaticExample{
	public static void main(String [] args){
		System.out.println(Demo.str);
		Demo.myMethod();
		System.out.println(Demo.InnerClass.str1);
	}
}