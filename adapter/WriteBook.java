package adapter;

/**
 *  2-2 适配者2
 */
public class WriteBook {

    public void write(Book book,String content){
        book.setContent(content);
    }
}
