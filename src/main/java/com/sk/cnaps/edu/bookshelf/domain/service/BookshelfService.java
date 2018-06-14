package com.sk.cnaps.edu.bookshelf.domain.service;

import com.sk.cnaps.edu.bookshelf.domain.model.Book;
import com.sk.cnaps.edu.bookshelf.domain.model.Bookshelf;

public interface BookshelfService {
	Book findBookWithAuthorsById(Long id);
	Bookshelf findBookshelfWithBooksById(Long id);
}
