package com.miramontes.springbegginertoguru.one.spring5webapp.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Data
@Entity
// Implemented to avoid circular dependency.
@EqualsAndHashCode(exclude="authors")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String title;
    private String isbn;

    @ManyToMany
    @JoinTable(name = "author_book",
        joinColumns = @JoinColumn(name = "book_id"),
        inverseJoinColumns = @JoinColumn(name = "author_id"))
    private Set<Author> authors = new HashSet<>();

    public Book(String title, String isbn) {
        this.title = title;
        this.isbn = isbn;
    }
}
