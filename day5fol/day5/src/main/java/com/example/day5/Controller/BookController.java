package com.example.day5.Controller;




import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.day5.Entity.BookEntity;
import com.example.day5.Service.BookService;

@RestController
public class BookController {

	@Autowired
	BookService bookservice;
	
	@GetMapping("show")
	public List<BookEntity> show()
	{
		return bookservice.showinfo();
	}
	
	@GetMapping("show/{id}")
	public Optional<BookEntity> showbyid(@PathVariable int id)
	{
		return bookservice.getbyid(id);
	}
	
	@PostMapping("post")
	public List<BookEntity> posting(@RequestBody List<BookEntity> bookentity)
	{
		return bookservice.postinfo(bookentity);
	}
	
	@PutMapping("update")
	public BookEntity update(@RequestBody BookEntity bookentity)
	{
		return bookservice.putinfo(bookentity);
	}
	
	@DeleteMapping("delete")
	public String delete(@RequestBody BookEntity bookentity)
	{
		bookservice.deleteinfo(bookentity);
		return "deleted Successfully";
	}
	
	@DeleteMapping("delete/{id}")
	public String deleteid(@PathVariable int id)
	{
		bookservice.deletebyid(id);
		return "id: "+id+" is deleted successfully";
	}
	
}