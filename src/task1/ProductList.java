package task1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

public class ProductList {
    final Set<Product> food = new HashSet<>();
    final Set<Product> food1 = new HashSet<>();
    final Set<Product> food2 = new HashSet<>();

    public void addNewProduct(Set<Product> food, Product product) {
        if (food.contains(product) && product != null) {
            throw new RuntimeException("Такой продукт уже имеется в списке");
        } else food.add(product);

    }

    public void noteProduct(Set<Product> food, Product product) {
        if (food.contains(product) && product != null) {
            System.out.println("Вы купили данный продукт :" + product);

        }

    }

    public void deleteProduct(Set<Product> foods, String foodName) {
        Iterator<Product> productsIterator = this.food.iterator();
        while (productsIterator.hasNext()) {
            if (productsIterator.next().getFoodName().equals(foodName)) {
                productsIterator.remove();
                break;
            }
        }

    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductList that = (ProductList) o;
        return Objects.equals(food, that.food) && Objects.equals(food1, that.food1) && Objects.equals(food2, that.food2);
    }


}
