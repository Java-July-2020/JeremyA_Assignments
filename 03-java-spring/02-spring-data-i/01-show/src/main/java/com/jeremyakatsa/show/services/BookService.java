package com.jeremyakatsa.show.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.jeremyakatsa.show.models.Book;
import com.jeremyakatsa.show.repositories.BookRepository;

@Service
public class BookService {
	private final BookRepository bookRepository;
	 public BookService(BookRepository bookRepository) {
	     this.bookRepository = bookRepository;
	 }
	 
	 public List<Book> allBooks() {
	     return bookRepository.findAll();
	 }
	 
	 public Book createBook(Book b) {
	     return bookRepository.save(b);
	 }
	 
	 public Book findBook(Long id) {
	     Optional<Book> optionalBook = bookRepository.findById(id);
	     
	     if(optionalBook.isPresent()) {
	         return optionalBook.get();
	     } 
	     else {
	         return null;
	     }
	 }
}
