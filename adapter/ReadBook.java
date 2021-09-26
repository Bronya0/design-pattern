package adapter;

/**
 * 2-1 适配者1
 */
public class ReadBook {

    public String read(Book book){
        return book.getContent();
    }
}
