import java.util.Scanner;
class LadderExample{
		public static void main(String [] args){
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter marks: ");
			
			int marks =sc.nextInt ();
			int percent = -1;
			if(marks<0 || marks>500){
				System.out.println("Invalid Marks");
			}else{
				percent=marks/5;
				System.out.println(percent);
			}
			
			if(percent>90 && percent<=100){
				System.out.println("Outstanding");
			}
			else if(percent>75 && percent<=90){
				System.out.println("First Class With Distinction");
			}
			else if(percent>60 && percent<=75){
				System.out.println("First Class");
			}
			else if(percent>50 && percent<=60){
				System.out.println("Higher Second Class");
			}
			else if(percent>34 && percent<=50){
				System.out.println("Second Class");
			}
			else if(percent>0 && percent<=34){
				System.out.println("You are Failed");
			}
			


	}
}