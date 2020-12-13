package q1FriedChicken;

public class Juice extends Drinks {

	public Juice(String name, double cost, String InputProduceDate, int ExpirationDay) {
		super(name, cost, InputProduceDate, ExpirationDay);
		this.ExpirationDay=2;
	}
public String toString() {
	return("名字是： "+this.name+" 成本是： "+this.cost+ " 生产日期是： "+this.InputProduceDate+" 保质期是： "+this.ExpirationDay);
}


}
