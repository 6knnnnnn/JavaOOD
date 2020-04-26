package 设计模式.观察者;

public class News {
    private String author;
    private int publishedTime;
    private String title;

    public News(String author, int publishedTime, String title) {
        this.author = author;
        this.publishedTime = publishedTime;
        this.title = title;
    }

    public String toString() {
        return String.format("标题: %s 作者: %s 发布日期: %d", title, author, publishedTime);
    }
}
