package q1FriedChicken;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		West2FriedChickenRestaurant a1=new West2FriedChickenRestaurant();//new一次购买
	    //遍历套餐List看元素是否正确
		for(int i=0;i<West2FriedChickenRestaurant.SetList.size();i++) {
	    	System.out.println(West2FriedChickenRestaurant.SetList.get(i));
	    }
		//批量购买
		a1.BatchPurchase(West2FriedChickenRestaurant.SetList.get(1).getDrink(), 2);//类名访问static
		a1.BatchPurchase(West2FriedChickenRestaurant.SetList.get(0).getDrink(), 2);
		a1.BatchPurchase(West2FriedChickenRestaurant.SetList.get(2).getDrink(), 1);
		//a1.BatchPurchase(West2FriedChickenRestaurant.SetList.get(2).getDrink(), 100); //若再买套餐二中的饮料100个则报错“余额不足”
		//System.out.println(West2FriedChickenRestaurant.SetList.get(1));//检测，自动调用toString方法
		//以套餐1中的饮料为例，检测批量购买之后是否在饮料list中新增元素
		 System.out.println();
		System.out.println("对于果汁的进货后和购买后检测......................................................");
		for(int i=0;i<a1.JuiceList.size();i++) {
	    	System.out.println(a1.JuiceList.get(i));
	    }
	    a1.SellPackage(West2FriedChickenRestaurant.SetList.get(0));//购买含果汁的套餐
	    //遍历JuiceList查看是否消除套餐1中的饮料，消除个数为1
	    for(int i=0;i<a1.JuiceList.size();i++) {
	    	System.out.println(a1.JuiceList.get(i));
	    }
	    System.out.println();
	    System.out.println("对于啤酒的进货后和购买后检测.....................................................");
	    for(int i=0;i<a1.BeerList.size();i++) {
	    	System.out.println(a1.BeerList.get(i));
	    }
	    a1.SellPackage(West2FriedChickenRestaurant.SetList.get(1));//购买含啤酒的套餐
	    for(int i=0;i<a1.BeerList.size();i++) {
	    	System.out.println(a1.BeerList.get(i));
	    }
	    //购买两个套餐3则提示售罄
	    a1.SellPackage(West2FriedChickenRestaurant.SetList.get(2));
	    a1.SellPackage(West2FriedChickenRestaurant.SetList.get(2));
	  
	}


}
