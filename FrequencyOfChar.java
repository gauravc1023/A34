class FrequencyOfChar{
	public static void main(String [] args){
		String str = "hello my name is gaurav chaudhari";
		System.out.println(str);
		
		for(char i='a'; i<='z'; i++){
			int cnt = 0;
			for(int j=0; j<str.length();j++)
			{
				if(i==str.charAt(j)) cnt++;
			}
			if(cnt>0)
				System.out.println(i+" : "+ cnt);

/*			if(cnt=1)
				System.out.println(i);	//unique
		
			if(cnt>1)
				System.out.println(i);  // Duplicate
		
			if(cnt>0)
				System.out.println(i);  // Distinct
*/
		}
	}		
}