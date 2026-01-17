class Qspiders{
	public static void main(String [] args){
		String institute = "QSPIDERS";
		short students = 1200;  
		short javaFullStack = 750;
		short pythonFullStack = (short)(students-javaFullStack);
		short testing = 375;
		short chairs = 2000;
		byte trainers = 17;
		short placedCandidate = 1200;

		System.out.println("Institute Name :" + institute);
		System.out.println("No. of Students in Java Full Stack :" + javaFullStack);
		System.out.println("No. of Students in Python Full Stack :" + pythonFullStack);
		System.out.println("No. of Students in Testing :" + testing);
		System.out.println("No. of Chairs :" + chairs);
		System.out.println("No. of Trainers :" + trainers);
	}	
}