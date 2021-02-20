package com.example.crudSpringBoot.Service;

import com.example.crudSpringBoot.DAO.BookDAO;
import com.example.crudSpringBoot.Entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Optional;

@Service
public class BookService {
    @Autowired
    private BookDAO bookDAO;

    public Collection<Book> getBooks(){ return  bookDAO.getBooks();}

    public Book createBook (Book book){
        return  bookDAO.createBook(book);
    }


    public Optional<Book> getBookById(int id) {
        return bookDAO.getBookById(id);
    }

    public Optional<Book> deleteBookById(int id) {
        return bookDAO.deleteBookById(id);
    }

}
