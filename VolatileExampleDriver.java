class SharedResource{
	volatile static int num = 0;
}
class Gaurav extends Thread{
	@Override
	public void run(){
		try{
			Thread.sleep(100);
		}catch(Exception e){
			System.out.println("exception occured");
		}
		SharedResource.num = 5;
		System.out.println("Gaurav Thread : " + SharedResource.num);
	}
}
class Vaibhav extends Thread{
	@Override
	public void run(){
		while(SharedResource.num == 0){
		}
	System.out.println("Vaibhav Thread : " + SharedResource.num);
	}
}
class VolatileExampleDriver{
	public static void main(String [] args){
		Gaurav gaurav = new Gaurav();
		Vaibhav vaibhav = new Vaibhav();

		gaurav.start();
		vaibhav.start();
	}
}

