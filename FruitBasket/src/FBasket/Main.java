package FBasket;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Banana b1 = new Banana();
		b1.setWeight(5);
		
		Banana b2 = new Banana();
		b2.setWeight(10);
		
		Banana b3 = new Banana();
		b3.setWeight(15);
	
		Orange o1 = new Orange();
		o1.setWeight(4);
		
		Orange o2 = new Orange();
		o2.setWeight(2);
		
//		Papaya p1 = new Papaya();
//		p1.setWeight(30);
		
		
		Basket basket = new Basket();
		basket.addBanana(b1);
		basket.addBanana(b2);
		basket.addBanana(b3);
		basket.addOrange(o1);
		basket.addOrange(o2);
		System.out.println("Total weight of the basket is " + basket.sumWeight() + " Kg." );
		
	}

}
