import java.util.Scanner;
class LadderExample{
		public static void main(String [] args){
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter marks: ");
			
			int marks =sc.nextInt();
			
			if(marks<0 || marks>500){
				System.out.println("Invalid Marks");
			}else{
				int percent =(marks/500)*100;
			}
				
			marks = (marks/500)*100;
			if(marks>=0 && marks<=34){
				System.out.println("You are Failed");
			}
			else if(marks>=35 && marks<=50){
				System.out.println("Second Class");
			}
			else if(marks>=51 && marks<60){
				System.out.println("Higher Second Class");
			}
			else if(marks>=61 && marks<=75){
				System.out.println("First Class");
			}
			else if(marks>=76 && marks<=90){
				System.out.println("First Class With Distinction");
			}
			else if(marks>=91 && marks<=100){
				System.out.println("You are Failed");
			}
			


	}
}