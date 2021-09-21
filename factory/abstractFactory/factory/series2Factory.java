package factory.abstractFactory.factory;

import factory.abstractFactory.book.Book;
import factory.abstractFactory.book.Book2;
import factory.abstractFactory.pencil.Pencil;
import factory.abstractFactory.pencil.Pencil2;

/**
 *
 */
public class series2Factory implements Factory{
    @Override
    public Book createBook() {
        return new Book2();
    }

    @Override
    public Pencil createPencil() {
        return new Pencil2();
    }
}
