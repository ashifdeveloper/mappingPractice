package com.geekster.MappingPractice.service;

import com.geekster.MappingPractice.model.Book;
import com.geekster.MappingPractice.repository.IBookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BookService {
    @Autowired
    IBookRepo bookRepo;

    public String addBook(Book book) {
        bookRepo.save(book);
        return "Book Added Successfully";
    }

    public Iterable<Book> getAllBooks() {
            return bookRepo.findAll();
        }

    public String updateBookById(Long id, String title) {
        Optional<Book> myBookOpt = bookRepo.findById(id);
        Book myBook = null;
        if(myBookOpt.isPresent()){
            myBook = myBookOpt.get();
        }
        else{
            return "Id Not Found";
        }
        myBook.setBookTitle(title);
        bookRepo.save(myBook);
        return "book title Updated";
    }


    public String deleteBookById(Long id) {

            Optional<Book> myBookOpt = bookRepo.findById(id);
            Book myBook = null;
            if(myBookOpt.isPresent()){
                myBook=myBookOpt.get();
            }
            else{
                return "Id Not Found";
            }

            bookRepo.deleteById(id);
            return "Deleted for id "+id;
        
    }
}
