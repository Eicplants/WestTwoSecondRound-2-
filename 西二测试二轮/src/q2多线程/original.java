package q2多线程;

import java.util.Scanner;

public class original {
  public static void main(String  []args) {
	  long a=System.currentTimeMillis();
	  long ans =0;
	  Scanner scanner=new Scanner(System.in);
	  int x=scanner.nextInt();
	  for(long i=1;i<1000000000;i++) {
		  if(contain(i,x)) ans+=i;
	  }
	  long b=System.currentTimeMillis();
	  System.out.println("运行时间为： "+(b-a));
	  System.out.print(ans);
  }
private static boolean contain(long num, int x) {
	return String.valueOf(num).contains(String.valueOf(x));
}
}

