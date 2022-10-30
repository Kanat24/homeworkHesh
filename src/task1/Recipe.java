package task1;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Recipe {

    private final Set<Product> products;
    private final int sumAll;
    private final String nameRecipe;
    public static final Set<Recipe> recipes = new HashSet<>();

    public static Set<Recipe> getRecipes() {
        return recipes;
    }

    public Recipe(Set<Product> products, int sumAll, String nameRecipe) {
        if (products==null || products.size()==0 || nameRecipe==null || nameRecipe.isEmpty()){
            throw new IllegalArgumentException("Не заполнены все поля");
        }
        this.products = products;
        this.sumAll = sumAll;
        this.nameRecipe = nameRecipe;
    }


    public int getSumAll() {
        return sumAll;
    }

    public String getNameRecipe() {
        return nameRecipe;
    }

    public static void addNewRecipe(Recipe recipe) {
        if (recipes.contains(recipe)){
                throw new IllegalArgumentException("Этот рецепц уже есть в нашем списке");
            } else recipes.add(recipe);
    }

    public static int sumProduct(Set<Product> foods) {
        int summa = 0;
        if (foods != null) {
            for (Product product : foods) {
                summa += product.getPrice();
            }
        }
        return summa;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Recipe recipe = (Recipe) o;
        return Objects.equals(products, recipe.products);
    }

    @Override
    public int hashCode() {
        return Objects.hash(products);
    }

    @Override
    public String toString() {
        return "Task1.Recipe{" +
                "products=" + products +
                ", sumAll=" + sumAll +
                ", nameRecipe='" + nameRecipe + '\'' +
                '}';
    }
}
