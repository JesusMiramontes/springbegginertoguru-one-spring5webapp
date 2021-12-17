package com.miramontes.springbegginertoguru.one.spring5webapp.model;

import lombok.Data;

import java.util.Set;

@Data
public class Book {
    private String title;
    private String isbn;
    private Set<Author> authors;

    public Book(String title, String isbn, Set<Author> authors) {
        this.title = title;
        this.isbn = isbn;
        this.authors = authors;
    }
}
