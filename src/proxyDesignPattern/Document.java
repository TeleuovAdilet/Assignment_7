package proxyDesignPattern;

public class Document {
    private final String id;
    private final String content;

    public Document(final String id, final String content) {
        this.id = id;
        this.content = content;
    }

    public String getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}

