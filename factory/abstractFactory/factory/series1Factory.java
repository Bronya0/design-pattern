package factory.abstractFactory.factory;

import factory.abstractFactory.book.Book1;
import factory.abstractFactory.pencil.Pencil;
import factory.abstractFactory.book.Book;
import factory.abstractFactory.pencil.Pencil1;

/**
 *
 */
public class series1Factory implements Factory{
    @Override
    public Book createBook() {
        return new Book1();
    }

    @Override
    public Pencil createPencil() {
        return new Pencil1();
    }
}
