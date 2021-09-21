package factory.abstractFactory.factory;

import factory.abstractFactory.pencil.Pencil;
import factory.abstractFactory.book.Book;

/**
 *
 */
public interface Factory {
    Book createBook();
    Pencil createPencil();
}
