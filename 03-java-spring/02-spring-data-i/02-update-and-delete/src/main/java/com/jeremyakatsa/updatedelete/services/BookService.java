package com.jeremyakatsa.updatedelete.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.jeremyakatsa.updatedelete.models.Book;
import com.jeremyakatsa.updatedelete.repositories.BookRepository;

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
	 public Book findBookByIndex(Long id) {
	     Optional<Book> optionalBook = bookRepository.findById(id);
	     
	     if(optionalBook.isPresent()) {
	         return optionalBook.get();
	     } 
	     else {
	         return null;
	     }
	 }

		
//		 public Book updateBook(Long id, Book book) { return bookRepository.save(id,
//		 book); 
//		 }
		 
	 public void deleteBook(Long id) {
	      bookRepository.deleteById(id);
	     }
	     
}
