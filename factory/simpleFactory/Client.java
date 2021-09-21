package factory.simpleFactory;

import factory.simpleFactory.book.Product;
import factory.simpleFactory.factory.ProductFactory;

/**
 *
 */
public class Client {
    public static void main(String[] args) {
        Product product;
        product = ProductFactory.getProduct("book1");
        product.add();
    }
}
