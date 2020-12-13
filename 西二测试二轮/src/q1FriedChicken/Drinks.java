package q1FriedChicken;
import java.time.LocalDate;

public  abstract class Drinks {
protected String name;
protected double cost;
protected String InputProduceDate;
protected LocalDate ProduceDate;//=LocalDate.parse(InputProduceDate);//生产日期
protected int ExpirationDay;//保质期

public Drinks(String name,double cost,String InputProduceDate,int ExpirationDay) {
	this.name=name;
	this.cost=cost;
	this.ProduceDate=LocalDate.parse(InputProduceDate);
	this.ExpirationDay=ExpirationDay;
	this.InputProduceDate=InputProduceDate;
}

public boolean JudgeDate(LocalDate ProduceDate,int ExpirationDay) {
	LocalDate DueDate=ProduceDate.plusDays(ExpirationDay);//?????
	return LocalDate.now().isBefore(DueDate);//true为没过期，false为过期
}

public abstract String toString();


//...................getters and setters.............................
public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public double getCost() {
	return cost;
}

public void setCost(double cost) {
	this.cost = cost;
}

public String getInputProduceDate() {
	return InputProduceDate;
}

public void setInputProduceDate(String inputProduceDate) {
	InputProduceDate = inputProduceDate;
}

public LocalDate getProduceDate() {
	return ProduceDate;
}

public void setProduceDate(LocalDate produceDate) {
	ProduceDate = produceDate;
}

public int getExpirationDay() {
	return ExpirationDay;
}

public void setExpirationDay(int expirationDay) {
	ExpirationDay = expirationDay;
}


}

