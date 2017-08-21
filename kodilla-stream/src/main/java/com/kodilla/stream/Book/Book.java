package com.kodilla.stream.Book;

public final class Book {
    private final String author;
    private final String title;
    private final int yearOfpublication;
    private final String singature;

    public Book(final String author, final String title, final int yearOfpublication, final String singnature) {
        this.author = author;
        this.title = title;
        this.yearOfpublication = yearOfpublication;
        this.singature=singnature;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public int getYearOfpublication() {
        return yearOfpublication;
    }

    public String getSingature() {
        return singature;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", yearOfpublication=" + yearOfpublication +
                ", singature='" + singature + '\'' +
                '}';
    }

}
