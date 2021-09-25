package builder;

/**
 *  3-2、具体建造者之一
 */
public class GoBookBuilder extends BookBuilder{
    @Override
    public void buildType() {
        book.setType("Go");
    }

    @Override
    public void buildColor() {
        book.setColor("blue");
    }

    @Override
    public void buildPage() {
        book.setPage(100);
    }

    @Override
    public void buildContent() {
        book.setContent("云原生语言");
    }
}
