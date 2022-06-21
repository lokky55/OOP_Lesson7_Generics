package ru.netology.statistic;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Book[] books = {
        new Book("Garry", "Rouling", 2000, 230),
        new Book("Anton", "Gousling", 1900, 330),
        new Book("Winter", "Alex", 2001, 130),
        new Book("Oscar", "unknown", 1999, 430),
        };

        Arrays.sort(books);
        System.out.println(Arrays.toString(books)); // Красивый вывод массивов, при этом задается параметр toString в дата-классе
    }
}
