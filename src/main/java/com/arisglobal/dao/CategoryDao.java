package com.arisglobal.dao;

import java.util.ArrayList;

import com.arisglobal.entity.Category;

public interface CategoryDao {
	public Category getCategoryById(int id);
	public ArrayList<Category> getAllCategories();
	public void saveCategory(Category category);
	public void deleteCategory(Category category);
	public void updateCategory(Category category);
	
}
