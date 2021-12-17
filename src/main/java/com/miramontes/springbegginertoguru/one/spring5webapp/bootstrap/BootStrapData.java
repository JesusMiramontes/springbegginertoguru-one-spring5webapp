package com.miramontes.springbegginertoguru.one.spring5webapp.bootstrap;

import com.miramontes.springbegginertoguru.one.spring5webapp.model.Author;
import com.miramontes.springbegginertoguru.one.spring5webapp.model.Book;
import com.miramontes.springbegginertoguru.one.spring5webapp.repositories.AuthorRepository;
import com.miramontes.springbegginertoguru.one.spring5webapp.repositories.BookRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

// Let Spring know to use this component.
@Component
public class BootStrapData implements CommandLineRunner {

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;

    // Will do dependency injection and inject an instance of author repository and book repository.
    public BootStrapData(AuthorRepository authorRepository, BookRepository bookRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Author a1 = new Author("Name1", "LastName1");
        Book b1 = new Book("Title1", "isbn1");
        a1.getBooks().add(b1);
        b1.getAuthors().add(a1);

        authorRepository.save(a1);
        bookRepository.save(b1);

        Author a2 = new Author("Name2", "LastName2");
        Book b2 = new Book("Title2", "isbn2");
        a2.getBooks().add(b2);
        b2.getAuthors().add(a2);

        authorRepository.save(a2);
        bookRepository.save(b2);

        System.out.println("bookRepository.count() = " + bookRepository.count());
    }
}
