package com.miramontes.springbegginertoguru.one.spring5webapp.bootstrap;

import com.miramontes.springbegginertoguru.one.spring5webapp.model.Author;
import com.miramontes.springbegginertoguru.one.spring5webapp.model.Book;
import com.miramontes.springbegginertoguru.one.spring5webapp.model.Publisher;
import com.miramontes.springbegginertoguru.one.spring5webapp.repositories.AuthorRepository;
import com.miramontes.springbegginertoguru.one.spring5webapp.repositories.BookRepository;
import com.miramontes.springbegginertoguru.one.spring5webapp.repositories.PublisherRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

// Let Spring know to use this component.
@Component
public class BootStrapData implements CommandLineRunner {

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;
    private final PublisherRepository publisherRepository;

    // Will do dependency injection and inject an instance of author repository and book repository.
    public BootStrapData(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Publisher p1 = new Publisher("Name1", "Address1", "City1", "State1", "zip1");
        publisherRepository.save(p1);

        Author a1 = new Author("Name1", "LastName1");
        Book b1 = new Book("Title1", "isbn1");
        a1.getBooks().add(b1);
        b1.getAuthors().add(a1);

        b1.setPublisher(p1);
        p1.getBooks().add(b1);

        authorRepository.save(a1);
        bookRepository.save(b1);


        Publisher p2 = new Publisher("Name2", "Address2", "City2", "State2", "zip2");
        publisherRepository.save(p2);

        Author a2 = new Author("Name2", "LastName2");
        Book b2 = new Book("Title2", "isbn2");
        a2.getBooks().add(b2);
        b2.getAuthors().add(a2);

        b2.setPublisher(p2);
        p2.getBooks().add(b2);

        authorRepository.save(a2);
        bookRepository.save(b2);

        System.out.println("bookRepository.count() = " + bookRepository.count());
    }
}
