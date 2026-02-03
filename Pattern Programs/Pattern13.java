class Pattern13
{
	public static void main(String [] args){
		int n=5; 
		int num = 97;
		for(int i=1; i<n; i++){
			for(int j=1;j<n ;j++){
				System.out.print((char)num+" ");
				num++;
			}
			System.out.println();
		}
	}
}


/*

a b c d
e f g h
i j k l
m n o p

*/