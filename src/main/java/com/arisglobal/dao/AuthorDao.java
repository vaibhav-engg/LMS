package com.arisglobal.dao;

import java.util.ArrayList;

import com.arisglobal.entity.Author;

public interface AuthorDao {
	public Author getAuthorById(int id);
	public ArrayList<Author> getAllCategories();
	public void saveAuthor(Author Author);
	public void deleteAuthor(Author Author);
	public void updateAuthor(Author Author);
	
}
