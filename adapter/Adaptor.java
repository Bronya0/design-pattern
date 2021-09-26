package adapter;

/**
 *  1、目标接口
 */
public interface Adaptor {

    String read(Book book);
    void write(Book book,String content);

}
