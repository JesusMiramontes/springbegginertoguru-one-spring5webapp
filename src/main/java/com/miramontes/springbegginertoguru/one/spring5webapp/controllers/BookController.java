package com.miramontes.springbegginertoguru.one.spring5webapp.controllers;

import com.miramontes.springbegginertoguru.one.spring5webapp.repositories.BookRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller // Spring MVC Controller.
public class BookController {

    private final BookRepository bookRepository;

    // Injecting an instance of Book repository.
    public BookController(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @RequestMapping("/books")
    public String getBooks(Model model){
        model.addAttribute("books", bookRepository.findAll());
        return "books";
    }
}
