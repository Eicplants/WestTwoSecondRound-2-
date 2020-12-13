package q2多线程;

public class MyThread extends Thread{
//每个线程计算之和
	public long sum;
	//要计算的数组
	
	//开始计算的脚标
	long start;
	//计算的最后一个脚标
	long end;
	int aim;//目标数字
	public MyThread(long start, long end,int aim) {
		
		this.start=start;
		this.end=end;
		this.aim=aim;
	}
	
	
	public void run() {
		for(long i=start;i<end;i++) {
			 if(contain(i,aim)) {
				sum=sum+i;
			 }
			
		}
	}
	
	
	private static boolean contain(long num,int x) {
		return String.valueOf(num).contains(String.valueOf(x));
	}
}
