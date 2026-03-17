package Implementation1;

import java.util.ArrayList;
import java.util.List;

class Order {

    private List<FoodItem> items = new ArrayList<>();

    // Add food item
    public void addItem(FoodItem item) {
        items.add(item);
    }

    // Calculate total bill
    public double calculateTotalBill() {
        double total = 0;

        for (FoodItem item : items) {
            total += item.getPrice() - item.calculateDiscount();
        }
        return total;
    }
}