package demo.part1.countPriority;

/**
 * <p>ClassName: MyThread</p>
 * Description:加点描述<br/>
 * @date 2018年8月10日 上午9:30:59 
 * @author wangrenzong@cloudwalk.cn
 * @version 1.0
 * @since JDK 1.7
 */ 
public class MyThread extends Thread {
	private int i=0;
	
	@Override
	public void run() {
		try {
			while(true){
				i++;
				System.out.println("i="+(i));
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
