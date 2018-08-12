package demo.part1.countPriority;

public class MyThreadTest {
	public static void main(String[] args) {
		MyThread thrad=new MyThread();
		thrad.setDaemon(true);
		thrad.start();
//			Thread.sleep(5000);
		Thread.yield();
		System.out.println("停止了");
	}
}
