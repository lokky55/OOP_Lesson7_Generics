package ru.netology.statistic;

import java.util.Objects;

//создадим data-class - класс необходимый только для хранения данных
public class Book implements Comparable<Book> {  // Comparable<Book> - дженерик. Произвели шалбонизацию класса интерфейса
    private String title;
    private String author;
    private int year;
    private int pages;

    public Book(String title, String author, int year, int pages) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.pages = pages;
    }

    public String getTitle() {
        return title;
    }
// убираем все setters - нельзя менять заданные параметры книг

//    public void setTitle(String title) {
//        this.title = title;
//    }

    public String getAuthor() {
        return author;
    }

//    public void setAuthor(String author) {
//        this.author = author;
//    }

    public int getYear() {
        return year;
    }

//    public void setYear(int year) {
//        this.year = year;
//    }

    public int getPages() {
        return pages;
    }

    //    public void setPages(int pages) {
//        this.pages = pages;
//    }
    // красивый вывод массива
    @Override
    public String toString() {
        return author;
    }

    @Override
    public int compareTo (Book otherBook){
        if (year < otherBook.year) {
            return -1;
        }
        if (year > otherBook.year) {
            return +1;
        }
        return 0;
    }

    // так как сравниваются элементы нам необходимо переопределить equals и hashcode

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return year == book.year && pages == book.pages && Objects.equals(title, book.title) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author, year, pages);
    }
}
