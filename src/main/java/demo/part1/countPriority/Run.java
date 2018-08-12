package demo.part1.countPriority;

public class Run {
	public static void main(String[] args) {
		try {
			System.out.println(Thread.NORM_PRIORITY);
			
			ThreadA a=new ThreadA();
			a.setPriority(Thread.NORM_PRIORITY-3);
			a.start();
			
			
			ThreadB b=new ThreadB();
			b.setPriority(Thread.NORM_PRIORITY+3);
			b.start();
		
			Thread.sleep(2000);
			a.stop();
			b.stop();
			
			
			System.out.println("a="+a.getCount());
			System.out.println("b="+b.getCount());
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
