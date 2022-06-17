import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        ProductManager productManager = new ProductManager();
        Product book1 = new Book(42, "Дуглас Адамс", "Автостопом по галактике", 500);
        Product book2 = new Book(1, "Алексей Пехов", "Крадущийся в тени", 500);
        Product smartphone1 = new Smartphone(35, "Redmi", "Xiaomi", 9750);
        Product smartphone2 = new Smartphone(799, "iStick", "Skolkovo", 11500);

        productManager.addProduct(book1);
        productManager.addProduct(book2);
        productManager.addProduct(smartphone1);
        productManager.addProduct(smartphone2);
        productManager.removeById(42);
        productManager.searchBy("фон");
    }
}
