package q1FriedChicken;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		West2FriedChickenRestaurant a1=new West2FriedChickenRestaurant();//newһ�ι���
	    //�����ײ�List��Ԫ���Ƿ���ȷ
		for(int i=0;i<West2FriedChickenRestaurant.SetList.size();i++) {
	    	System.out.println(West2FriedChickenRestaurant.SetList.get(i));
	    }
		//��������
		a1.BatchPurchase(West2FriedChickenRestaurant.SetList.get(1).getDrink(), 2);//��������static
		a1.BatchPurchase(West2FriedChickenRestaurant.SetList.get(0).getDrink(), 2);
		a1.BatchPurchase(West2FriedChickenRestaurant.SetList.get(2).getDrink(), 1);
		//a1.BatchPurchase(West2FriedChickenRestaurant.SetList.get(2).getDrink(), 100); //�������ײͶ��е�����100���򱨴����㡱
		//System.out.println(West2FriedChickenRestaurant.SetList.get(1));//��⣬�Զ�����toString����
		//���ײ�1�е�����Ϊ���������������֮���Ƿ�������list������Ԫ��
		 System.out.println();
		System.out.println("���ڹ�֭�Ľ�����͹������......................................................");
		for(int i=0;i<a1.JuiceList.size();i++) {
	    	System.out.println(a1.JuiceList.get(i));
	    }
	    a1.SellPackage(West2FriedChickenRestaurant.SetList.get(0));//���򺬹�֭���ײ�
	    //����JuiceList�鿴�Ƿ������ײ�1�е����ϣ���������Ϊ1
	    for(int i=0;i<a1.JuiceList.size();i++) {
	    	System.out.println(a1.JuiceList.get(i));
	    }
	    System.out.println();
	    System.out.println("����ơ�ƵĽ�����͹������.....................................................");
	    for(int i=0;i<a1.BeerList.size();i++) {
	    	System.out.println(a1.BeerList.get(i));
	    }
	    a1.SellPackage(West2FriedChickenRestaurant.SetList.get(1));//����ơ�Ƶ��ײ�
	    for(int i=0;i<a1.BeerList.size();i++) {
	    	System.out.println(a1.BeerList.get(i));
	    }
	    //���������ײ�3����ʾ����
	    a1.SellPackage(West2FriedChickenRestaurant.SetList.get(2));
	    a1.SellPackage(West2FriedChickenRestaurant.SetList.get(2));
	  
	}


}
