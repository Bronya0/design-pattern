package builder;

/**
 *  3-1、具体建造者之一
 */
public class JavaBookBuilder extends BookBuilder{
    @Override
    public void buildType() {
        book.setType("Java");
    }

    @Override
    public void buildColor() {
        book.setColor("black");
    }

    @Override
    public void buildPage() {
        book.setPage(200);
    }

    @Override
    public void buildContent() {
        book.setContent("跨平台，生态全");
    }
}
