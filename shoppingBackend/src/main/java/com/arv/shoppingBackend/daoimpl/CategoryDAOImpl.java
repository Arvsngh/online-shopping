package com.arv.shoppingBackend.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.arv.shoppingBackend.dao.CategoryDAO;
import com.arv.shoppingBackend.dto.Category;

@Repository("categoryDAO")
public class CategoryDAOImpl implements CategoryDAO
{
	private static List<Category> categories = new ArrayList<>();
	
	static
	{
		Category category = new Category();
		category.setId(1);
		category.setName("Television");
		category.setDescription("Descripton of Television");
		category.setImageURL("img");
		category.setActive(true);
		
		categories.add(category);
		
		category = new Category();
		category.setId(2);
		category.setName("Mobile");
		category.setDescription("Descripton of Mobile");
		category.setImageURL("img");
		category.setActive(true);
		
		categories.add(category);
		
		category = new Category();
		category.setId(3);
		category.setName("Laptop");
		category.setDescription("Descripton of Laptop");
		category.setImageURL("img");
		category.setActive(true);
		
		categories.add(category);
		
		
		
		
	}

	@Override
	public List<Category> list() {
		// TODO Auto-generated method stub
		return categories;
	}

	@Override
	public Category get(int id) {
		
		for(Category category : categories)
		{
			if(category.getId() == id)
			{
				return category;
			}
		}
		return null;
	}
	 
	

}
