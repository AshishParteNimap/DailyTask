package excersize;

public class MultithreadingEx {

	public static void main(String[] args) {
		TestingThread t1=new TestingThread("Therad1Running");
		t1.start();
		TestingThread t2=new TestingThread("thread2Running");
		t2.start();

	}
}

//implementing Runnable interface 
class TestingThread implements Runnable{
	
	Thread newThread;
	private String threadName;
	
	TestingThread(String name){
		threadName=name;
	}
	
	@Override
	public void run() {
		System.out.println("thread name is :"+threadName);
		for(int i=0;i<5;i++)
			System.out.println(i);
		System.out.println(threadName);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
			
		}
		

    public void start() {
	
	System.out.println("Thread started");
	if(newThread==null) {
		newThread=new Thread(this,threadName);
		newThread.start();
	System.out.println(newThread.getState());
	}
    }
}



