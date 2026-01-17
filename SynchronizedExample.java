class SynchronizedExample {
    public static void main(String[] args) {
        Task task = new Task(); //object creation statement
        MyThread ramesh = new MyThread(task);
        ramesh.start(); 
        task.printNumbers("main");
    }
}
class MyThread extends Thread {
    Task task ;
    MyThread(Task task){
        this.task = task;
    }
    @Override
    public void run(){
        Thread.currentThread().setName("ramesh");
        task.printNumbers("ramesh");
    }
}

//Synchronization
class Task{
    public synchronized void printNumbers(String threadName){
        for(int i = 1; i<=10 ; i++){
            System.out.println(threadName + " : " + i);
        }
    }
}
class Task1{
    public  void printNumbers(String threadName){
        for(int i = 1; i<=10 ; i++){
            System.out.println(threadName + " : " + i);
        }
    }
}