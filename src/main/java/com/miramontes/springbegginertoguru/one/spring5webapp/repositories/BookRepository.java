package com.miramontes.springbegginertoguru.one.spring5webapp.repositories;

import com.miramontes.springbegginertoguru.one.spring5webapp.model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
