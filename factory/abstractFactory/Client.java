package factory.abstractFactory;

import factory.abstractFactory.book.Book;
import factory.abstractFactory.factory.Factory;
import factory.abstractFactory.factory.series1Factory;
import factory.abstractFactory.pencil.Pencil;

/**
 *
 */
public class Client {
    public static void main(String[] args) {
        Factory series1Factory = new series1Factory();
        Book book1 = series1Factory.createBook();
        Pencil pencil = series1Factory.createPencil();
        book1.read();
        pencil.write();
    }
}
