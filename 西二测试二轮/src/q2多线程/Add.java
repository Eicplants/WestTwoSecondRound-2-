package q2���߳�;

import java.util.ArrayList;
import java.util.Scanner;

public class Add {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
      
	  long nums=1000000000;  
      Scanner input=new Scanner(System.in);
      System.out.println("�밴�գ�1��Ŀ���� 2���̸߳���,��˳��(�߳�Խ�࣬�õ�������ٶ�Խ��)(̫�󲻺ã�������6~1000��)�������룡");
      int aim=input.nextInt();//ĳ��һλ��
      int count=input.nextInt();
      //����ÿ���߳�Ҫ�������ֵĸ���
      long numcount =nums/count;
      //����һ�������������̶߳���
      ArrayList<MyThread> list=new ArrayList<>();
      long a=System.currentTimeMillis();
      //ѭ����������̼߳�������֮��
      for(int i=0;i<count;i++) {//i��ʾ��i���߳�
    	  MyThread m1=null;
    	  if(i!=count-1) {
    		  m1=new MyThread(i*numcount,(i+1)*numcount,aim);
    	  }else {//�����߳�Ϊ���һ���߳�ʱ,��ֹ�����������
    		  m1=new MyThread(i*numcount,nums,aim);
    	  }
    	 //�����߳�
    	  m1.start();
    	  list.add(m1);
      }

      //��������̺߳ϲ������̵߳���
      for(int i=0;i<list.size();i++) {
		  list.get(i).join();
	  }
      
      //���߳��м����������ĺ�
      long total=0;
     
      for(int i=0;i<list.size();i++) {
    	  total=total+list.get(i).sum;
      }
      long b=System.currentTimeMillis();
      System.out.println(b-a);
      System.out.println("1000000000�������к�"+aim+"������������ӵĽ��Ϊ�� "+total);
	}

}
