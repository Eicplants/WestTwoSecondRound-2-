package q1FriedChicken;

public class Beer extends Drinks {
private float AlcoholDegree;//酒精度数
    
	public Beer(String name, double cost, String InputProduceDate, int ExpirationDay,float AlcoholDegree) {
	   super(name, cost, InputProduceDate, ExpirationDay);
	   this.AlcoholDegree=AlcoholDegree;
	   this.ExpirationDay=30;
	}
       

 public String toString(){
	 return("名字是："+this.name+" 成本是："+this.cost+ " 生产日期是："+this.InputProduceDate+" 保质期是："+this.ExpirationDay+" 酒精度数是："+this.AlcoholDegree);
 }
	  
  
}
