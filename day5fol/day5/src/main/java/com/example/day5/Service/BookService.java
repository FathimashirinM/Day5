package com.example.day5.Service;





import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.day5.Entity.BookEntity;
import com.example.day5.Repository.BookRepository;

@Service
public class BookService {

	@Autowired
	BookRepository bookrepository;
	public List<BookEntity> showinfo()
	{
		return bookrepository.findAll();
	}
	public List<BookEntity> postinfo(List<BookEntity> bookentity)
	{
		return bookrepository.saveAll(bookentity);
	}
	
	public BookEntity putinfo(BookEntity bookentity)
	{
		return bookrepository.saveAndFlush(bookentity);
	}
	
	public void deleteinfo(BookEntity bookentity)
	{
		bookrepository.delete(bookentity);
	}
	
	public Optional<BookEntity> getbyid(int id)
	{
		return bookrepository.findById(id);
	}
	
	public void deletebyid(int id)
	{
		bookrepository.deleteById(id);
	}
	
}