package ru.netology.statistic;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LibraryTest {

    Library library = new Library();
    Book book = new Book("Garry", "Rouling", 2000, 230);
    Book book1 = new Book("Anton", "Gousling", 1900, 330);
    Book book2 = new Book("Winter", "Alex", 2001, 130);
    Book book3 = new Book("Oscar", "unknown", 1999, 430);

    @BeforeEach
    public void setUp() {
        library.addBook(book);
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
    }

    @Test
    public void shouldFindAndSortByYear() {
        Book[] actual = library.findBooksByYear(1900, 2000);
        Book[] expected = {book1, book3, book};
        Assertions.assertArrayEquals(expected, actual);
    }

}
