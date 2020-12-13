package q1FriedChicken;

import java.util.ArrayList;
import java.util.List;

public class West2FriedChickenRestaurant implements FriedChickenRestaurant {
private double money=200;//��Ǯ200Ԫ

 List<Drinks> JuiceList=new ArrayList<Drinks>();//��������list
 List<Drinks> BeerList=new ArrayList<Drinks>();
 static List<SetMeal> SetList=new ArrayList<SetMeal>();

//�����ɹ�ѡ�����Ϻ�ơ��
static Juice juice1=new Juice("��֭",5,"2020-11-20",2);
static Juice juice2=new Juice("ƻ��֭",5,"2020-11-20",2);
static Juice juice3=new Juice("��÷֭",5,"2020-11-20",2);

static Drinks Beer1=new Beer("ѩ��ơ��",4,"2020-11-20",30,4);
static Drinks Beer2=new Beer("����ơ��",4,"2020-11-20",30,4);
static Drinks Beer3=new Beer("�ൺơ��",4,"2020-11-20",30,4);

static {//��̬������ײ�Ԫ��
	SetMeal set1=new SetMeal("�ײ�1",30,"ըȫ��",juice1);
	SetMeal set2=new SetMeal("�ײ�2",35,"��֭ը��",Beer1);
	SetMeal set3=new SetMeal("�ײ�3",40,"�¶�������",juice2);
	SetList.add(set1);
	SetList.add(set2);
	SetList.add(set3);
}

//�������ϣ��ڳ����ײ�ʱ����
private void use(Juice juice)throws IngredientSortOutException  {

	if(Judge(juice).getName()=="δ�ҵ�������") {
	 throw new IngredientSortOutException("δ�ҵ�������,��ȷ�Ϻ��ٴ����룡");
	}else {
		for(int i=0;i<JuiceList.size();i++) {
			if(juice==JuiceList.get(i)) {
				JuiceList.remove(i);	
			}
		}
	}
}

//����ơ�ƣ��ڳ����ײ�ʱ����
private void use(Beer beer)throws IngredientSortOutException {
	
	if(Judge(beer).getName()=="δ�ҵ�������") {
	 throw new IngredientSortOutException("δ�ҵ�������,��ȷ�Ϻ��ٴ����룡");
	}else {
		for(int i=0;i<BeerList.size();i++) {
			if(beer==BeerList.get(i)) {
			BeerList.remove(i);	
			
			}
		}
	}
}



@Override
public void SellPackage(SetMeal setMeal) throws IngredientSortOutException{
	if(setMeal.getDrink() instanceof Juice) {
		if(setMeal.getDrink().JudgeDate(setMeal.getDrink().getProduceDate(),setMeal.getDrink().getExpirationDay())==false) {
			try {
			throw new IngredientSortOutException("�Բ��𣬸��ײ��й�֭�ѹ���,���ɳ��۸��ײ�");
			}catch(Exception e){
				e.printStackTrace();
			}
		}else if(JuiceList.contains(setMeal.getDrink())) {
			use((Juice)setMeal.getDrink());
//			JuiceList.remove(setMeal.getDrink());
			this.money=this.money+setMeal.getSetPrice();
			System.out.println("�����ײͳɹ���"+" ��ʱ�������Ϊ��"+this.money);
		}else {
			try {
			throw new IngredientSortOutException("�Բ��𣬸��ײ�������");
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	}else {
		if(setMeal.getDrink().JudgeDate(setMeal.getDrink().getProduceDate(),setMeal.getDrink().getExpirationDay())==false) {
			try {
			throw new IngredientSortOutException("�Բ��𣬸��ײ���ơ���ѹ���,���ɳ��۸��ײ�");
			}catch(Exception e){
				e.printStackTrace();
			}
		}else if(BeerList.contains(setMeal.getDrink())) {
			use((Beer)setMeal.getDrink());
			//BeerList.remove(setMeal.getDrink());
			this.money=this.money+setMeal.getSetPrice();
			System.out.println("�����ײͳɹ���"+" ��ʱ�������Ϊ��"+this.money);
		}else {
			try {
			throw new IngredientSortOutException("�Բ��𣬸��ײ�������");
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	}
}
@Override
//�ж������������beer����juice�����ݽ�������������list�е�Ԫ��
public void BatchPurchase(Drinks drink,int Number)throws OverdraftBalanceException {
	if(Judge(drink).getName()=="δ�ҵ�������") {
		try {
		throw new OverdraftBalanceException("δ�ҵ������ϣ�������������ԣ�");
		}catch(Exception e){
			e.printStackTrace();
		}
	}else if ((this.money-(Number*drink.getCost()))<0) {
		try {
		throw new OverdraftBalanceException("����ʧ�ܣ����㣡������⣺"+(0-(this.money-(Number*drink.getCost())))+"Ԫ");
		}catch(Exception e){
			e.printStackTrace();
		}
	}else {
		if(Judge(drink).getName()=="δ�ҵ�������") {
			try {
	    throw new OverdraftBalanceException("δ�ҵ������ϣ�������������ԣ�");
			}catch(Exception e){
				e.printStackTrace();
			}
		}else if (drink instanceof Juice) {
			this.money=this.money-(Number*drink.getCost());
			for(int i=Number;i>0;i--) {
	    		JuiceList.add(Judge(drink));
		}
			System.out.println("������֭�ɹ���������"+Number+" ��"+this.money);
	}else if(drink instanceof Beer) {
		this.money=this.money-(Number*drink.getCost());//.......
		for(int i=Number;i>0;i--) {
		BeerList.add(Judge(drink));
	}
		System.out.println("����ơ�Ƴɹ���������"+Number+" ��"+this.money);
	}
}
	
}


//Judge �������ж������������������������������ͬ��ơ�ƻ��֭�е�һ�֣������ظ����ϵ�ʵ��,
//Ϊ����ָ���ַ��ͬ,�������list
public Drinks Judge(Drinks d) {
	if(d instanceof Juice) {
		if(d.getName()==juice1.getName()) {
			return juice1;
		}else if(d.getName()==juice2.getName()) {
			return juice2;
		}else if(d.getName()==juice3.getName()) {
			return juice3;
		}else {
			return(new Juice("δ�ҵ�������",0,"0",0));
		}
	}else {
		if(d.getName()==Beer1.getName()) {
			return Beer1;
		}else if(d.getName()==Beer2.getName()) {
			return Beer2;
		}else if(d.getName()==Beer3.getName()){
			return Beer3;
		}else {
			return(new Beer("δ�ҵ�������",0,"0",0,0));
		}
	}
}
}
