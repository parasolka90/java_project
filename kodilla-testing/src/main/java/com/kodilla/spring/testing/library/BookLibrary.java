package com.kodilla.spring.testing.library;

import java.util.ArrayList;
import java.util.List;

public class BookLibrary {
    LibraryDatabase libraryDatabase;

    public BookLibrary(LibraryDatabase libraryDatabase) {
        this.libraryDatabase = libraryDatabase;
    }

    public List<Book> listBooksWithCondition(String titleFragment) {
        List<Book> bookList = new ArrayList<>();
        if (titleFragment.length() < 3) return bookList;
        List<Book> resultList = libraryDatabase.listBookWithConditions(titleFragment);

        if(resultList.size()>20)return bookList;
        bookList=resultList;

        return bookList;
    }
    List<Book> listBookInHandsOf(LibraryUser libraryUser){
        List<Book> borrowedBooksList = new ArrayList<>();
        borrowedBooksList =libraryDatabase.listBookInHandsOf(libraryUser);
        return borrowedBooksList;
    }
}
