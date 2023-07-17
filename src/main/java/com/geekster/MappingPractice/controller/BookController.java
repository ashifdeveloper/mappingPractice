package com.geekster.MappingPractice.controller;

import com.geekster.MappingPractice.model.Book;
import com.geekster.MappingPractice.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class BookController {
    @Autowired
    BookService bookService;


    @PostMapping("book")
    public String addBook(@RequestBody Book book){
        return bookService.addBook(book);
    }

    @GetMapping("books")
    public Iterable<Book> getAllBooks(){
        return bookService.getAllBooks();
    }


    @PutMapping("book/{id}/{name}")
    public String updateBookById(@PathVariable Long id,@PathVariable String name){
        return bookService.updateBookById(id,name);


    }


    @DeleteMapping("books/{id}")
    public String deleteBookById(@PathVariable Long id){
        return bookService.deleteBookById(id);
    }


}
