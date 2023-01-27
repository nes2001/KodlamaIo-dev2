package coursesProject.business.concretes;

import coursesProject.business.abstracts.ICategoryService;
import coursesProject.core.logging.abstracts.Logger;
import coursesProject.core.utils.BusinessRule;
import dataAccess.abstracts.IEntityDao;
import entities.Category;

public class CategoryManager implements ICategoryService{

	
	
	private final IEntityDao ientityDao;
	private final Logger[]loggers;
	
	
	public CategoryManager(IEntityDao ientityDao, Logger[] loggers) {
		this.ientityDao = ientityDao;
		this.loggers = loggers;
	}


	@Override
	public void add(Category category) {

		BusinessRule.run("This category name already exist,please try to add another category", checkIfCategoryNameExists(category));
		ientityDao.add(category);
		for(Logger logger:loggers) {
			logger.log("Category");
		}
		
	}


	public boolean checkIfCategoryNameExists(Category category) {
		
		Category[] categories= {
				new Category(1," Programming"),
				new Category(2,"Music"),
				new Category(3,"Grapich Design"),
				new Category(4,"Language")
				
		};
		for (Category ctgry:categories) {
			if(ctgry.getName().equals(category.getName()))
				return true;
		}
		
		
		
		
		
		
		
		
		
		return false;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
