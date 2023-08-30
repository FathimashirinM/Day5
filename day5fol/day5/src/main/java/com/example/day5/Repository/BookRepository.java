package com.example.day5.Repository;



import org.springframework.data.jpa.repository.JpaRepository;

import com.example.day5.Entity.BookEntity;

public interface BookRepository extends JpaRepository<BookEntity, Integer> {

}