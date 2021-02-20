package com.example.crudSpringBoot.controller;

import com.example.crudSpringBoot.Entity.Book;
import com.example.crudSpringBoot.Service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.Optional;

@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    private BookService bookService;


    @GetMapping
    public Collection<Book> getBook(){ return  bookService.getBooks();}

    @PostMapping()
    public Book postBook(@RequestBody Book book){
        return  bookService.createBook(book);

    }

    @GetMapping(value="/{id}")
    public Optional<Book> getBookById(@PathVariable("id") int id) {
        return bookService.getBookById(id);
    }

    @DeleteMapping(value="/{id}")
    public Optional<Book> deleteBookById(@PathVariable("id") int id) {
        return bookService.deleteBookById(id);
    }






}
