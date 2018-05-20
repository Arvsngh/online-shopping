package com.arv.shoppingBackend.dao;

import java.util.List;

import com.arv.shoppingBackend.dto.Category;

public interface CategoryDAO {
  
	List<Category> list();
	
	Category get(int id);
	
}
	