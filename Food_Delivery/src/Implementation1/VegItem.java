package Implementation1;

public class VegItem extends FoodItem{
		public VegItem(int id, String name, double price) {
	        super(id, name, price);
	    }

	    @Override
	    public double calculateDiscount() {
	        return getPrice() * 0.10; // 10% discount
	    }
	
}
