package com.jeremyakatsa.lookify.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jeremyakatsa.lookify.models.Song;
import com.jeremyakatsa.lookify.services.SongService;

@RestController
public class SongApi {
	private final SongService songService;
	 
	 public SongApi(SongService service){
	     this.songService = service;
	 }
	 
	 @RequestMapping("/api/songs")
	 public List<Song> index() {
	     return songService.allSongs();
	 }
	 
	 @RequestMapping(value="/api/songs", method=RequestMethod.POST)
	 public Song create(@RequestParam(value="name") String name, @RequestParam(value="title") String title, @RequestParam(value="rating") Integer rating) {
	     Song song = new Song(name, title, rating);
	     return songService.createSong(song);
	 }
	 
	 @RequestMapping("/api/songs/{id}")
	 public Song show(@PathVariable("id") Long id) {
	     Song song = songService.findSong(id);
	     return song;
	 }
//	 @RequestMapping(value="/api/books/{id}", method=RequestMethod.PUT)
//	    public Book update(@PathVariable("id") Long id, @RequestParam(value="title") String title, @RequestParam(value="description") String desc, @RequestParam(value="language") String lang, @RequestParam(value="pages") Integer numOfPages) {
//		 Book book = new Book(title, desc, lang, numOfPages);
//		 return bookService.createBook(book);
//	    }
	    
	    @RequestMapping(value="/api/songs/{id}", method=RequestMethod.DELETE)
	    public void delete(@PathVariable("id") Long id) {
	        songService.deleteSong(id);
	    }
}
