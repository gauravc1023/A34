class FrequencyOfDigit{
	public static void main(String [] args){
		Long num = 564354646L;
		System.out.println(num);
	
		for(int i = 0 ; i<=9 ; i++){
			int cnt = 0;
			for(Long j = num; j!=0; j/=10){
				if(i==j%10) cnt++;
			}
			if(cnt>0){
				System.out.println(i + " : "+ cnt);  //frequency
			}


			//if(cnt==1){
			//	System.out.print("Unique Number is : ");
			//	System.out.println(i + " \n" ); //Unique
			//}
			//if(cnt>1){
			//	System.out.print(i + " "); //Duplicate
			//}


		}
	
	}
}


/*
			if(cnt==1){
				System.out.println(i + " " ); //Unique
			}
			if(cnt>1){
				System.out.println(i + " "); //Duplicate
			}
			if(cnt>0){
				System.out.println(i + " " );  //Distinct
			}
			*/