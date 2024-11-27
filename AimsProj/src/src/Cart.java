public class Cart {
    public static final int MAX_NUMBERS_ORDERED = 20;
    private DigitalVideoDisc itemsOrdered[] = 
        new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
    private int qtyOrdered;    
    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
		if (qtyOrdered == MAX_NUMBERS_ORDERED) {
			System.out.println("Cart is full now");
			return;
		}
		itemsOrdered[qtyOrdered] = disc;
		qtyOrdered++;
		System.out.println("The " + disc.getTitle() + " disc has been added");
		
		if (qtyOrdered == MAX_NUMBERS_ORDERED - 1) {
			System.out.println("The cart is almost full");
		}
		else if (qtyOrdered == MAX_NUMBERS_ORDERED) {
			System.out.println("The cart is full");
		}
	}	
	public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
		boolean hasRemoved = false;
		if (qtyOrdered == 0) {
			System.out.println("The cart is empty, cannot delete any_disc");
			return;
		}
		// 'a little it mo
		for (int i = 0; i < qtyOrdered; i++) {
			if (itemsOrdered[i].equals(disc)) {
				for (int j = i+1; j < qtyOrdered; j++) {
					itemsOrdered[i] = itemsOrdered[j];
					i++;
				}
				hasRemoved = true;
				qtyOrdered--;
				System.out.println("The " + disc.getTitle() + " disc is removed from cart");
				break;
			}
		}
		if (!hasRemoved) System.out.println("The " + disc.getTitle() + " disc is not found in the cart");
	}
	
	public float totalCost() {
		float cost = 0;
		for (int i = 0; i < qtyOrdered; i++) {
			cost += itemsOrdered[i].getCost();
		}
		return cost;
	}
    
}
