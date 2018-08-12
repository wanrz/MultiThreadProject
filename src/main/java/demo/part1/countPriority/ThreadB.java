package demo.part1.countPriority;

public class ThreadB extends Thread {
	private int count=0;
	
	@Override
	public void run() {
		while(true){
			count++;
		}
	}
	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
	
}
