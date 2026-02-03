class DiamondOptimize{
	public static void main(String [] args){
		int n=15, star=1, space=n/2;
		for(int i=0; i<n; i++){
			for(int j=0; j<space; j++){
				System.out.print("* ");
			}
			for(int j=1; j<star; j++){
				System.out.print("  ");
			}
			for(int j=0; j<space; j++){
				System.out.print("* ");
			}

			System.out.println();
		
			if(i<n/2){
				star+=2;
				space--;
			}else{
				star-=2;
				space++;
			}	
		}	
	}
}
/*
* * * * * * * * * * * * * *
* * * * * *     * * * * * *
* * * * *         * * * * *
* * * *             * * * *
* * *                 * * *
* *                     * *
*                         *

*                         *
* *                     * *
* * *                 * * *
* * * *             * * * *
* * * * *         * * * * *
* * * * * *     * * * * * *
* * * * * * * * * * * * * *
*/