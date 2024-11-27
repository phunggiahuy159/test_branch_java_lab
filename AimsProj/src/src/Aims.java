
public class Aims {
	public static void main(String[] args) {
		Cart anOrder = new Cart();
		
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", 
				"Animation", "Roger Allers", 87, 19.95f);		
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", 
				"Science Fiction", "George Lucas", 87, 24.95f);	
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", 
				"Animation", 18.99f);
		
		// 1 dvd1, 2 dvd2, 1 dvd3
		anOrder.addDigitalVideoDisc(dvd1);
		anOrder.addDigitalVideoDisc(dvd2);
		anOrder.addDigitalVideoDisc(dvd3);
		anOrder.addDigitalVideoDisc(dvd2);
		System.out.print("Total cost is: ");
		System.out.print(anOrder.totalCost());
		System.out.println();
		
		anOrder.removeDigitalVideoDisc(dvd1);
		anOrder.removeDigitalVideoDisc(dvd2);
		anOrder.removeDigitalVideoDisc(dvd3); 
		anOrder.removeDigitalVideoDisc(dvd3); //testing for deleting non exist disc
		// Remaining: 1 dvd2 
		System.out.print("Total cost is: ");
		System.out.print(anOrder.totalCost());
		System.out.println();
	}
}