package q1FriedChicken;

public class SetMeal {
  private String SetMealName;;
  private double SetPrice;;
  private String ChickenName;
  private Drinks drink;
//  String ChickenName2="ըȫ��";
//  String ChickenName3="��֭ը��";
//  Drinks juice1=new Juice("��֭",5,"2020-11-20",2);
//  Drinks juice2=new Juice("ƻ��֭",5,"2020-11-20",2);
//  Drinks juice3=new Juice("��÷֭",5,"2020-11-20",2);
//  Drinks Beer1=new Beer("ѩ��ơ��",4,"2020-11-20",30,4);
  public SetMeal(String SetMealName,double SetPrice,String ChickenName,Drinks drink) {
	  this.SetMealName=SetMealName;
	  this.SetPrice=SetPrice;
	  this.ChickenName=ChickenName;
	  this.drink=drink;
  }
	public String toString() {	  
		return("�ײ��� "+SetMealName+" �ײͼ۸�"+SetPrice+" ը����: "+ChickenName+" ������Ϣ�� "+drink.toString());
	}
	
	//setMeal���е�getter��setter������ȡ���ײ���Ԫ�ص������Լ��۸�
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
