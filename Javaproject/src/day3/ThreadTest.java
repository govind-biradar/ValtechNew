package day3;

public class ThreadTest {
	
	public static class PrinterThread extends Thread {
		
		@Override
		public void run() {
			for (int i = 0; i < 10; i++) {
				System.out.println(Thread.currentThread()+""+i);
				
			}
		}
		
	}
	public static class PrintThreadByInterface implements Runnable {
		@Override
		public void run() {
			for (int i = 0; i < 10; i++) {
				System.out.println(Thread.currentThread()+""+i);
				
			}
			
		}
		
	}
	public static void main(String[] args) {
		Thread t1 = new PrinterThread();
		Thread t2 = new PrinterThread();
		t1.start();
		t2.start();
		new Thread(new PrintThreadByInterface()).start();
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				for (int i = 0; i < 10; i++) {
					System.out.println(Thread.currentThread()+""+i);
					
				}
			}
		}).start();
		
		for (int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread()+""+i);
			
		}
		
		
	}

}
