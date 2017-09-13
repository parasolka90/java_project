package com.kodilla.patterns.library;

import java.util.HashSet;
import java.util.Set;

public final class Library extends Prototype {
     String name;
     Set<Book> books = new HashSet<>();

    public Library(final String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Book> getBooks() {
        return books;
    }
    public Library shallowCopy() throws CloneNotSupportedException {
        return (Library) super.clone();
    }
    public Library deepCopy() throws CloneNotSupportedException {
        Library clonedBooks = (Library) super.clone();
        clonedBooks.books = new HashSet<>();
        for(Book theList : books) {
            Book clonedList = new Book(theList.getTitle(),theList.getAuthor(),theList.getPublicationDate());
            clonedBooks.getBooks().add(clonedList);
        }
        return clonedBooks;
    }

    @Override
    public String toString() {
        return "Library{" +
                "name='" + name + '\'' +
                ", books=" + books +
                '}';
    }
}