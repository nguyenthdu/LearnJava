package thread;

public class MyThread implements Runnable{
	public static void main(String[] args) {
		Thread t = new Thread(new MyThread());
		t.start();
	}
	
	
	@Override
	public void run() {
		System.out.println("Thread is running");
	}
}
