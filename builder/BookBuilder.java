package builder;

/**
 *  2、抽象建造者
 */
abstract class BookBuilder {

    protected Book book = new Book();

    public abstract void buildType();

    public abstract void buildColor();

    public abstract void buildPage();

    public abstract void buildContent();

    public Book creatBook(){
        return book;
    }
}
