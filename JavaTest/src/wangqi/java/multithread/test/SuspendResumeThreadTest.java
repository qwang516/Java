package wangqi.java.multithread.test;

/**
 * test suspend and resume a thread
 * 
 * @author wangqi5
 *
 */
public class SuspendResumeThreadTest {
	class MyThread extends Thread {
		private int num = 0;

		public int getNum() {
			return num;
		}

		public void setNum(int num) {
			this.num = num;
		}

		@Override
		public void run() {
			while (true) {
				num++;
			}
		}
	}

	public static void main(String[] args) {
		/**
		 * create a outer class to initialize the inner class
		 */
		SuspendResumeThreadTest suspendResumeThreadTest = new SuspendResumeThreadTest();
		MyThread myThread = suspendResumeThreadTest.new MyThread();
		myThread.start();
		try {
			Thread.sleep(2000);
			myThread.suspend();
			System.out.println("time=" + System.currentTimeMillis() + "num: " + myThread.getNum());
			Thread.sleep(2000);
			System.out.println("time=" + System.currentTimeMillis() + "num: " + myThread.getNum());

			myThread.resume();
			Thread.sleep(2000);
			System.out.println("time=" + System.currentTimeMillis() + "num: " + myThread.getNum());
			Thread.sleep(2000);
			System.out.println("time=" + System.currentTimeMillis() + "num: " + myThread.getNum());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
