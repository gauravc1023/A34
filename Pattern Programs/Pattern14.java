class Pattern14{
    public static void main(String[] args) {
        int n = 5;
	int num1 = 1, num2 = 97;
	for(int i=1; i<n; i++){
		for(int j=1;j<n;j++){
			if(i%2==0){
				System.out.print((char)num2+" ");
				num2++;
			}else{
				System.out.print(num1+" ");
				num1++;
			}
		}
		System.out.println();
	}
    }
}

/*

1 2 3 4
a b c d
5 6 7 8
e f g h

*/