package factory.factoryMethod.factory;

import factory.factoryMethod.book.Book;
import factory.factoryMethod.book.Book2;

/**
 *
 */
public class Book2Factory implements Factory{
    @Override
    public Book creatBook() {
        return new Book2();
    }
}
