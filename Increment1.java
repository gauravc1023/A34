class Increment1{
	public static void main(String [] args){
		int l=3, m=7, o=-15, p;
		
		p = l + m-- * 3;
		l = l++;
		    m--;
  	    	    o++;
		o = +o++;

		System.out.println(l);
		System.out.println(m);
		System.out.println(p);
		System.out.println(o);



	}
}