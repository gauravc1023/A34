class Increment{
	public static void main(String [] args){
		int poc = 100; //113
		System.out.println(++poc); //101
		System.out.println(++poc); //102
		System.out.println(++poc); //103
		System.out.println(poc++); //103
		System.out.println(poc++); //104
		System.out.println(poc++); //105
		System.out.println(++poc); //107
		System.out.println(poc);
		System.out.println(poc++ + ++poc); //107 + 109 =216
		System.out.println(poc++ + poc++); //109 + 110 =219
		System.out.println(++poc + ++poc); //112 +113  =225
}				      

}