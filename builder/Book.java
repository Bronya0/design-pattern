package builder;

/**
 *  1、复杂产品
 */
public class Book {

    private String type;    //书本类型

    private String color;   //颜色

    private Integer page;    //页数

    private String content; //内容

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
