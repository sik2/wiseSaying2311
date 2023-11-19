package org.example;

public class WiseSaying {
    private long id;
    private String content;
    private String author;

    WiseSaying (long id, String author, String content) {
        this.id = id;
        this.author = author;
        this.content = content;
    }

    public long getId() {
        return this.id;
    }

    public String getAuthor() {
        return this.author;
    }

    public String getContent() {
        return this.content;
    }
}
