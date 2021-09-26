package adapter;

/**
 *
 */
public class Client {
    public static void main(String[] args) {
        Adaptor bookAdapter = new BookAdapter();
        Book book = new Book();
        bookAdapter.write(book,"1212");
        String read = bookAdapter.read(book);
        System.out.println(read);
    }
}
