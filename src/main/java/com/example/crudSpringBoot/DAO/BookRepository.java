package com.example.crudSpringBoot.DAO;

import com.example.crudSpringBoot.Entity.Book;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BookRepository extends MongoRepository<Book, Integer> {
}
