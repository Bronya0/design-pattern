package factory.factoryMethod.factory;

import factory.factoryMethod.book.Book;
import factory.factoryMethod.book.Book1;

/**
 *
 */
public class Book1Factory implements Factory{
    @Override
    public Book creatBook() {
        return new Book1();
    }
}
