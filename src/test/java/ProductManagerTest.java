import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ProductManagerTest {
    ProductManager manager = new ProductManager();

    Product book1 = new Book(1, "Дуглас Адамс", "Автостопом по галактике", 500);
    Product book2 = new Book(2, "Алексей Пехов", "Крадущийся в тени", 500);
    Product book3 = new Book(3, "Дуглас Адамс", "Автостопом по галактике", 500);
    Product book4 = new Book(4, "Джон Р. Р. Толкин", "Властелин Колец: Возвращение короля", 600);
    Product smartphone1 = new Smartphone(11, "Redmi Note 22", "Xiaomi", 9750);
    Product smartphone2 = new Smartphone(12, "iPhone", "Apple", 1000000);
    Product smartphone3 = new Smartphone(13, "iStick", "Skolkovo", 11500);


    @Test
    void addToCartTest() {
        manager.addProduct(book1);
        manager.addProduct(book2);
        manager.addProduct(book3);
        manager.addProduct(book4);
        manager.addProduct(smartphone1);
        manager.addProduct(smartphone2);
        manager.addProduct(smartphone3);

        Product[] actual = manager.findAll();
        Product[] expected = {book1, book2, book3, book4, smartphone1, smartphone2, smartphone3};

        assertArrayEquals(actual, expected);

    }

    @Test
    void removeByIdTest() {
        manager.addProduct(book1);
        manager.addProduct(book2);
        manager.addProduct(book3);
        manager.addProduct(book4);
        manager.addProduct(smartphone1);
        manager.addProduct(smartphone2);
        manager.addProduct(smartphone3);

        manager.removeById(4);

        Product[] actual = manager.findAll();
        Product[] expected = {book1, book2, book3, smartphone1, smartphone2, smartphone3};

        assertArrayEquals(actual, expected);

    }

    @Test
    void removeByInvalidIdTest() {
        manager.addProduct(book1);
        manager.addProduct(book2);
        manager.addProduct(book3);
        manager.addProduct(book4);
        manager.addProduct(smartphone1);
        manager.addProduct(smartphone2);
        manager.addProduct(smartphone3);

        manager.removeById(4566699);

        Product[] actual = manager.findAll();
        Product[] expected = {book1, book2, book3, book4, smartphone1, smartphone2, smartphone3};

        assertArrayEquals(actual, expected);

    }

    @Test
    void findTextInProductNameTest() {
        manager.addProduct(book1);
        manager.addProduct(book2);
        manager.addProduct(book3);
        manager.addProduct(book4);
        manager.addProduct(smartphone1);
        manager.addProduct(smartphone2);
        manager.addProduct(smartphone3);

        Product[] actual = manager.searchBy("ма");
        Product[] expected = {smartphone1, smartphone2, smartphone3};

        assertArrayEquals(actual, expected);
    }

    @Test
    void findTextInProductNameTest2() {
        manager.addProduct(book1);
        manager.addProduct(book2);
        manager.addProduct(book3);
        manager.addProduct(book4);
        manager.addProduct(smartphone1);
        manager.addProduct(smartphone2);
        manager.addProduct(smartphone3);

        Product[] actual = manager.searchBy("Кни");
        Product[] expected = {book1, book2, book3, book4};

        assertArrayEquals(actual, expected);
    }

    @Test
    void findTextInProductNameTest3() {
        manager.addProduct(book1);
        manager.addProduct(book2);
        manager.addProduct(book3);
        manager.addProduct(book4);
        manager.addProduct(smartphone1);
        manager.addProduct(smartphone2);
        manager.addProduct(smartphone3);

        Product[] actual = manager.searchBy("fdg");
        Product[] expected = {};

        assertArrayEquals(actual, expected);
    }
}
