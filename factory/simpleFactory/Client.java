package factory.simpleFactory;

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
