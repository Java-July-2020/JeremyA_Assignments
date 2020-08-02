package com.jeremyakatsa.updatedelete.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.jeremyakatsa.updatedelete.models.Book;
import com.jeremyakatsa.updatedelete.services.BookService;

@Controller
public class BookController {
	 private final BookService bookService;
	 
	 public BookController(BookService bookService) {
	     this.bookService = bookService;
	 }
	 
	 @RequestMapping("/books") 
	 public String index(Model model) { 
		 List<Book> books = bookService.allBooks();
		 model.addAttribute("books", books); 
		 return "/books/index.jsp"; 
	 }
	 
	 
	  @RequestMapping("/books/new")
	  public String newBook(@ModelAttribute("book") Book book) {
	      return "/books/new.jsp";
	  }
	  
		 
	  @RequestMapping(value="/books", method=RequestMethod.POST)
	  public String create(@Valid @ModelAttribute("book") Book book, BindingResult result) {
	      if (result.hasErrors()) {
	          return "/books/new.jsp";
	      } else {
	          bookService.createBook(book);
	          return "redirect:/books";
	      }
	  }
	  
	  @RequestMapping("/books/{id}")
	  public String findBookByIndex(Model model, @PathVariable("id") Long id) {
	      Book book = bookService.findBook(id);
	      model.addAttribute("book", book);
	      return "showBook.jsp";
	  }
//	@PostMapping("/books/edit/{id}")
//	  public String updateBook(@PathVariable("id") Long id, @Valid @ModelAttribute("book") Book book, BindingResult result) {
//	      if (result.hasErrors()) {
//	          return "edit.jsp";
//	      }else{
//	          bookService.updateBook(id, book);
//	          return "redirect:/books";
//	      }
//	  }
	@RequestMapping(value="/books/delete/{id}")
	  public String deleteBook(@PathVariable("id") Long id) {
	      bookService.deleteBook(id);
	      return "redirect:/books";
	  }
}
