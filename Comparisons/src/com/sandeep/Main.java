package com.sandeep;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        books.add(new Book("preeti", "wallposter", 500, 24));
        books.add(new Book("Chetan", "arka", 200, 45));
        books.add(new Book("bhagar", "svcc", 300, 27));
        books.add(new Book("naani", "wallposter", 100, 25));

//        Collections.sort(books);
//        for (Book book : books) {
//            System.out.println(book);
//        }

        books.sort(Book.idComparator);
        for (Book book : books) {
            System.out.println(book);
        }
    }
}
