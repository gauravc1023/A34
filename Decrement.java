class Decrement{
	public static void main(String [] args){
		int poc = 100; //83
		System.out.println(--poc); //99
		System.out.println(--poc); //98
		System.out.println(poc--); //98
		System.out.println(poc--); //97
		System.out.println(--poc); //95
		System.out.println(--poc); //94
		System.out.println(poc--); //94
		System.out.println(poc); //93
		System.out.println(--poc + poc--); //92 + 92= 184
		System.out.println(poc-- + --poc ); //91 + 89 = 180
		System.out.println(--poc + poc--); //88 + 88 = 176
		System.out.println(--poc + --poc); //86 + 85  = 171
		System.out.println(poc-- + poc--); //85 + 84 = 169
	}
}