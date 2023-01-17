package FBasket;

import java.util.ArrayList;

public class Basket {
	private ArrayList<Orange> oranges = new ArrayList<Orange>();
	private ArrayList<Banana> bananas = new ArrayList<Banana>();
	
	public double sumWeight() {
		double sumOrange = 0;
		double sumBanana = 0;
		double total = 0;
		for(int i=0; i<oranges.size() ; i++) {
			sumOrange = sumOrange + oranges.get(i).getWeight();
		}
		
		for(int i=0; i<bananas.size() ; i++) {
			sumBanana = sumBanana + bananas.get(i).getWeight();
		}
		total = sumOrange + sumBanana;
		return total ;
	}
	
	public void addOrange(Orange wOrange) {
		oranges.add(wOrange);
	}
	
	public void addBanana(Banana wBanana) {
		bananas.add(wBanana);
	}
	
//	private ArrayList<Fruit> fruit = new ArrayList<Fruit>();
//	
//	public double sumWeight() {
//	double sumFruit = 0;
//	for(int i=0; i<fruit.size() ; i++) {
//		sumFruit = sumFruit + fruit.get(i).getWeight();
//		}
//		return sumFruit ;
//	}
//	
//	public void addFruit(Fruit wFruit) {
//		fruit.add(wFruit);
//	}

}
