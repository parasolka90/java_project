package com.kodilla.patterns.library;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class LibraryTestSuite {
    @Test
    public void testGetBooks(){
        //When
        Library library = new Library("Library1");
        Book b1= new  Book("Book1","Author1", LocalDate.of(1990,12,12));
        Book b2= new  Book("Book2","Author2", LocalDate.of(1991,11,12));
        Book b3= new  Book("Book3","Author3", LocalDate.of(1992,10,11));
        library.getBooks().add(b1);
        library.getBooks().add(b2);
        library.getBooks().add(b3);


        Library clonedLibrary = null;
        try {
            clonedLibrary = library.shallowCopy();
            clonedLibrary.setName("Library2");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //making a deep copy of object board
        Library deepClonedBoard = null;
        try {
            deepClonedBoard = library.deepCopy();
            deepClonedBoard.setName("Library3");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //When
        library.getBooks().remove(b2);

        //Then
        System.out.println(library);
        System.out.println(clonedLibrary);
        System.out.println(deepClonedBoard);
        Assert.assertEquals(2, library.getBooks().size());
        Assert.assertEquals(2, clonedLibrary.getBooks().size());
        Assert.assertEquals(3, deepClonedBoard.getBooks().size());
        Assert.assertEquals(clonedLibrary.getBooks(), library.getBooks());
        Assert.assertNotEquals(deepClonedBoard.getBooks(), library.getBooks());

    }
}
