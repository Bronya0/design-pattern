package adapter;

/**
 *  3、具体适配器，包含了被适配者的方法
 */
public class BookAdapter implements Adaptor {

    private ReadBook readBook;
    private WriteBook writeBook;

    public BookAdapter(){
        readBook = new ReadBook();
        writeBook = new WriteBook();
    }

    @Override
    public String read(Book book) {
        return readBook.read(book);
    }

    @Override
    public void write(Book book,String content) {
        writeBook.write(book,content);
    }
}
