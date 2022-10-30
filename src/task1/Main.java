package task1;

import task1.ProductList.*;

public class Main {
    public static void main(String[] args) {
        Product eggs = new Product("Яйца", 60, 3);
        Product milk = new Product("Молоко", 90, 1);
        Product chicken = new Product("Курица", 180, 1);
        Product bread = new Product("Хлеб", 40, 1);
        Product cheese = new Product("Сыр", 180, 1);
        Product oil = new Product("масло", 170, 1);
        Product sol = new Product("Соль", 10, 1);
        Product iceСream = new Product("Мороженое", 100, 1);
        ProductList productList = new ProductList();
        productList.addNewProduct(productList.food, eggs);
        productList.addNewProduct(productList.food, milk);
        productList.addNewProduct(productList.food, chicken);
        productList.addNewProduct(productList.food, bread);
        productList.addNewProduct(productList.food, cheese);
        productList.addNewProduct(productList.food, oil);
        productList.addNewProduct(productList.food, sol);
        productList.addNewProduct(productList.food, iceСream);
        productList.addNewProduct(productList.food1, bread);
        productList.addNewProduct(productList.food1, oil);
        productList.addNewProduct(productList.food1, cheese);
        productList.addNewProduct(productList.food2, eggs);
        productList.addNewProduct(productList.food2, chicken);
        productList.addNewProduct(productList.food2, milk);


        System.out.println(productList.food);
        System.out.println(productList.food.size());
        // addNewProduct(food, oil);
        productList.deleteProduct(productList.food, "Соль");
        productList.noteProduct(productList.food, milk);


        System.out.println(productList.food);
        System.out.println(productList.food.size());

        Recipe recipe1 = new Recipe(productList.food, Recipe.sumProduct(productList.food), "Микс");
        System.out.println(recipe1);
        Recipe recipeSandwich = new Recipe(productList.food1, Recipe.sumProduct(productList.food1), "Сендвич");
        System.out.println(recipeSandwich);
        Recipe recipeOmelette = new Recipe(productList.food2, Recipe.sumProduct(productList.food2), "Омлет");
        System.out.println(recipeOmelette);

        Recipe.getRecipes().add(recipe1);
        Recipe.getRecipes().add(recipeOmelette);
        System.out.println(Recipe.getRecipes());
        Recipe.addNewRecipe(recipeSandwich);
        System.out.println(Recipe.getRecipes());
        Recipe.addNewRecipe(recipeSandwich);
        System.out.println(Recipe.getRecipes());


    }
}
