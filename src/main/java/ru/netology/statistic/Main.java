package ru.netology.statistic;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        Book book1 = new Book("Garry", "Rouling", 2000, 230);
//        Book book2 = new Book("Anton", "Rouling", 1900, 330);
//        int result = book1.compareTo(book2);
//        System.out.println(result);

        Book[] books = {
        new Book("Garry", "Rouling", 2000, 230),
        new Book("Anton", "Gousling", 1900, 330),
        new Book("Winter", "Alex", 2001, 130),
        new Book("Oscar", "unknown", 1999, 430),
        };
        // Красивый вывод массивов, при этом задается параметр toString в дата-классе

        Arrays.sort(books);
        System.out.println(Arrays.toString(books));
    }
}
