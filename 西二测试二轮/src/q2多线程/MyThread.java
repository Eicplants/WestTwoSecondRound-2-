package q2���߳�;

public class MyThread extends Thread{
//ÿ���̼߳���֮��
	public long sum;
	//Ҫ���������
	
	//��ʼ����Ľű�
	long start;
	//��������һ���ű�
	long end;
	int aim;//Ŀ������
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
