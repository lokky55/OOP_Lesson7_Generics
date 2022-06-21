package ru.netology.statistic;

import java.util.Arrays;

public class Library {
    private Book[] books = new Book[0];  // создаем пустой массив книг

    public void addBook(Book book) {
        Book[] tmp = new Book[books.length + 1];
        for (int i = 0; i < books.length; i++) {
            tmp[i] = books[i];
        }
        tmp[tmp.length -1] = book;
        books = tmp;
    }

    public Book[] findBooksByYear(int minYear, int maxYear) {
        Book[] ans = new Book[0];
        for (Book book : books) {
            if (book.getYear() >= minYear && book.getYear() <= maxYear) {
                Book[] tmp = new Book[ans.length + 1];
                for (int i = 0; i < ans.length; i++) {
                    tmp[i] = ans [i];
                }
                tmp[tmp.length - 1] = book;
                ans = tmp;
            }
        }
        Arrays.sort(ans);  // отсортируем результат
        return ans;
    }

}
