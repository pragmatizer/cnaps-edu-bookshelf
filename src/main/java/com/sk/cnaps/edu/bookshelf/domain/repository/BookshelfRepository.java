package com.sk.cnaps.edu.bookshelf.domain.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.sk.cnaps.domain.repository.AggregateRepository;
import com.sk.cnaps.edu.bookshelf.domain.model.Bookshelf;

@RepositoryRestResource(collectionResourceRel="bookshelves", path="bookshelves")
public interface BookshelfRepository extends PagingAndSortingRepository<Bookshelf, Long>, AggregateRepository<Bookshelf> {
}
