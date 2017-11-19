package com.kodilla.patterns2.adapter;

import com.kodilla.patterns2.adapter.bookclassifier.MedianAdapter;
import com.kodilla.patterns2.adapter.bookclassifier.librarya.Book;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

public class MedianAdapterTestSuite {
    @Test
    public void publicationYearMedianTest() {
        //Given
        MedianAdapter medianAdapter = new MedianAdapter();
        Set<Book> books = new HashSet<>();
        books.add(new Book("Author1", "Title1", 1999, "123450"));
        books.add(new Book("Author2", "Title2", 2002, "123456"));
        books.add(new Book("Author3", "Title3", 1854, "123457"));
        //When
        int result = medianAdapter.publicationYearMedian(books);
        //Then
        Assert.assertEquals(1999, result);
    }
}
