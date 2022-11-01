package hw1.Task2;

public class Main {
    public static void main(String[] args) {

        Product product1 = new Product("Картофель", 30.0, 0.5);
        Product product2 = new Product("Яйца", 56.0, 0.7);
        Product product3 = new Product("Колбаса", 210.0, 0.8);
        Product product4 = new Product("Сыр", 110.0, 0.6);
        Product product5 = new Product("Огурцы", 120.0, 0.7);
        Product product7 = new Product("Помидоры", 140.0, 0.5);
        Product product8 = new Product("Макароны", 90.0, 0.4);
        Product product9 = new Product("Морковь", 65.0, 0.15);
        Product product10 = new Product("Фарш", 350.0, 0.4);
        Product product11 = new Product("Лук", 40.0, 0.2);

        ProductList list1 = new ProductList();
        list1.addProduct(product1, 1.0);
        list1.addProduct(product2,1.8);
        list1.addProduct(product3, 2.0);
        list1.addProduct(product4,0.8);
        list1.addProduct(product5,1.1);
        list1.addProduct(product7,0.5);

        ProductList list2 = new ProductList();
        list2.addProduct(product7,1.0);
        list2.addProduct(product8,1.0);
        list2.addProduct(product9,1.0);
        list2.addProduct(product10,1.0);
        list2.addProduct(product11,1.0);

        Recipes recipes1 = new Recipes("Салат", list1);
        Recipes recipes2 = new Recipes("Лазанья", list2);
        RecipesBook recipesBook = new RecipesBook();
        recipesBook.addRecipes(recipes1);
        recipesBook.addRecipes(recipes2);
        System.out.println(recipesBook);
    }
}

