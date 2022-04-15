package org.jabref.logic.xmp;

public class XmpMeta {
    private String title;
    private String author;
    private String subject;
    private String date;

    public XmpMeta(String title, String author, String subject, String date) {
        this.title = title;
        this.author = author;
        this.subject = subject;
        this.date = date;
    }
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getSubject() {
        return subject;
    }

    public String getDate() {
        return date;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
