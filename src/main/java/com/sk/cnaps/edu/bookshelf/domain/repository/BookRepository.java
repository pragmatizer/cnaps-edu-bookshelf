package com.sk.cnaps.edu.bookshelf.domain.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.sk.cnaps.domain.repository.AggregateRepository;
import com.sk.cnaps.edu.bookshelf.domain.model.Book;

@RepositoryRestResource(collectionResourceRel="books", path="books")
public interface BookRepository extends PagingAndSortingRepository<Book, Long>, AggregateRepository<Book> {
}
