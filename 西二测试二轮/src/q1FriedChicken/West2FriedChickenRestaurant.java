package q1FriedChicken;

import java.util.ArrayList;
import java.util.List;

public class West2FriedChickenRestaurant implements FriedChickenRestaurant {
private double money=200;//本钱200元

 List<Drinks> JuiceList=new ArrayList<Drinks>();//创建三种list
 List<Drinks> BeerList=new ArrayList<Drinks>();
 static List<SetMeal> SetList=new ArrayList<SetMeal>();

//创建可供选的饮料和啤酒
static Juice juice1=new Juice("橙汁",5,"2020-11-20",2);
static Juice juice2=new Juice("苹果汁",5,"2020-11-20",2);
static Juice juice3=new Juice("酸梅汁",5,"2020-11-20",2);

static Drinks Beer1=new Beer("雪津啤酒",4,"2020-11-20",30,4);
static Drinks Beer2=new Beer("百威啤酒",4,"2020-11-20",30,4);
static Drinks Beer3=new Beer("青岛啤酒",4,"2020-11-20",30,4);

static {//静态块加入套餐元素
	SetMeal set1=new SetMeal("套餐1",30,"炸全鸡",juice1);
	SetMeal set2=new SetMeal("套餐2",35,"蜜汁炸鸡",Beer1);
	SetMeal set3=new SetMeal("套餐3",40,"奥尔良烤鸡",juice2);
	SetList.add(set1);
	SetList.add(set2);
	SetList.add(set3);
}

//出售饮料，在出售套餐时引用
private void use(Juice juice)throws IngredientSortOutException  {

	if(Judge(juice).getName()=="未找到该饮料") {
	 throw new IngredientSortOutException("未找到该饮料,请确认后再次输入！");
	}else {
		for(int i=0;i<JuiceList.size();i++) {
			if(juice==JuiceList.get(i)) {
				JuiceList.remove(i);	
			}
		}
	}
}

//出售啤酒，在出售套餐时引用
private void use(Beer beer)throws IngredientSortOutException {
	
	if(Judge(beer).getName()=="未找到该饮料") {
	 throw new IngredientSortOutException("未找到该饮料,请确认后再次输入！");
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
			throw new IngredientSortOutException("对不起，该套餐中果汁已过期,不可出售该套餐");
			}catch(Exception e){
				e.printStackTrace();
			}
		}else if(JuiceList.contains(setMeal.getDrink())) {
			use((Juice)setMeal.getDrink());
//			JuiceList.remove(setMeal.getDrink());
			this.money=this.money+setMeal.getSetPrice();
			System.out.println("购买套餐成功！"+" 此时餐厅余额为："+this.money);
		}else {
			try {
			throw new IngredientSortOutException("对不起，该套餐已售罄");
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	}else {
		if(setMeal.getDrink().JudgeDate(setMeal.getDrink().getProduceDate(),setMeal.getDrink().getExpirationDay())==false) {
			try {
			throw new IngredientSortOutException("对不起，该套餐中啤酒已过期,不可出售该套餐");
			}catch(Exception e){
				e.printStackTrace();
			}
		}else if(BeerList.contains(setMeal.getDrink())) {
			use((Beer)setMeal.getDrink());
			//BeerList.remove(setMeal.getDrink());
			this.money=this.money+setMeal.getSetPrice();
			System.out.println("购买套餐成功！"+" 此时餐厅余额为："+this.money);
		}else {
			try {
			throw new IngredientSortOutException("对不起，该套餐已售罄");
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	}
}
@Override
//判断输入的饮料是beer还是juice并根据进货数量来增加list中的元素
public void BatchPurchase(Drinks drink,int Number)throws OverdraftBalanceException {
	if(Judge(drink).getName()=="未找到该饮料") {
		try {
		throw new OverdraftBalanceException("未找到该饮料，请检查输入后再试！");
		}catch(Exception e){
			e.printStackTrace();
		}
	}else if ((this.money-(Number*drink.getCost()))<0) {
		try {
		throw new OverdraftBalanceException("购买失败，余额不足！还需额外："+(0-(this.money-(Number*drink.getCost())))+"元");
		}catch(Exception e){
			e.printStackTrace();
		}
	}else {
		if(Judge(drink).getName()=="未找到该饮料") {
			try {
	    throw new OverdraftBalanceException("未找到该饮料，请检查输入后再试！");
			}catch(Exception e){
				e.printStackTrace();
			}
		}else if (drink instanceof Juice) {
			this.money=this.money-(Number*drink.getCost());
			for(int i=Number;i>0;i--) {
	    		JuiceList.add(Judge(drink));
		}
			System.out.println("进货果汁成功！数量："+Number+" 余额："+this.money);
	}else if(drink instanceof Beer) {
		this.money=this.money-(Number*drink.getCost());//.......
		for(int i=Number;i>0;i--) {
		BeerList.add(Judge(drink));
	}
		System.out.println("进货啤酒成功！数量："+Number+" 余额："+this.money);
	}
}
	
}


//Judge 方法；判断输入的饮料名称与那种饮料名字相同（啤酒或果汁中的一种）并返回该饮料的实例,
//为令其指向地址相同,方便操作list
public Drinks Judge(Drinks d) {
	if(d instanceof Juice) {
		if(d.getName()==juice1.getName()) {
			return juice1;
		}else if(d.getName()==juice2.getName()) {
			return juice2;
		}else if(d.getName()==juice3.getName()) {
			return juice3;
		}else {
			return(new Juice("未找到该饮料",0,"0",0));
		}
	}else {
		if(d.getName()==Beer1.getName()) {
			return Beer1;
		}else if(d.getName()==Beer2.getName()) {
			return Beer2;
		}else if(d.getName()==Beer3.getName()){
			return Beer3;
		}else {
			return(new Beer("未找到该饮料",0,"0",0,0));
		}
	}
}
}
