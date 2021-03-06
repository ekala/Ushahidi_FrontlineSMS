package com.ushahidi.plugins.mapping.data.repository;

import java.util.List;

import com.ushahidi.plugins.mapping.data.domain.Category;
import com.ushahidi.plugins.mapping.data.domain.MappingSetup;

import net.frontlinesms.data.DuplicateKeyException;

public interface CategoryDao {
		
	public List<Category>getAllCategories(int startIndex, int limit);
	
	public List<Category> getAllCategories();
	
	public void saveCategory(Category category) throws DuplicateKeyException;
	
	public void saveCategory(List<Category> categories);
	
	public void flush();
	
	public int getCount();
	
	public Category findCategory(long frontendId, MappingSetup setup);
	
	public Category getCategory(long id);

}
