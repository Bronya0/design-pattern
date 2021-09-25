package builder;

/**
 * 4、控制器
 */
public class BookController {

    public Book construct(BookBuilder bookBuilder){
        BookBuilder goBookBuilder = new GoBookBuilder();
        return goBookBuilder.creatBook();
    }

}
