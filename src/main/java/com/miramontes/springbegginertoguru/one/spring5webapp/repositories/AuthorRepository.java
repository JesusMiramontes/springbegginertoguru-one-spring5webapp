package com.miramontes.springbegginertoguru.one.spring5webapp.repositories;

import com.miramontes.springbegginertoguru.one.spring5webapp.model.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
