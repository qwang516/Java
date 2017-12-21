package wangqi.java.multithread.test;

/**
 * use return to stop a thread
 * 
 * @author wangqi5
 *
 */
public class StopThreadTest {
	public static void main(String[] args) {
		Thread thread = new Thread() {
			@Override
			public void run() {
				while (true) {
					if (this.isInterrupted()) {
						System.out.println("It is STOPPED!");
						return;
					}
					System.out.println("time=" + System.currentTimeMillis());
				}
			}
		};
		thread.start();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		thread.interrupt();

	}
}
