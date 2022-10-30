package task1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

class Product {
    private final String foodName;
    private final int price;
    private final int amount;
    private boolean checked;


    public Product(String foodName, int price, int amount) {
        if (foodName == null || foodName.isEmpty() || price == 0 || amount == 0) {
            throw new RuntimeException("Заполните карточку товара полностью");
        } else {
            this.foodName = foodName;
            this.price = price;
            this.amount = amount;
            this.checked = false;

        }
    }

    public String getFoodName() {
        return foodName;
    }

    public int getPrice() {
        return price;
    }

    public int getAmount() {
        return amount;
    }

    public boolean isChecked() {
        return checked;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(foodName, product.foodName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(foodName);
    }

    @Override
    public String toString() {
        return "Product{" +
                "foodName='" + foodName + '\'' +
                ", price=" + price +
                ", amount=" + amount +
                '}';
    }
}