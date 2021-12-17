package com.miramontes.springbegginertoguru.one.spring5webapp.model;

import lombok.Data;

import java.util.Set;

@Data
public class Author {
    private String firstName;
    private String lastName;
    private Set<Book> books;

    public Author(String firstName, String lastName, Set<Book> books) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.books = books;
    }
}
