package q1FriedChicken;

public class SetMeal {
  private String SetMealName;;
  private double SetPrice;;
  private String ChickenName;
  private Drinks drink;
//  String ChickenName2="炸全鸡";
//  String ChickenName3="蜜汁炸鸡";
//  Drinks juice1=new Juice("橙汁",5,"2020-11-20",2);
//  Drinks juice2=new Juice("苹果汁",5,"2020-11-20",2);
//  Drinks juice3=new Juice("酸梅汁",5,"2020-11-20",2);
//  Drinks Beer1=new Beer("雪津啤酒",4,"2020-11-20",30,4);
  public SetMeal(String SetMealName,double SetPrice,String ChickenName,Drinks drink) {
	  this.SetMealName=SetMealName;
	  this.SetPrice=SetPrice;
	  this.ChickenName=ChickenName;
	  this.drink=drink;
  }
	public String toString() {	  
		return("套餐名 "+SetMealName+" 套餐价格："+SetPrice+" 炸鸡名: "+ChickenName+" 饮料信息： "+drink.toString());
	}
	
	//setMeal类中的getter和setter（用于取得套餐内元素的名称以及价格）
	public String getSetMealName() {
		return SetMealName;
	}
	public void setSetMealName(String setMealName) {
		SetMealName = setMealName;
	}
	public double getSetPrice() {
		return SetPrice;
	}
	public void setSetPrice(double setPrice) {
		SetPrice = setPrice;
	}
	public String getChickenName() {
		return ChickenName;
	}
	public void setChickenName(String chickenName) {
		ChickenName = chickenName;
	}
	public Drinks getDrink() {
		return drink;
	}
	public void setDrink(Drinks drink) {
		this.drink = drink;
	}
	
	
}
