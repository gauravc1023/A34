class Pattern18{
	public static void main(String [] args){
		int n=4;
		for(int i=1; i<=n; i++){
			for(int j=1; j<=n; j++){
				if(j==1){
					System.out.print(i+" ");
				}
				else if(j==2){
					System.out.print((2*n+1-i)+" ");
				}
				else if(j==3){
					System.out.print((2*n+i)+" ");
				}
				else{
					System.out.print((4*n+1-i)+" ");
				}
			}
			System.out.println();
		}
	}
}

/*
1 8 9  16
2 7 10 15
3 6 11 14
4 5 12 13
*/