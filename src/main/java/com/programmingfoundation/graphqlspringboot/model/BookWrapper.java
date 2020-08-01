package com.programmingfoundation.graphqlspringboot.model;

public class BookWrapper {
    private String title;
    private String isbn;


    public BookWrapper(){

    }
    public BookWrapper(String title, String isbn) {
        this.title = title;
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    @Override
    public String toString() {
        return "BookWrapper{" +
                "title='" + title + '\'' +
                ", isbn='" + isbn + '\'' +
                '}';
    }
}
