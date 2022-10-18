package business;

import java.util.ArrayList;
import java.util.List;

import core.logging.Logger;
import dataAccess.CategoryDao;
import entities.Category;

public class CategoryManager {
	private CategoryDao _categoryDao;
	private Logger []_loggers;
	private List<String> categoryNames = new ArrayList<>();
	public CategoryManager(Logger[] loggers, CategoryDao categoryDao) 
	{
		_categoryDao = categoryDao;
		_loggers= loggers;
	}
	
	public void add(Category category) 
	{ if (categoryNames.size() ==0) 
	{
		categoryNames.add(category.getCourseCategory());
		_categoryDao.add(category);
		for(Logger logger: _loggers) 
		{
			logger.log(category.getCourseCategory());
		}
	}
	else 
	{
		for(String name: categoryNames) 
		{
			if(name.equals(category.getCourseCategory())) {
			System.out.println("bu kategori daha önce eklenmiş :" + category.getCourseCategory());
			break;}
			else 
			{
				_categoryDao.add(category);
				for(Logger logger:_loggers) 
				{
					logger.log(category.getCourseCategory());
				}
			}
		}
		
		
			
			
		
	}
		
	}//add methoduna ait parantez

}
