package q1FriedChicken;

public class Juice extends Drinks {

	public Juice(String name, double cost, String InputProduceDate, int ExpirationDay) {
		super(name, cost, InputProduceDate, ExpirationDay);
		this.ExpirationDay=2;
	}
public String toString() {
	return("�����ǣ� "+this.name+" �ɱ��ǣ� "+this.cost+ " ���������ǣ� "+this.InputProduceDate+" �������ǣ� "+this.ExpirationDay);
}


}
