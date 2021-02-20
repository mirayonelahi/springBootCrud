package com.example.crudSpringBoot.DAO;

import com.example.crudSpringBoot.Entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.Optional;

@Component
public class BookDAO {

    @Autowired
    private  BookRepository repository;
    public Collection<Book> getBooks(){
        return  repository.findAll();
    }
    public Book createBook (Book book) { return  repository.insert(book);}


    public Optional<Book> getBookById(int id) {
        return repository.findById(id);
    }

    public Optional<Book> deleteBookById(int id) {
        Optional<Book> book = repository.findById(id);
        book.ifPresent(b -> repository.delete(b));
        return book;
    }


}
