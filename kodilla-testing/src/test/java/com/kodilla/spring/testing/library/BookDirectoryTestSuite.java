package com.kodilla.spring.testing.library;

import org.junit.*;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.*;

public class BookDirectoryTestSuite {
    private List<Book> generateListOfBooks(int booksQuantity) {
        List<Book> resultList = new ArrayList<>();
        for (int n = 1; n <= booksQuantity; n++) {
            Book theBook = new Book("Title " + n, "Author " + n, 1970 + n);
            resultList.add(theBook);
        }
        return resultList;
    }

    @Test
    public void testListBooksWithConditionsReturnList() {
        //Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOfBook = new ArrayList<>();
        Book book1 = new Book("Secret Book 1", "Fii Author 1", 2008);
        Book book2 = new Book("Secretary Book 2", "Author 2", 2012);
        Book book3 = new Book("Secret Book 3", "XX Author 3", 2016);
        Book book4 = new Book("Secret Book 4", "Lolo Author 4", 2010);
        resultListOfBook.add(book1);
        resultListOfBook.add(book2);
        resultListOfBook.add(book3);
        resultListOfBook.add(book4);
        when(libraryDatabaseMock.listBookWithConditions("Secret")).thenReturn(resultListOfBook);

        //When
        List<Book> theListOfBooks = bookLibrary.listBooksWithCondition("Secret");
        //Then
        assertEquals(4, theListOfBooks.size());
    }

    @Test
    public void testListBooksWithConditionMoreThan20() {
        //Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOf0Books = new ArrayList<>();
        List<Book> resultListOf15Books = generateListOfBooks(15);
        List<Book> resultListof40Books = generateListOfBooks(40);
        when(libraryDatabaseMock.listBookWithConditions(anyString())).thenReturn(resultListOf15Books);
        when(libraryDatabaseMock.listBookWithConditions("ZeroBooks"))
                .thenReturn(resultListOf0Books);
        when(libraryDatabaseMock.listBookWithConditions("FourtyBooks"))
                .thenReturn(resultListof40Books);

        //When
        List<Book> theListOfBooks0 = bookLibrary.listBooksWithCondition("ZeroBooks");
        List<Book> theListOfBooks15 = bookLibrary.listBooksWithCondition("AnyTitle");
        List<Book> theListOfBooks40 = bookLibrary.listBooksWithCondition("FourtyBooks");
        //Then

        assertEquals(0, theListOfBooks0.size());
        assertEquals(15, theListOfBooks15.size());
        assertEquals(0, theListOfBooks40.size());
    }

    @Test
    public void testListBooksWithConditionFragmentShorterThan3() {
        //Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOf10Books = generateListOfBooks(10);
        when(libraryDatabaseMock.listBookWithConditions(anyString()))
                .thenReturn(resultListOf10Books);

        //When
        List<Book> theListOfBook10 = bookLibrary.listBooksWithCondition("Au");

        //Then
        assertEquals(0, theListOfBook10.size());
        verify(libraryDatabaseMock, times(0)).listBookWithConditions(anyString());
    }

    @Test
    public void test0BooksBorrowed() {
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        LibraryUser libraryUser = new LibraryUser("Adam", "Kowalski", "1234");
        when(libraryDatabaseMock.listBookInHandsOf(any(LibraryUser.class))).thenReturn(new ArrayList<Book>());

        //When
        List<Book> x = bookLibrary.listBookInHandsOf(libraryUser);
        //Then
        assertEquals(0, x.size());
    }

    @Test
    public void test1BookBorrowed() {
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        LibraryUser libraryUser = new LibraryUser("Adam", "Kowalski", "1234");
        List<Book> borrowedBooks = new ArrayList<>();
        borrowedBooks.add(new Book("Secret Book 1", "Fii Author 1", 2008));

        when(libraryDatabaseMock.listBookInHandsOf(any(LibraryUser.class))).thenReturn(borrowedBooks);

        //When
        List<Book> x = bookLibrary.listBookInHandsOf(libraryUser);
        //Then
        assertEquals(borrowedBooks, x);
    }

    @Test
    public void test5BooksBorrowed() {
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        LibraryUser libraryUser = new LibraryUser("Adam", "Kowalski", "1234");
        List<Book> borrowedBooks = new ArrayList<>();
        borrowedBooks.add(new Book("Secret Book 0", "Fii Author 3", 2009));
        borrowedBooks.add(new Book("Secret Book 1", "Fii Author 4", 2005));
        borrowedBooks.add(new Book("Secret Book 2", "Fii Author 8", 2004));
        borrowedBooks.add(new Book("Secret Book 3", "Fii Author 9", 2006));
        borrowedBooks.add(new Book("Secret Book 4", "Fii Author", 2000));
        when(libraryDatabaseMock.listBookInHandsOf(any(LibraryUser.class))).thenReturn(borrowedBooks);

        //When
        List<Book> x = bookLibrary.listBookInHandsOf(libraryUser);

        //Then
        assertEquals(borrowedBooks, x);
    }
}
