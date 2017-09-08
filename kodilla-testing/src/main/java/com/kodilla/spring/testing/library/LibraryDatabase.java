package com.kodilla.spring.testing.library;

import java.util.List;

public interface LibraryDatabase {
    //lists books having title beginning with title fragment
    List<Book> listBookWithConditions(String titleFragment);

    //list books borrowed by libraryUser
    List<Book> listBookInHandsOf(LibraryUser libraryUser);

    //try to rent a book for libraryUser
    //return true when success
    //and returns false when book is unavailable to rent

    boolean rentABook(LibraryUser libraryUser,Book book);

    //return all books borrowed by libraryUser to the library
    //returns number of books returned back

    int returnBooks(LibraryUser libraryUser);
}
