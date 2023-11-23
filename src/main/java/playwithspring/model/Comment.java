package playwithspring.model;

public class Comment {

    private String author;
    private String text;

    public String getAuthor() {
        return author;
    }

    public String getText() {
        return text;
    }

    public Comment(String author, String text) {
        this.author = author;
        this.text = text;
    }
}
