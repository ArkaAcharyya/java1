package Implementation1;

public class Driver {

    public static void main(String[] args) {

        Order order = new Order();

        // Polymorphism → Parent reference, child objects
        FoodItem item1 = new VegItem(1, "Paneer Butter Masala", 250);
        FoodItem item2 = new NonvegItem(2, "Chicken Biryani", 300);
        FoodItem item3 = new VegItem(3, "Veg Fried Rice", 180);

        order.addItem(item1);
        order.addItem(item2);
        order.addItem(item3);

        System.out.println("Total Bill Amount: ₹" + order.calculateTotalBill());
    }
}
