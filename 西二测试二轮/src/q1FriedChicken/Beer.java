package q1FriedChicken;

public class Beer extends Drinks {
private float AlcoholDegree;//�ƾ�����
    
	public Beer(String name, double cost, String InputProduceDate, int ExpirationDay,float AlcoholDegree) {
	   super(name, cost, InputProduceDate, ExpirationDay);
	   this.AlcoholDegree=AlcoholDegree;
	   this.ExpirationDay=30;
	}
       

 public String toString(){
	 return("�����ǣ�"+this.name+" �ɱ��ǣ�"+this.cost+ " ���������ǣ�"+this.InputProduceDate+" �������ǣ�"+this.ExpirationDay+" �ƾ������ǣ�"+this.AlcoholDegree);
 }
	  
  
}
