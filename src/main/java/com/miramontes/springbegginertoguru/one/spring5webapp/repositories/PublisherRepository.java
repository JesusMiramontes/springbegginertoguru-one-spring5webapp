package com.miramontes.springbegginertoguru.one.spring5webapp.repositories;

import com.miramontes.springbegginertoguru.one.spring5webapp.model.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
