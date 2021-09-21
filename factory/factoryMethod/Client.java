package factory.factoryMethod;

import factory.factoryMethod.book.Book;
import factory.factoryMethod.factory.Book1Factory;
import factory.factoryMethod.factory.Factory;

/**
 *
 */
public class Client {
    public static void main(String[] args) {
        Factory book1Factory = new Book1Factory();
        Book book1 = book1Factory.creatBook();
        book1.read();
    }
}
