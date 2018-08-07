package demo.part1.test;

/**
 * <p>ClassName: Test</p>
 * Description:加点描述<br/>
 * @date 2018年8月7日 下午6:09:50 
 * @author wangrenzong@cloudwalk.cn
 * @version 1.0
 * @since JDK 1.7
 */ 
public class Test {
	public static void main(String[] args) {
		try {
			MyThread myThread=new MyThread();
			myThread.setName("myThread");
			myThread.start();
			for(int i=0;i<10;i++){
				int time=(int) (Math.random()*1000);
				Thread.sleep(time);
				System.out.println("main="+Thread.currentThread().getName());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
