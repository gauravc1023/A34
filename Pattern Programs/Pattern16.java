class Pattern16{
	public static void main(String [] args){
		int n=5, num=1;
		for(int i= 1; i<n; i++){
			for(int j=1; j<n; j++){
				System.out.print(num+" ");
				if(j==n-1) num++;
				else if(i%2==0) num+=2;
				else num+=2;
						
			}
			System.out.println();
		}
	}
}

/*

1 3 5 7
8 10 12 14
15 17 19 21
22 24 26 28

*/