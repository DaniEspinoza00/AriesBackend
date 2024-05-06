package com.ariesbookshop.apirest.BookList.BooksService;

import java.util.List;

import com.ariesbookshop.apirest.BookList.Books.Book;

public interface BookService {
    Book save (Book book); //creo que este no lo necesito, pero bue...
    List<Book> findAll();
    Book findById (Integer id);
    void deleteById (Integer id);
    Book update (Book book);

}