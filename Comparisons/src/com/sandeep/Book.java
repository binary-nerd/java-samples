package com.sandeep;

import java.util.Comparator;

public class Book implements Comparable<Book> {
    private String author;
    private String publisher;
    private Integer nrPages;
    private Integer ID;

    public Book(String author, String publisher, Integer nrPages, Integer id) {
        this.author = author;
        this.publisher = publisher;
        this.nrPages = nrPages;
        this.ID = id;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublisher() {
        return publisher;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", publisher='" + publisher + '\'' +
                ", nrPages=" + nrPages +
                ", ID=" + ID +
                '}';
    }

    public Integer getNrPages() {
        return nrPages;
    }

    public Integer getID() {
        return ID;
    }

    @Override
    public int compareTo(Book book) {
        return this.getNrPages().compareTo(book.getNrPages());
    }

    public static Comparator<Book> idComparator = new Comparator<Book>() {
        @Override
        public int compare(Book b1, Book b2) {
            return b1.getID() - b2.getID();
        }
    };
}
