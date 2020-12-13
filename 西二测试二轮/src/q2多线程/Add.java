package q2多线程;

import java.util.ArrayList;
import java.util.Scanner;

public class Add {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
      
	  long nums=1000000000;  
      Scanner input=new Scanner(System.in);
      System.out.println("请按照：1、目标数 2、线程个数,的顺序(线程越多，得到结果的速度越快)(太大不好，建议在6~1000内)，来输入！");
      int aim=input.nextInt();//某个一位数
      int count=input.nextInt();
      //计算每个线程要计算数字的个数
      long numcount =nums/count;
      //声明一个集合来储存线程对象
      ArrayList<MyThread> list=new ArrayList<>();
      long a=System.currentTimeMillis();
      //循环创建多个线程计算数字之和
      for(int i=0;i<count;i++) {//i表示第i个线程
    	  MyThread m1=null;
    	  if(i!=count-1) {
    		  m1=new MyThread(i*numcount,(i+1)*numcount,aim);
    	  }else {//当该线程为最后一个线程时,防止除不尽的情况
    		  m1=new MyThread(i*numcount,nums,aim);
    	  }
    	 //启动线程
    	  m1.start();
    	  list.add(m1);
      }

      //将计算的线程合并到主线程当中
      for(int i=0;i<list.size();i++) {
		  list.get(i).join();
	  }
      
      //主线程中计算所有数的和
      long total=0;
     
      for(int i=0;i<list.size();i++) {
    	  total=total+list.get(i).sum;
      }
      long b=System.currentTimeMillis();
      System.out.println(b-a);
      System.out.println("1000000000以内所有含"+aim+"的正整数数相加的结果为： "+total);
	}

}
